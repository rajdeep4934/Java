class StringDemo {
    public static void main(String[] args) {

        String str = "Hello Java";

        System.out.println("Length: " + str.length());
        System.out.println("Upper: " + str.toUpperCase());
        System.out.println("Lower: " + str.toLowerCase());
        System.out.println("Char at 1: " + str.charAt(1));
        System.out.println("Substring: " + str.substring(0, 5));
        System.out.println("Contains Java: " + str.contains("Java"));
    }
}