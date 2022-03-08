package oop.labor02;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area(double length,double width){
        double ar;
        ar=length*width;
        return ar;
    }
    public double perimeter(double length,double width){
        double pe;
        pe=(2*length)+(2*width);
        return pe;
    }
}
