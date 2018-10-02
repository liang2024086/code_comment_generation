package methodEmbedding.Magic_Trick.S.LYD1391;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.test.common.InputObject;
import com.test.common.MyRejectedExecutionHandlerImpl;
import com.test.common.SharedData;

public class MagicTrick {
	public static void main(String[] args) {
		MagicTrickInputParser inpParser = new MagicTrickInputParser("src/A-small-attempt1");
		ReadInputTask inpTask = new ReadInputTask(inpParser);
		List<MagicTrickOutput> outputList = new ArrayList<MagicTrickOutput>();

		ExecutorService exService = Executors.newSingleThreadExecutor();
		Future<Boolean> callFuture = exService.submit(inpTask);

		BlockingQueue<Runnable> worksQueue = new ArrayBlockingQueue<Runnable>(100);
		RejectedExecutionHandler executionHandler = new MyRejectedExecutionHandlerImpl();

		ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(10, 10, 1,
				TimeUnit.MINUTES, worksQueue, executionHandler);

		int tempCount = 0;
		CountDownLatch clatch = null;
		while(!callFuture.isDone() || SharedData.getInputCount()>SharedData.getOutputCount()){
			if(SharedData.getInputCount()>0 && inpParser.getTestCount() > tempCount){
				InputObject nextInput = SharedData.getNextInput();
				if(nextInput != null){
					if(tempCount == 0){
						clatch = new CountDownLatch(inpParser.getTestCount());
					}

					poolExecutor.execute(new ProcessInputTask((MagicTrickInput)nextInput, clatch));
					tempCount++;
				}
			}else if(SharedData.getInputCount()>0 && inpParser.getTestCount() == tempCount){
				break;
			}else{
				try {
					callFuture.get(5, TimeUnit.SECONDS);
				} catch (InterruptedException | ExecutionException
						| TimeoutException e) {
					e.printStackTrace();
				}
			}
		}
		
		try {
			clatch.await();

			ExecutorService outService = Executors.newSingleThreadExecutor();

			List<ExecutorService> executors = new ArrayList<ExecutorService>();
			executors.add(exService);
			executors.add(poolExecutor);
			executors.add(outService);
			ProcessOutputTask outTask = new ProcessOutputTask(executors);
			Future<Boolean> result = exService.submit(outTask);

			if(result.get())
				System.out.println("Completed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
