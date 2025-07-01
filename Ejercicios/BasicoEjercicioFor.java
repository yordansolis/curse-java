import java.util.Scanner;

public class BasicoEjercicioFor {

    public static final int CANTIDAD_PALABRAS = 3;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= CANTIDAD_PALABRAS; i++) {
            System.out.println("Ingrese las palabras que desea imprimir: ");
            String palabras = entrada.nextLine();
            System.out.println(palabras);
        }

        entrada.close();

        // imprimi los valores del 1 al 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i); // 1, 2, 3, 4, 5
        }

        System.out.println("-------------------");
        // imprimi los valores del 0, 2 al 10
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i); // 0, 2, 4, 6, 8, 10
        }

        System.out.println("-------------------");

        // candena regresiva:
        for (int i = 5; i > 0; i--) {
            System.out.println(i); // 5, 4, 3, 2, 1
        }

        System.out.println("--------- x ----------");

        // Outer loop
        for (int i = 1; i <= 2; i++) { // Se repite 2 veces: i=1, luego i=2
            System.out.println("1. for: " + i); // Imprime esto una vez por cada i
            for (int j = 1; j <= 3; j++) { // Por cada i, j va de 1 a 3
                System.out.println(" 2. for: " + j); // Esto se imprime 3 veces por cada i
            }
        }

        //

        /*
         * 🔁 Primera vuelta: i = 1
         * j = 1 → imprime 1 * 1 = 1
         * j = 2 → imprime 1 * 2 = 2
         * j = 3 → imprime 1 * 3 = 3
         * 
         * 👉 Resultado impreso: 1 2 3 (luego hace salto de línea)
         * 
         * 🔁 Segunda vuelta: i = 2
         * j = 1 → imprime 2 * 1 = 2
         * j = 2 → imprime 2 * 2 = 4
         * j = 3 → imprime 2 * 3 = 6
         * 
         * 👉 Resultado impreso: 2 4 6 (salto de línea)
         * 
         * 🔁 Tercera vuelta: i = 3
         * j = 1 → imprime 3 * 1 = 3
         * j = 2 → imprime 3 * 2 = 6
         * j = 3 → imprime 3 * 3 = 9
         * 
         * 👉 Resultado impreso: 3 6 9 (salto de línea)
         */
        int contador = 0;
        System.out.println("--------- x ----------");
        for (int i = 1; i <= 3; i++) {// i va desde 1 hasta 3 ejemplo: 1, 2, 3
            for (int j = 1; j <= 3; j++) { // j va desde 1 hasta 3 ejemplo: 1, 2, 3
                contador++;
                System.out.print(i * j + " "); // i * j = 1, 2, 3, 2, 4, 6, 3, 6, 9
            }
            System.out.println();
            System.out.println("CONTADOR DE INTERVALOS: " + contador); // 9
        }

        String[] frutas = { "Manzana", "Pera", "Platano", "Sandia" };
        for (String i : frutas) {
            System.out.println(i);
        }

        // Imprimir la tabla del 2 al 10
        int number = 2;

        // Print the multiplication table for the number 2
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
