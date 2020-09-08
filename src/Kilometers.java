public class Kilometers {
    //Exercise 1.12
    public static void main(String[] args) {
        int distance = 24;
        double time = (100.0 * 60 + 35) / (60 * 60);
        double converter = distance * 1.6;
        double kph = converter * time;
        System.out.println("The average speed i kph is " + kph);
    }
}
