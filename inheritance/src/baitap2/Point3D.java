package baitap2;

import java.util.Arrays;

public class Point3D extends Point2D{
    public float[] Array;
    public float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getArray(){
        return new float[]{x,y,z};
    }

    @Override
    public String toString() {
        return "Poin3D{" +
                "Array=" + Arrays.toString(getArray()) +
                '}';
    }
}
