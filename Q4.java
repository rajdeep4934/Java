// class StringTypesDemo {
//     public static void main(String[] args) {

//         // String (immutable)
//         String s = "Hello";
//         s = s + " World";

       
//         StringBuffer sb = new StringBuffer("Hello");
//         sb.append(" Java");

        
//         StringBuilder sb2 = new StringBuilder("Hello");
//         sb2.append(" Coding");

//         System.out.println(s);
//         System.out.println(sb);
//         System.out.println(sb2);
//     }
// }

public class StringTypesDemo {
    public static void main(String[] args) {

        String s = "Hello";
        s = s + " World";

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" Coding");

        System.out.println(s);
        System.out.println(sb);
        System.out.println(sb2);
    }
}