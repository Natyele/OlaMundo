package mvc.OlaMundo;

import java.util.Scanner;

public class ExerciciosDoWhile {

	// *1. Escreva um programa que escreva os números entre 1000 e 100.

	public static void main(String[] args) {

		int numero = 1000;
		do {
			System.out.println(numero);
			numero--;
		} while (numero >= 100);

//* 2.Escreva um programa que solicite dois números positivos distintos para o usuário, e em
// seguida, escreva todos os número entre o intervalo dos números informados.//*

		Scanner scanner = new Scanner(System.in);

		int numero1, numero2;

		// Solicita o primeiro número
		System.out.println("Digite o primeiro número: ");
		numero1 = scanner.nextInt();

		// Solicita o segundo número
		System.out.println("Digite o segundo número: ");
		numero2 = scanner.nextInt();

		// Verifica se os números são positivos e distintos
		if (numero1 > 0 && numero2 > 0 && numero1 != numero2) {
			// Ordena os números
			int menor = numero1;
			int maior = numero2;
			if (numero1 > numero2) {
				menor = numero2;
				maior = numero1;
			}

			// Escreve os números entre o intervalo informado
			do {

				System.out.println(menor);
				menor++;

			} while (menor <= maior);
		} else {
			System.out.println("Os números digitados não são positivos ou são iguais. Tente novamente.");
		}

		scanner.close();
	}

	// *3 Escreva todos os números pares entre o número 101 e o número 200.*//

	System.out.println("Números pares entre 101 e 200: ");
	
	int numero = 101;

	do
	{
		if (numero % 2 == 0) {
			System.out.println(numero);
		}
		numero++;
	}while(numero<=200);
}
}