package exercicios.java;
import java.util.Scanner;
/**
 *
 * @author n3to
 */
public class CalculoSalarial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Digite por favor o valor do seu 'salário': ");
        double salario = input.nextDouble();
        double qtdSalary = (salario/1518);
        
        
        System.out.print("O salário atual é 1518.00 ");
        System.out.println("então se você recebe " + salario + " você ganha " + qtdSalary + " salários");
        
    
    }
}
