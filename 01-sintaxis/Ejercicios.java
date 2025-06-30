public class Ejercicios {

    public static final double IVA = 0.19;

    public static void main(String[] args) {

        System.out.println("\n=== Operadores Lógicos ===");

        boolean x = true;
        boolean y = false;

        System.out.println("x && y = " + (x && y)); // AND lógico
        System.out.println("x || y = " + (x || y)); // OR lógico
        System.out.println("!x     = " + (!x)); // NOT lógico

        int n1 = 3;
        int n2 = 3;

        if (n1 >= 3 & n2 >= 3) {
            System.out.println("Ambos son mayores o iguales a 3");
        }
        if (n1 != 0 || n2 != 0) {
            System.out.println("Al menos uno de los dos es distinto de 0");
        }

        /// Consta final
        ///
        double precio = 20.500;

        double total = precio * IVA;
        System.out.println("El calor con el IVA es: " + total);

        /// Conversión cast
        double valor = 10.75;
        int entero = (int) valor; // ❗ Conversión manual (pierde decimales). ❌.75
        System.out.println(entero); // 10

        // Esto no es casting, pero se usa mucho:

        String texto = "123";
        int numero = Integer.parseInt(texto); // 123
        double decimal = Double.parseDouble("3.14");

        System.out.println(texto); // 123
        System.out.println(numero); // 123
        System.out.println(decimal); // 3.14

    }
}
