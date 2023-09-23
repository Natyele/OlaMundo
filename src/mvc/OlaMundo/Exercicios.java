package mvc.OlaMundo;

public class Exercicios {
	public static void main(String[] args) {
		/*
		 * 1. Dado o código abaixo, complete-o escrevendo o resultado das seguintes operações:
         a. x && x;
         b. x && y;
         c. y || z;
         d. y || x;
         e. !z;
         f. !z && x;
         g. z ^ x;
         h. x ^ y
		 */
		
		boolean x = true;
		boolean y = true;
		boolean z = false;
		
		System.out.println(x && x);
		System.out.println(x && y);
		System.out.println(y || x);
		System.out.println(!z);
		System.out.println(!z && x);
		System.out.println(z ^ x);
		System.out.println(x ^ y);
	}
		
	}