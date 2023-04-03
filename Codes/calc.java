public class MyClass {
    public static void main(String args[]) {
        // dados do retângulo:
        int base = 9;
        int altura = 10;
        int retangulo = base * altura;
        
        // dados do quadrado:
        int lado = 9;
        int quadrado = lado * lado;
        
        // Verificar a área
        boolean compararArea = quadrado > retangulo;

        System.out.println("8. Área do retângulo: " + retangulo);
        System.out.println("9. Área do quadrado: " + quadrado);
        System.out.println("10. A área do quadrado é maior que a do retângulo? " + compararArea);
        System.out.println("11. A área do quadrado é: " + quadrado + ". Ja a área do retângulo é: " + retangulo);
        // ex 12 - condicional
        if (quadrado > retangulo) {
            System.out.println("12. Área do quadrado é maior");
        } else {
            System.out.println("12. Área do retângulo é maior");
        }
    }
}
