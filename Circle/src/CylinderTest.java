public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(2);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
        cylinder = new Cylinder(3, 4,"red");
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}
