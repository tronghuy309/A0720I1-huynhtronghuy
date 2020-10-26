package B6_Ke_Thua.lop_circle_va_lop_cylinder;

public class Point3D extends Point2D {
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
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arrayXYZ = {getX(),getY(),this.z};
        return arrayXYZ;
    }

    @Override
    public String toString() {
        return " Location: " + "(" + super.getX() + " , " + super.getY() + " , " + this.z + ") ";
    }
}
