// Circle class with methods to calculate area and circumference
class Circle {
    int radius;

    Circle(int r) { radius = r; }
    void area() { System.out.println("Area: " + Math.PI * radius * radius); }
    void circumference() { System.out.println("Circumference: " + 2 * Math.PI * radius); }
}

// Driver class for Circle
import java.util.Scanner;
class UseCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        Circle c = new Circle(sc.nextInt());
        c.area();
        c.circumference();
    }
}

// Worker class to calculate salary
class Worker {
    int hw;
    double payRate;

    void setData(int h, double p) { hw = h; payRate = p; }
    double calculateSalary() { return hw <= 40 ? hw * payRate : 40 * payRate + (hw - 40) * payRate * 2; }
}

// Driver class for Worker
class UseWorker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Worker w = new Worker();
        System.out.print("Enter hours worked and pay rate: ");
        w.setData(sc.nextInt(), sc.nextDouble());
        System.out.println("Salary: " + w.calculateSalary());
    }
}

// TrafficLight class with methods to change color and check status
class TrafficLight {
    String color;
    int duration;

    TrafficLight(String c, int d) { color = c; duration = d; }
    void changeColor(String newColor) { color = newColor; }
    boolean isRed() { return color.equals("Red"); }
    boolean isGreen() { return color.equals("Green"); }
}

// Example usage of TrafficLight
class UseTrafficLight {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);
        System.out.println("Is light red? " + light.isRed());
        light.changeColor("Green");
        System.out.println("Is light green? " + light.isGreen());
    }
}
