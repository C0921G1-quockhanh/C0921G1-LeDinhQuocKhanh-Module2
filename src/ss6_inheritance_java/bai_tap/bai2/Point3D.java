package ss6_inheritance_java.bai_tap.bai2;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        this.z = 0.0f;
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }
    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = {super.getX(),super.getY(),this.getZ()};
        return arr;
    }

    @Override
    public String toString() {
        return "The coordinates of Point3D is (" + super.getX() + "," + super.getY() + "," + this.getZ() + ")";
    }

}
