package exercicios;
import java.util.Scanner;

public class ConvertCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Título do programa
        System.out.println("------------------------------------------------------");
        System.out.println("         CONVERTENDO DE CELSIUS PARA FAHRENHEINT"      );
        System.out.println("------------------------------------------------------");

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();
        
        // Converte Celsius para Fahrenheit
        double convert = (celsius * 9/5) + 32;

        System.out.println("A temperatura de " + celsius + "°C é igual a " + convert + "°F.");
        input.close();
    }

}