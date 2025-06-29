public class Operadores {

    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);
        System.out.println(10 % 3);
        System.out.println(10 > 3);
        System.out.println(true && false); // false
        System.out.println(!true); // false

        System.out.println("-------------------");

        int age = 18;
        if (age >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.println("-------------------");
        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            default:
                System.out.println("Otro");
        }
        System.out.println("-------------------");

        int edad = 18;
        String mensaje = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
        System.out.println(mensaje);

        System.out.println("for -------------------");
        // for
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        System.out.println(" while -------------------");

        // while
        int i = 0;
        while (i < 4) {
            System.out.println(i);
            i++;

        }

        System.out.println("-------------------");

    }

}
