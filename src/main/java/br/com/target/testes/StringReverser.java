package br.com.target.testes;
import java.util.Scanner;
public class StringReverser {
    public static void main(String[] args) {
        // Entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String input = scanner.nextLine();

        // Lógica para inverter a string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Saída do resultado
        System.out.println("String invertida: " + reversed);

        scanner.close();
    }
}
