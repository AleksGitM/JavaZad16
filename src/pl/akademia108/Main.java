package pl.akademia108;

import pl.akademia108.figures.Figure;
import pl.akademia108.figures.Ellipse;
import pl.akademia108.figures.Sphere;

public class Main {

    public static void main(String[] args) {

        Ellipse ellipse = new Ellipse(13.0, 59.0);

        Sphere sphere = new Sphere(12.3);

        sphere.countArea();
        ellipse.countArea();
    }
}
