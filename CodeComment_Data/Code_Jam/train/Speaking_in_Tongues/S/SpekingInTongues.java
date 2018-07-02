package methodEmbedding.Speaking_in_Tongues.S.LYD284;

import java.util.Scanner;


public class SpekingInTongues {
	
	//	a->y, b->h, c->e, d->s, e->o
	//	f->c, g->v, h->x, i->d, j->u
	//	k->i, l->g, m->l, n->b, o->k
	//	p->r, q->z , r->t, s->n, t->w
	//	u->j, v->p, w->f, x->m, y->a
	//	z->q
	public static final char[] MAPPING_ARRAY = {'y', 'h', 'e', 's', 'o',
												'c', 'v', 'x', 'd', 'u',
												'i', 'g', 'l', 'b', 'k',
												'r', 'z', 't', 'n', 'w',
												'j', 'p', 'f', 'm', 'a',
												'q'};

	
	public static void main(String[] args)  {
			
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine().trim();
		int totalCase = Integer.parseInt(line);
		
		for (int i = 1; i <= totalCase; i++)  {
			line = scanner.nextLine().trim();
			
			String output = "Case #" + i + ": ";
			for (int count = 0; count < line.length(); count++)  {
				char character = line.charAt(count);
				if (character == ' ')  {
					output += " ";
					continue;
				}
				int index = character - 'a';
				char mappedChar = MAPPING_ARRAY[index];
				output += mappedChar;
			}
			
			System.out.println(output);
		}
		
		System.exit(0);
		
	}
}
