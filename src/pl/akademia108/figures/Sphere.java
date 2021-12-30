package pl.akademia108.figures;

public class Sphere extends Figure{
    private Double radian;

    public Sphere(Double radian){
        this.radian = radian;
    }

    public double countArea(){
        double area = pi * (this.radian * this.radian);
        System.out.println("Pole koła wynosi :" + area);
        return area;
    }
}
