public class Population {
    //Exercise 1.11
    public static void main(String[] args) {
        //Calculated to a per day timeframe
        double birth = (24 * 60 * 60) / 7.0;
        double death = (24 * 60 * 60) / 13.0;
        double immigrant = (24 * 60 * 60) / 45.0;
        int population = 312032486;
        int year = 1;
        double sum = (birth - death + immigrant) * 365;
        System.out.println("Today:       " + population);
        System.out.println("First year:  " + (population + (sum * year++)));
        System.out.println("Second year: " + (population + (sum * year++)));
        System.out.println("Third year:  " + (population + (sum * year++)));
        System.out.println("Fourth year: " + (population + (sum * year++)));
        System.out.println("Fifth year:  " + (population + (sum * year++)));
    }
}
