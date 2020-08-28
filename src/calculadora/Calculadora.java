package calculadora;

import java.util.Scanner;

public class Calculadora {

    private static Scanner scan;
    
    public static void main(String[] args) {
        double a , b, s, sub, multi, div;
        int op = 0;
        
        scan= new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        a=scan.nextDouble();
        System.out.print("Digite outro número: ");
        b=scan.nextDouble();
          System.out.println("\n1-soma\n2-subtracao\n3-multiplicacao\n4-divisao");
        
        System.out.print("Digite o valor da operacao: ");
        op=scan.nextInt();
        
        
        if(op == 1){
            s = a + b;
            System.out.println("O resultado da soma é: " +s);
        }
        if(op == 2){
            sub = a - b;
            System.out.println("O resultado da subtracao  é: " +sub);
        }
        if(op == 3){
            multi= a * b;
            System.out.println("O resultado da multiplicacao é: " +multi);
        }
        if(op == 4){
            div = a / b;
            System.out.println("O resultado da divisao é: " +div);
        }
    }
    
}
