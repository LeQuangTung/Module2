package baitap1;

public class Cylinder extends Circle{
    public double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                ", radius=" + getRadius() +
                ", color='" + getColor() +
                ", Volume=" + getVolume() + '\'' +
                '}';
    }
}
