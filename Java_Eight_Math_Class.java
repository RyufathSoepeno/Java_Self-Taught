public class Java_Eight_Math_Class {
    public static void main(String[] args) {
        System.out.println(Math.round(1.4F));
        // This type of round, returns an integer. Some returns a double

        System.out.println((int)Math.round(1.3F));
        // This is a double, you can tell once you type the round

        System.out.println((int)Math.ceil(1.1F));
        // Ceil returns a double greater than or equal to that double

        System.out.println(Math.max(1, 3));

        System.out.println(Math.random());
        //or
        double result = Math.random();
        System.out.println(result);

        double raw_score = Math.random() * 1000;
        System.out.println(raw_score);
        System.out.println((int)Math.round(raw_score));
        // Or for more sufficient
        int score = (int) Math.round(Math.random() * 100);
        System.out.println(score);
    }
}
