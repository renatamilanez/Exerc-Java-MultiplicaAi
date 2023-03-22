import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número inteiro:");

        try {
            int number = input.nextInt(); 
            System.out.println("Tabela de multiplicação de " + number);
            for(int i=1; i <= 10; i++) {
                int result = i*number;
                System.out.println(i + " * " + number + " = " + result);
            }
        } catch (Exception e) {
            System.out.println("O valor informado não é valido!");
        }
    }
}
