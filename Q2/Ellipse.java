public class Ellipse extends Shape {
    public Ellipse (double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area(){
        return super.getPI() * super.getDimen1() * super.getDimen2();
    }
}