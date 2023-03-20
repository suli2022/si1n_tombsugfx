package models;

public class MainModel {
    
    public double calcRadius(double side, double alpha) {
        double rad = alpha * Math.PI / 180;
        double radius = 1./2 * side * Math.sin(rad);
        return radius;
    }
}
