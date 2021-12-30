package pl.akademia108.figures;

public class Sphere extends Figure{
    private Double radius;

    public Sphere(Double radius){
        this.radius = radius;
    }

    public double countArea(){
        double area = pi * (this.radius * this.radius);
        System.out.println("Pole koła wynosi :" + area);
        return area;
    }
}
