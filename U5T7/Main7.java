package U5T7;

public class Main7 {
    public static void main(String[] args) {
        double kilometers = RaceUtility.milesToKm(13.85);
        System.out.println(kilometers);
        double kilometers2 = RaceUtility.milesToKm(26.42);
        System.out.println(kilometers2);
        double miles = RaceUtility.kmToMiles(40);
        System.out.println(miles);
        double miles2 = RaceUtility.kmToMiles(3.5);
        System.out.println(miles2);
        String capitalized = RaceUtility.makeProper("welcome to the marathon!");
        System.out.println(capitalized);
        String capitalized2 = RaceUtility.makeProper("It's TIME for THE 5k!");
        System.out.println(capitalized2);
    }
}
