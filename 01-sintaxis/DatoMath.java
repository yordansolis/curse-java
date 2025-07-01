
public class DatoMath {

    public static void main(String[] args) {
        System.out.println(Math.PI); // 3.141592653589793
        System.out.println(Math.E); // 2.718281828459045

        System.out.println(Math.max(10, 20)); // 20
        System.out.println(Math.min(10, 20)); // 10

        System.out.println(Math.random()); // 0.0 a 1.0

        int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum); // 0 a 100

    }
}