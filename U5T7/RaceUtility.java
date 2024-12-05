package U5T7;

public class RaceUtility {
    public RaceUtility(){}

    public static double milesToKm(double miles){
        return miles * 1.609;
    }

    public static double kmToMiles(double km){
        return km/1.609;
    }

    public static String makeProper(String sentence){
        String modifiedSentence = "";
        modifiedSentence += sentence.substring(0,1).toUpperCase();
        for(int i = 1; i < sentence.length(); i++){
            if(sentence.substring(i-1,i).equals(" ")){
                modifiedSentence += sentence.substring(i, i+1).toUpperCase();
            }
            else{
                modifiedSentence += sentence.substring(i, i+1).toLowerCase();
            }
        }
        return modifiedSentence;
    }
}
