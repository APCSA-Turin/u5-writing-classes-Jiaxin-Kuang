package U5T7;

public class Temperature {
    double highTemperature; 
    double lowTemperature;
    String temperatureScale;
    public Temperature(double highTemperature, double lowTemperature, String tempScale){
        this.highTemperature = highTemperature;
        this.lowTemperature = lowTemperature;
        if(tempScale.equals("F") || tempScale.equals("C")){
            temperatureScale = tempScale;
        }
        else{
            temperatureScale = "F";
        }
    }
    public static double convertCToF(double C){
        return (C * 9.0/5.0) + 32.0;
    }
    public static double convertFToC(double F){
        return (F - 32.0) * (5.0/9.0);
    }
    public void changeToC(){
        if(temperatureScale.equals("C")){
            return;
        }
        else{
            highTemperature = convertFToC(highTemperature);
            lowTemperature = convertFToC(lowTemperature);
            temperatureScale = "C";
        }
    }
    public void changeToF(){
        if(temperatureScale.equals("F")){
            return;
        }
        else{
            highTemperature = convertCToF(highTemperature);
            lowTemperature = convertCToF(lowTemperature);
            temperatureScale = "F";
        }
    }
    public String tempInfo(){
        return "High Temperature: " + highTemperature + " " + temperatureScale + "\nLow Temperature: " + lowTemperature + " " + temperatureScale;
    }
}
