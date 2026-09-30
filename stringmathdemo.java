public class stringmathdemo {
    public static void main(String[] args) {
        String str1 = "Durvesh";
        String str2 = "Wadile";

        String str3 = str1.concat("" + str2);

        System.out.println("Concatenatio: " + str3);
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Charaters at index 1:" + str1.charAt(1));
        System.out.println("Substring of str2 (0-3):" + str2.substring(0,3));
        System.out.println("Equals? str1 and str2:" + str1.equals(str2));
        System.out.println("Uppercase str1" + str1.toUpperCase());

        double a = 144;
        double b = 1.6;

        System.out.println("Square root of a:" + Math.sqrt(a));
        System.out.println("a raised to b:" + Math.pow(a, b));
        System.out.println("Max of a and b:" + Math.max(a, b));
        System.out.println("Min of a and b" + Math.min(a, b));
        System.out.println("random number (0-1)" + Math.random());
        System.out.println("Random number (10-20)" + (10 + Math.random() * (20-10)));
        System.out.println("Random number (1-100):" + (1 + Math.random() * (100-1)));
        System.out.println("cell of b" + Math.ceil(b));
        System.out.println("Floor of b:" + Math.floor(b));
        System.out.println("Round of b:" + Math.round(b));



    }
}
