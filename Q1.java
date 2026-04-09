class BoxingDemo {
    public static void main(String[] args) {

        // Boxing
        int a = 10;
        Integer obj = Integer.valueOf(a);
        Integer obj2 = a;
        int b = obj.intValue();
        int c = obj2;

        System.out.println("Boxing: " + obj);
        System.out.println("Unboxing: " + b);
    }
}