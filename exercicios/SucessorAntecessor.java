package exercicios;
import java.util.Scanner;  // 1. Importa a classe Scanner

public class SucessorAntecessor {
    public static void main(String[] args) {

        // 2. Cria um objeto Scanner para ler a entrada do usuário
        Scanner leitor = new Scanner(System.in);

        // 3. Pede para o usuário digitar um número
        System.out.print("Digite um núnero");

        // 4. Lê o número inteiro digitado pelo usuário e armazena na variável 'numero'
        int numero = leitor.nextInt();

        // 5. Calcula o antecessor e o sucessor
        int sucessor = numero + 1;
        int antecessor = numero - 1;

        // 6. Imprime os resultados na tela
        System.out.println("O sucessor de " + numero + " é: " + sucessor);
        System.out.println("O antecessor de " + numero + " é: " + antecessor);

        // 7. Fecha o objeto Scanner (boa prática)
        leitor.close();
    }
}
