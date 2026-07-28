class ain {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // triggers ArithmeticException
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("error");
        } finally {
            System.out.println("finally block executed");
        }
    }
}
