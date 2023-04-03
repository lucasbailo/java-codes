import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
    System.out.println("Digite um número De -9 à 9: ");
        int n = input.nextInt();
        switch (n) {
            case 0:
            System.out.println("Você digitou zero");
            break;
            case 1,2,3,4,5,6,7,8,9:
            System.out.println("Você digitou um número positivo");
            break;
            case -1,-2,,-3,-4,-5,-6,-7,-8,-9:
            System.out.println("Você digitou um número negativo");
            break;
                }
        }
}
