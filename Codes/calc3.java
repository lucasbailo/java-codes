public class MyClass {
    public static void main(String args[]) {
      int x = 10;
      int y = 25;
      int z = x + y;
      String nome = "João";
      float salario1 = 1500.55f;
      float salario2 = 325.65f;
      float salarioTotal = salario1 + salario2;
      String frase = "O salário total de João é: ";

      System.out.println(nome + " tem " + z + " Reais. E seu salário é " + salarioTotal);
      System.out.println(frase + salarioTotal);
    }
}
