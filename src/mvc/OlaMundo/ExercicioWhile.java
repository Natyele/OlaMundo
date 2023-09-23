package mvc.OlaMundo;

import java.util.Scanner;

public class ExercicioWhile {
	
	public static void main(String[] args) {
		  for (int i = 1; i <= 1000; i++) {
		    System.out.println(i);
		  }
	}
}

/*2. Escreva um programa que solicite dois números distintos para o usuário, e em seguida, escreva
todos os números entre o intervalo dos números informados. 
*/


		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o segundo numero: ");
		int numero2 = teclado.nextInt();
				
				if(numero1 > numero2) {
					for (int i = numero1 + 1; i < numero2; i++) {
						System.out.println(i + " ");
					}
					}else if (numero1 > numero2) {
						for (int i = numero2 + 1; i > numero1; i++) {
							System.out.println(i + " ");
						}
						}else {
							System.out.println("Os numeros são iguais, não há numeros entre eles");
						}
						teclado.close();
					}
}

/*3. Escreva todos os números impares entre o número 101 e o número 200 */


  Scanner teclado = new Scanner(System.in);
    for(int i=101; i <= 200; i++) {
        if(i % 2 != 0) {
            System.out.println(i);
        }
    }
}
}
/*4. Escreva um programa que solicite um número ao usuário e em seguida escreva o valor do
número informado multiplicado por 5. O programa deve continuar solicitando novos números
até que o usuário digite um número negativo.
  */
 
static void soliciteNumeroUsuarioEscrevaValorMultiplicadoPorCinco() {
	// Declarei o método scanner para obter o valor do usuário
	Scanner scan = new Scanner(System.in);
	
	// Aqui o usuário digitado o valor
	System.out.println("Digite um número qualquer");
	int numeroParaMultiplicar = Integer.parseInt(scan.nextLine());
	
	// Aqui eu imprimo o resultado do calculo da multiplicação
	// e peço ao usuário o próximo número
	while (numeroParaMultiplicar >= 0) {
		// Calculo da multiplicacao por 5
		int resultado = numeroParaMultiplicar * 5;
		
		System.out.println(numeroParaMultiplicar + " * 5 = " + resultado);
		
		System.out.println("Informe outro número qualquer");
		numeroParaMultiplicar = Integer.parseInt(scan.nextLine());
	}
	scan.close();
}
}




//Ordena os números
int menor = numero1;
int maior = numero2;
if (numero1 > numero2) {
    menor = numero2;
    maior = numero1;
}

// Escreve os números entre o intervalo informado
for (int i = menor + 1; i < maior; i++) {
    System.out.println(i);
}
} else {
System.out.println("Os números digitados não são positivos ou são iguais. Tente novamente.");
}

scanner.close();
}
}









