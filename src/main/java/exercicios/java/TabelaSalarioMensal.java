package exercicios.java;
import java.util.Scanner;


public class TabelaSalarioMensal {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("--------------------------------------------------");
        System.out.println("              TABELA DE GASTO TIMESTRAL              ");
        System.out.println("--------------------------------------------------");
        
        System.out.println("Informe o valor gasto no 1º mês: ");
        double Mes1 = input.nextDouble();
        
        System.out.println("Informe o valor gasto no 2º mês: ");
        double Mes2 = input.nextDouble();
        
        System.out.println("Informe o valor gasto no 3º mês: ");
        double Mes3 = input.nextDouble();
        
        double resultadoTotal = Mes1 + Mes2 + Mes3;
        double media = (resultadoTotal/3);
        System.out.println("O valor total Gasto no trimestre é: " + resultadoTotal);
        System.out.println("A média gasta é de: " + media);
        
    }
}
