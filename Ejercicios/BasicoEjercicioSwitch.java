import java.util.Scanner;

public class BasicoEjercicioSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el tipo de operanción que desea realizar: \\n" +
                " \n" + //
                "1. Suma \n" + //
                "2. Resta \n" + //
                "3. Multiplicación \n" + //
                "4. División \n" + //
                "5. Módulo \n");

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el primer número");
                int num1 = entrada.nextInt();
                System.out.println("Ingrese el segundo número");
                int num2 = entrada.nextInt();
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Ingrese el primer número");
                int num3 = entrada.nextInt();
                System.out.println("Ingrese el segundo número");
                int num4 = entrada.nextInt();
                System.out.println("El resultado de la resta es: " + (num3 - num4));
                break;
            case 3:
                System.out.println("Ingrese el primer número");
                int num5 = entrada.nextInt();
                System.out.println("Ingrese el segundo número");
                int num6 = entrada.nextInt();
                System.out.println("El resultado de la multiplicación es: " + (num5 * num6));
                break;
            case 4:
                System.out.println("Ingrese el primer número");
                int num7 = entrada.nextInt();
                System.out.println("Ingrese el segundo número");
                int num8 = entrada.nextInt();
                System.out.println("El resultado de la división es: " + (num7 / num8));
                break;
            case 5:
                System.out.println("Ingrese el primer número");
                int num9 = entrada.nextInt();
                System.out.println("Ingrese el segundo número");
                int num10 = entrada.nextInt();
                System.out.println("El resultado del módulo es: " + (num9 % num10));

            default:
                System.out.println("Opcion no valida");
                break;
        }

        entrada.close();
    }

}
