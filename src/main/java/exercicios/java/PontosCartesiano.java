package exercicios.java;
import java.util.Scanner;

public class PontosCartesiano{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Informe a coordenada (a) e (b) do ponto 1");

        // Cordenada (a) do ponto 1
        System.out.print("Cordenada (a): ");
        int P1a = input.nextInt();

        // Cordenada (b) do ponto 1
        System.out.print("Cordenada (b): ");
        int P1b = input.nextInt();  

        System.out.println("Informe a coordenada (c) e (d) do ponto 2");

        // Cordenada (c) do ponto 2
        System.out.print("Cordenada (c): ");
        int P2c = input.nextInt();

        // Cordenada (d) do ponto 2
        System.out.print("Cordenada (d): ");
        int P2d = input.nextInt();
    }
}