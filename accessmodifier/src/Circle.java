public class Circle {
    private double radius;
    private String color;

    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }

     public double getRadius(){
        return radius;
    }

    public double getArea(){
        return (radius * radius * 3.14);
    }

}
