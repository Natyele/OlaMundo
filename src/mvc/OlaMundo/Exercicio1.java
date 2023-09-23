package mvc.OlaMundo;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

//		1. Escreva um programa que solicite um número para o usuário e em seguida escreva uma
//		mensagem informando se o número informado é múltiplo de 5. Para que um número seja
//		múltiplo de 5, ele deve ser maior ou igual a 5 e o resto da divisão por 5 deve ser igual a zero.

		// aqui eu instanciei a classe scanner do java
		Scanner scanner = new Scanner(System.in);
		// digito a mensagem que aparece para o usuario
		System.out.println("Digite um número");
		// aqui pego o numero que o usuario digitou e salvo na variavel valor
		int valor = scanner.nextInt();
		// aqui eu descubro se o numero que o usuario digitou é multiplo de 5
		if (valor >= 5 && valor % 5 == 0) {
			// digito a mensagem que aparece para o usuario
			System.out.println("Número é multiplo de 5");
		} else {

			System.out.println("O numero não é multiplo de 5");
		}

// 2. Escreva um programa que leia um número informado pelo usuário e em seguida escreva uma
// mensagem indicando se o número é par ou impar. (Considere número par o número cujo resto
// da divisão por 2 seja igual a Zero

		// Escreva um programa que leia um número informado pelo usuário 
		System.out.println("Digite um numero");
	      //Aqui eu prgo o valor que o usuario digitou e salvo na variavel numeroUsuario
		int numeroUsuario = scanner.nextInt();
		// e em seguida escreva uma  mensagem indicando se o número é par ou impar. (Considere número par o número cujo resto
		 // da divisão por 2 seja igual a Zero
		if (numeroUsuario % 2 == 0) {
			System.out.println("Numero é par");
		} else {
			System.out.println("Numero é impar");

		}

//3. Escreva um programa que solicite a idade do usuário e em seguida escreva a mensagem ‘Você é
// adulto!’ caso a idade informada seja maior ou igual a 18.

		System.out.println("Digite sua idade");
		int idade = scanner.nextInt();
		if (idade >= 18) {
			System.out.println("Você é adulto!");

		}

//4. Escreva um programa que solicite a nota de um aluno e em seguida escreva a mensagem
// “Aprovado” caso a nota seja igual ou maior que 6, senão escreva a mensagem “Reprovado”.

		System.out.println("Digite a nota do aluno");
		int nota = scanner.nextInt();
		if (nota >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

//5. Escreva um programa que solicite as 3 notas de um aluno e em seguida calcule o valor da média
// das notas. Caso a média seja maior ou igual a 9 escreva a mensagem “Conceito A”, caso a nota
// seja menor que 9 e maior ou igual a 7 escreva a mensagem “Conceito B”, caso a nota seja menor
// que 7 e maior ou igual a 5 escreva a mensagem “Conceito C”, se a nota for menor que 5 escreva
// a mensagem “Conceito Insuficiente”.
		
		    System.out.println("Digite a primeira nota: ");
		    double nota1 = scanner.nextDouble();
		    System.out.println("Digite a segunda nota: ");
		    double nota2 = scanner.nextDouble();
		    System.out.println("Digite a terceira nota: ");
		    double nota3 = scanner.nextDouble();

		    double media = (nota1 + nota2 + nota3) / 3;
	}
}
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    

		
		
		
		
		
		
		
		
		
		
		
	