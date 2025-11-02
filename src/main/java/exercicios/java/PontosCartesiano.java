package exercicios.java;
import java.util.Scanner;

public class PontosCartesiano{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Informe a coordenada (x1) e (y1) do ponto A");

        // Cordenada (x1) do ponto A
        System.out.print("Cordenada (x1): ");
        int x1 = input.nextInt();

        // Cordenada (y1) do ponto A
        System.out.print("Cordenada (y¹): ");
        int y1 = input.nextInt();  

        System.out.println("Informe a coordenada (x2) e (y2) do ponto B");

        // Cordenada (x2) do ponto B
        System.out.print("Cordenada (x2): ");
        int x2 = input.nextInt();

        // Cordenada (y2) do ponto A
        System.out.print("Cordenada (y2): ");
        int y2 = input.nextInt();
        
        input.close();
        
        int diferencaX = (x1 - x2);
        int diferencaY = (y1 - y2);
           
        System.out.println("Encontrando a diferença entre x¹-x² e y¹-y²...");
        System.out.println("Diferença em x: " + diferencaX * (-1));
        System.out.println("Diferença em y: " + diferencaY * (-1));
        System.out.println("elevando os vlores ao quadrado... ");
        int expoenteX = diferencaX * diferencaX;
        int expoenteY = diferencaY * diferencaY;
        int soma = expoenteX + expoenteY;
        double resultado = Math.sqrt(soma);
        
        System.out.println("A distância entre os pontos A e B é: " + resultado + " unidades");
    }
}