public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        } catch (Exception e) {
            System.out.println("General exception");
        }
    }
}
