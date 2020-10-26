package B6_Ke_Thua.lop_circle_va_lop_cylinder;

public class Point2D {
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

    public void setXY(float x, float y){
        this.x= x;
        this.y= y;
    }

    public float[] getXY(){
        float[] arrayXY = {getX(), getY()};
        return arrayXY;
    }

    @Override
    public String toString() {
        return " Location: (" + getX() + " , "+ getY() + ").";
    }
}
