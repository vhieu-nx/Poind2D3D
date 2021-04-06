public class Point3D extends Point2D{
    private float z = 0.0f;

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
    public float[] getXYZ(){
        float[] xyz=new float[3];
        xyz[0]=getX();
        xyz[1]=getY();
        xyz[2]=this.getZ();
        for (int i = 0; i < xyz.length; i++) {
            System.out.print(xyz[i]+ "\t");
        }
        return xyz;
    }
    public void setXYZ(float x, float y,float z){
        setX(x);
        setY(y);
        this.setZ(z);
    }
}
