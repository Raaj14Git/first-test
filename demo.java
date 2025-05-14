public class demo {
    void sum(int a, int b) {

        System.out.println(a + b);
    }

    void sub(int a, int b) {

        System.out.println(a - b);
    }

    void mult(int a, int b) {

        System.out.println(a * b);

    }

    public static void main(String[] args) {
        demo obj1 = new demo();
        obj1.sum(10, 5);
        obj1.sub(100, 50);
        obj1.mult(2, 6);
    }
}