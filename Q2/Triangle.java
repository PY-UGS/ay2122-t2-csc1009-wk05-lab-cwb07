public class Triangle extends Shape {
    public Triangle (double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area(){
        return 0.5 * super.getDimen1() * super.getDimen2();
    }
}
