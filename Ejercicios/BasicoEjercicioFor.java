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

    }
}
