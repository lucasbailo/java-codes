import java.util.Scanner;

public class MyClass {
public static void main(String args[]) {

Scanner scanner = new Scanner(System.in);

int numero, op = 1;

while (op == 1) {
System.out.print("Digite um número: ");
numero = scanner.nextInt();
System.out.print("Digite 1 para continuar, outro número para sair: ");
op = scanner.nextInt();
}
	}
}
