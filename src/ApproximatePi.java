public class ApproximatePi {
    //Exercise 1.7
    public static void main(String[] args) {
        double pi = 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
        double pi2 = 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
        System.out.println("First approximate Pi  = " + pi);
        System.out.println("Second approximate Pi = " + pi2);
    }
}
