import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine(); // Diego

        System.out.println("Ingresa tu edad");
        int edad = entrada.nextInt(); // 19

        System.out.println("Ingrese su altura");
        double altura = entrada.nextDouble(); // 175

        System.out.println("Es ingreniero? (true o false)");
        boolean esIngeniero = entrada.nextBoolean(); // true

        System.out.println("Su nombre es: " + nombre); // String "Diego"
        System.out.println("Su edad es: " + edad); // int 19
        System.out.println("Su altura es: " + altura); // double 1.75
        System.out.println("Es ingeniero? " + esIngeniero); // boolean true

        entrada.close(); // cerrar el scanner para evitar errores

    }
}
