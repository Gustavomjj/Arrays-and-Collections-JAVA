package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {	
	public static void main(String[] args) {

		System.out.println("----------------------------");
		System.out.println("Calculadora de média da sala");
		System.out.println("----------------------------");
		System.out.println();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite quantos alunos tem na sala de aula: ");
		int qtdalunos = entrada.nextInt();
		
		System.out.println("Digite quantas avaliações tiveram no semestre: ");
		int qtdavaliacoes = entrada.nextInt();
		
		double total = 0;
		double totalnotas = 0;
		
		double [][] NotasAlunos = new double [qtdalunos] [qtdavaliacoes];
			for (int a = 0; a < qtdalunos ; a++) {	
					for (int i = 0; i < qtdavaliacoes; i++) {
						System.out.println("Digite a " + (i+1) + "a nota do " + (a+1) + "o aluno: ");
						NotasAlunos[a][i] = entrada.nextDouble();
						total += NotasAlunos[a][i];
						totalnotas += 1; 					
					}
				System.out.println();
			}
	
			double media = total / totalnotas;
			
			System.out.println(" A média da turma é: " + media);
			
			for (double [] notas: NotasAlunos) {
				System.out.println(Arrays.toString(notas));	
			}
			
		entrada.close();
	}

}
