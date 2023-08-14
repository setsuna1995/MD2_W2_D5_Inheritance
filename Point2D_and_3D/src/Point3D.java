import java.util.Arrays;

public class Point3D extends Point2D{
    float z = 0.0f;
    Point3D () {}

    public Point3D(float z) {
        this.z = z;
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
public void setXYZ(float x, float y, float z) {
        x = getX();
        y = getY();
        z = getZ();
}
    public float[] getXYZ() {
        float [] getXYZ = {getX(),getY(),getZ()};
        return getXYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z + Arrays.toString(getXYZ()) +
                '}';
    }
}
