class WrapperMethods {
    public static void main(String[] args) {

        Integer num = 20;

        System.out.println("intValue: " + num.intValue());
        System.out.println("doubleValue: " + num.doubleValue());
        System.out.println("toString: " + num.toString());

        // Parsing
        String s = "100";
        int x = Integer.parseInt(s);
        System.out.println("Parsed value: " + x);


        Integer a = 10, b = 20;
        System.out.println("Compare: " + a.compareTo(b));
    }
}






