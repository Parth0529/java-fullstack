public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Parth");

        sb.append(" Lahane");
        sb.insert(5, " Java");
        sb.reverse(); // just to show features

        System.out.println(sb);
    }
}
