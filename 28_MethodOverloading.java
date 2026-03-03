public class MethodOverloading {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Integer Sum = " + add(5, 3));
        System.out.println("Double Sum = " + add(2.5, 3.5));
    }
}
