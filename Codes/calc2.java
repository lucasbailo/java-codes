public class MyClass {
    public static void main(String args[]) {
        int base = 9;
        int altura = 10;
        int lado = 9;
        int retangulo = base * altura;
        int quadrado = lado * lado;
        boolean maior = quadrado > retangulo;
        
        System.out.println("A área do retângulo é " + retangulo + " e a área do quadrado é " + quadrado);
        System.out.println("O quadrado é maior que o retângulo? " + maior);
    }
}
