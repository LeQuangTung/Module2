package baitap2;

import java.util.Arrays;

public class Point2D {
    public float[] array;
    public float x = 0.0f;
    public float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;

    }

    public float[] getXY() {
        return new float[]{x,y};

    }

    @Override
    public String toString() {
        return "Point2D{" +
                "array=" + Arrays.toString(getXY()) +
                '}';
    }
}

