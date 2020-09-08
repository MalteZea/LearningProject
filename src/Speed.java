public class Speed {
    //Exercise 1.10
    public static void main(String[] args) {
        int distance = 15;
        double time = (50.0 * 60 + 30) / (60 * 60);
        double converter = distance / 1.6;
        double mph = converter * time;
        System.out.println("The average speed i mph is " + mph);

    }
}
