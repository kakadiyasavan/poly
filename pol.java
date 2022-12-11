public class pol {

    public static void main(String[] args) {
        rectangle jk = new rectangle();
        jk.one(5);
        jk.two(55, 85);
        jk.triangle("Program");
    }
}

class shape {

    public void one(int a) {
        System.out.println("The value of : " + a);
    }

    public void two(int a, int b) {
        System.out.println("Sum of Number : " + (a + b));
    }
}

class rectangle extends shape {

    public void triangle(String c) {
        super.toString();
        System.out.println("Hello java " + c);
    }
}