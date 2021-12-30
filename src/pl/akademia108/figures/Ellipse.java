package pl.akademia108.figures;

public class Ellipse extends Figure{
    private Double a;
    private Double b;

    public Ellipse(Double a, Double b){
        this.a = a;
        this.b = b;
    }
    public double countArea(){
        double area = pi * a * b;
        System.out.println("Pole Elipsy wynosi: " + area);
        return area;
    }
}
