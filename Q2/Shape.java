public abstract class Shape {
    private double dimen1;
    private double dimen2;
    private double pi = 3.14;

    public Shape (){

    }   

    public Shape(double dimen1, double dimen2) {
        this.dimen1 = dimen1;
        this.dimen2 = dimen2;
    }

    public double getDimen1() {
        return dimen1;
    }

    public double getDimen2(){
        return dimen2;
    }

    public void setDimen1(double dimen1) {
        this.dimen1 = dimen1;
    }

    public void setDimen2(double dimen2) {
        this.dimen2 = dimen2;
    }

    public double getPI() {
        return pi;
    }

    public abstract double area();
}