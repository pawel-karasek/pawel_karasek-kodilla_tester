package calculator;

public class Calculator {
    static final double PI = 3.1415927;          // [1]
    static int counter = 0;                      // [2]

    public Calculator() {
        counter++;                                // [3]
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double circleArea(double r) {
        String name = UserDialogs.getUsername();
        System.out.println("Hello " + name + " Thank you for using our softwear.");
        return PI * r * r;
    }

    public double circlePerimeter(double r) {
        return 2 * PI *r;
    }
}
