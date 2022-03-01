public class Circle extends GeometricObject {
    private double radius;
    private static final double PI = 3.141592653589793;

    public Circle(){
    } 

    public Circle (double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return PI*Math.pow(this.radius, 2);
    }

    public double getPerimeter(){
        return 2*PI*this.radius;
    }

    public double getDiameter(){
        return this.radius*2;
    }

    public void printCircle(){
        System.out.println("Radius: " + this.radius);
    }
}
