public class DatosPrimitivos {
    public static void main(String[] args) {
        System.out.println("-------------------");

        // los datos primitivo se usan para representar los tipos de datos primitivos
        // boolean
        // char
        // byte
        // short
        // int
        // long
        // float
        // double

        System.out.println("byte: " + Byte.BYTES);
        System.out.println("short: " + Short.BYTES);
        System.out.println("int: " + Integer.BYTES);
        System.out.println("long: " + Long.BYTES);
        System.out.println("float: " + Float.BYTES);
        System.out.println("double: " + Double.BYTES);
        System.out.println("-------------------");

        // final sirve para decir que una variable no se puede modificar
        final int edad = 18;
        System.out.println(edad);
        // ejemplo de un error
        // edad = 20;

    }
}
