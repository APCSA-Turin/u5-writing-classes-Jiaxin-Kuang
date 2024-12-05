public class MathMethods {
    private MathMethods(){}

    //Finds a number to the exponent of 2
    private static double squareNumber(double number){
        return number * number;
    }

    //Finds area of a circle given radius
    public static double area(double radius){
        return roundNumber(Math.PI * squareNumber(radius)); //A
    }

    //Rounds number to nearest hundredth
    public static double roundNumber(double number){
        return Math.round(number * 100) / 100.0;
    }

    //Finds circumference of a circle given radius
    public static double circumference(double radius) {
        return roundNumber(2*Math.PI*radius);
    }
}
