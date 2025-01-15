package br.com.target.testes;
import java.util.Scanner;

//Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o
// próximo valor sempre será a soma dos 2 valores anteriores
// (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um
// programa na linguagem que desejar onde, informado um número,
// ele calcule a sequência de Fibonacci e retorne uma mensagem
// avisando se o número informado pertence ou não a sequência.
public class FibonacciChecker {
// Método para verificar se um número pertence à sequência de Fibonacci
	public static boolean isFibonacci(int num) {
		int a = 0, b = 1;

		while (a <= num) {
			if (a == num) {
				return true; // Número encontrado na sequência
			}
			// Atualiza os valores para o próximo termo
			int next = a + b;
			a = b;
			b = next;
		}

		return false; // Número não encontrado
	}

	public static void main(String[] args) {
		// Entrada do usuário
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
		int numero = scanner.nextInt();

		// Verifica e exibe o resultado
		if (isFibonacci(numero)) {
			System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
		}

		scanner.close();
	}
}