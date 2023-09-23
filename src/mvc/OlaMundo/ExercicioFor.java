package mvc.OlaMundo;

public class ExercicioFor{
	

	//* 1 Escreva um programa que mostre todos os numeros entre 1 e 100; *//

public static void main(String[] args) {
	for(int indice = 1; indice <= 100; indice++) {
		System.out.println(indice);
	}
	System.out.println("Fim da aplicação");


//* 2 Escreva um programa que apresente todos os números ímpares entre 1 e 100; *//

    for(int indice = 1; indice <= 100; indice++) {
        if(indice % 2 != 0) {
            System.out.println(indice);
        }
    }


//* 3 Escreva um programa que mostre na tela o desenho abaixo
// X
//XX
// XXX
// XXXX
// XXXXX
//*

		for (int i = 0; i <= 5; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print("X");
			}
			System.out.println("");
		}
	
    
    
	
	
//	4. Escreva um programa que mostre na tela o desenho abaixo:
//	mostreTelaDesenhoAbaixo$();*//
    
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("$");
			}
			System.out.println("");
		}
	}


//* 5. Escreva um programa que calcule e escreva o resultado da soma dos números entre 1 e 50.*//

	int resultado = 0;
	for (int i = 1; i <= 50; i++) {
		resultado += i;
	}
	System.out.println(resultado);
}
}

