public class Aritmeticos {
    public static void main(String[] args) {

        // Operadores aritméticos
        int a = 10;
        int b = 3;
        System.out.println("=== Operadores Aritméticos ===");
        System.out.println("a + b = " + (a + b)); // Suma
        System.out.println("a - b = " + (a - b)); // Resta
        System.out.println("a * b = " + (a * b)); // Multiplicación
        System.out.println("a / b = " + (a / b)); // División entera
        System.out.println("a % b = " + (a % b)); // Módulo (resto)

        // Operadores de comparación
        System.out.println("\n=== Operadores de Comparación ===");
        System.out.println("a == b : " + (a == b)); // Igualdad
        System.out.println("a != b : " + (a != b)); // Diferente
        System.out.println("a > b  : " + (a > b)); // Mayor que
        System.out.println("a < b  : " + (a < b)); // Menor que
        System.out.println("a >= b : " + (a >= b)); // Mayor o igual
        System.out.println("a <= b : " + (a <= b)); // Menor o igual

        // Operadores lógicos
        boolean x = true;
        boolean y = false;
        System.out.println("\n=== Operadores Lógicos ===");
        System.out.println("x && y = " + (x && y)); // AND lógico
        System.out.println("x || y = " + (x || y)); // OR lógico
        System.out.println("!x     = " + (!x)); // NOT lógico

        // Ejemplo práctico combinando todos
        System.out.println("\n=== Ejemplo combinado ===");
        int edad = 20;
        boolean tieneID = true;

        if (edad >= 18 && tieneID) {
            System.out.println("✅ Puede ingresar al evento.");
        } else {
            System.out.println("❌ No puede ingresar.");
        }
    }
}
