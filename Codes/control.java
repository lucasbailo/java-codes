import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 3:");
        int n = input.nextInt();
        switch (n) {
            case 1:
            System.out.println("Você escolheu 1");
            break;
            case 2:
            System.out.println("Você escolheu 2");
            break;
            case 3:
            System.out.println("Você escolheu 3");
            break;
            default:
            System.out.println("Número inválido");
        }
    }
}
