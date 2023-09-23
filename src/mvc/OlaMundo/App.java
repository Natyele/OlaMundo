package mvc.OlaMundo;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nomeUsuario = scanner.nextLine();
		System.out.println("O nome digitado foi "+ nomeUsuario);
		scanner.close();
		
		System.out.println("Digite o primeiro numero");
		double numero = Double.parseDouble(scanner.nextLine());
		System.out.println("Digite o segundo numero");
		double segundoNumero numero = Double.parseDouble(scanner.nextLine());
		double soma = numero + segundoNumero;
		String mensagem = String.format("Oresultado da soma de %f + %f é %f", numero, segundoNumero, soma);
		System.out.println(mensagem);
		scanner.close();
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
