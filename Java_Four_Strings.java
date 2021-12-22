public class Java_Four_Strings {
    public static void main(String[] args) {
        String message = new String("Hello World");
        // Use new because it is a reference type, like we learnt in Java 3
        // OR
        String message_2 = "Hello World";
        //Primitive part
        System.out.println(message);
        System.out.println(message_2);

        String add = "You" + " There";
        System.out.println(add);

        System.out.println(message.toUpperCase());
        System.out.println("Does it end with x?" + message.endsWith("x"));
        //endsWith is a boolean
        System.out.println(message.indexOf("l"));
        System.out.println(message.replace("rld", "nder"));
        // Java strings cannot be changed without it's Method
        System.out.println(message);
    }
}