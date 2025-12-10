public class WrapperClassesDemo {
    public static void main(String[] args) {

        int a = 10;
        Integer x = a; // autoboxing
        int y = x;     // unboxing

        Double d = Double.valueOf("45.67");
        Boolean b = Boolean.TRUE;

        System.out.println("Autoboxed: " + x);
        System.out.println("Unboxed: " + y);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + b);
    }
}
