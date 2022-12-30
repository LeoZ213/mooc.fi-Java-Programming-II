

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker checks = new Checker();
        boolean y= checks.timeOfDay("23:49:30");
        System.out.println(y);
        boolean x = checks.isDayOfWeek("wed");
        System.out.println(x);
        boolean z = checks.allVowels("ioiioioio");
        System.out.println(z);
    }
}
