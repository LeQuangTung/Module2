package baitap2;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1.1f,2.2f);
        System.out.println(point2D);

        Point3D point3D = new Point3D(3.3f, 4.4f,5.5f);
        System.out.println(point3D);

        MovablePoint movablePoint = new MovablePoint(1.1f,2.2f,3.3f,4.4f);
        System.out.println(movablePoint);
    }
}
