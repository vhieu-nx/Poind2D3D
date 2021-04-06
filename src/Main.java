public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.18f, 2.84f);
        Point3D point3D = new Point3D(3.18f, 2.84f, 93.94f);
        point2D.getXY();
        System.out.println();
        point2D.setXY(1.2f,1.3f);
        point2D.getXY();
        System.out.println();
        point3D.getXYZ();
        point3D.setXYZ(10.1f,10.2f, 10.3f);
        System.out.println();
        point3D.getXYZ();
    }
}
