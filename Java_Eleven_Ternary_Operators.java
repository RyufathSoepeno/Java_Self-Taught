public class Java_Eleven_Ternary_Operators {
    public static void main(String args[]){
        int salary = 80_000;
        // Ternary operators can be used to arrange variables to certain groups

        String className = salary > 320_000 ? "Upper Middle Class" : "Lower Middle CLass";
        // String is not boolean, to that, this is how ternary operators work

        System.out.println(className);
    }
}