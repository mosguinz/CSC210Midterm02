public class Question2a {
    public static void main(String[] args) {
        String returnValue = returnGreeting("Coding");
        System.out.printf("Return value: %s%n", returnValue);
    }

    static String returnGreeting(String kw) {
        return kw.equals("Coding") ? "Happy Coding!" : "";
    }
}
