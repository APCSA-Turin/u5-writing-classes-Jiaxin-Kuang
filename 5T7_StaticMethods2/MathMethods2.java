import java.util.Scanner;

public class MathMethods2 {
    private double radius;
    Scanner sc = new Scanner(System.in);

    //Constructor accepts one number for radius
    MathMethods2(double radius){
        this.radius = radius;
    }

    //Updates radius with a new number
    public void updateRadius(double newRadius){
        radius = newRadius;
    }

    //Continously shows a menu for users to select and run actions from till user choose option 7
    public void start(){
        int option = 0;
        while(option != 7){
            System.out.println("Select an option: \n1. Update radius\n2. Find circumference\n3. Find area\n4. Find arc length from degrees\n5. Convert degrees and radians\n6. Print all circle information\n7. Exit");
            System.out.println("--------------------------------");
            option = sc.nextInt();
            sc.nextLine();
            if(option == 1){
                System.out.println("Please enter the new radius: "); 
                updateRadius(sc.nextDouble());
                sc.nextLine();
                System.out.println("The new radius is " + radius);
                System.out.println("--------------------------------");
            }
            else if(option == 2){
                System.out.println("The circumference is " + MathMethods.circumference(radius));
                System.out.println("--------------------------------");
            }
            else if(option == 3){
                System.out.println("The area is " + MathMethods.area(radius));
                System.out.println("--------------------------------");
            }
            else if(option == 4){
                System.out.println("Please enter the central degree: "); 
                System.out.println("The arc length is " + arcLength(sc.nextDouble()));
                sc.nextLine();
                System.out.println("--------------------------------");
            }
            else if(option == 5){
                System.out.println("Please enter the radians/degree: ");
                double convertNumber = sc.nextDouble();
                sc.nextLine();
                System.out.println("Please enter what you want to convert to: ");
                String convertTo = sc.nextLine();
                if(convertTo.equals("degrees")){
                    System.out.println("The number in degrees is " + convertDegreesAndRadians(convertNumber, convertTo)); 
                }
                else if(convertTo.equals("radians")){
                    System.out.println("The number in radians is " + convertDegreesAndRadians(convertNumber, convertTo)); 
                }
                else{
                    System.out.println("Please enter radians or degrees");
                }
                System.out.println("--------------------------------");
            }
            else if(option == 6){
                System.out.println("Please enter the central degree: ");
                System.out.println(circleInfo(sc.nextDouble()));
                sc.nextLine();
                System.out.println("--------------------------------");
            }
        }
        System.out.println("Have a good day! :D");
    }

    //User gives degree of central angle to print out all known information of circle given central angle and radius
    public String circleInfo(double degree){
        return "The radius is " + radius + ", the circumference is " + MathMethods.circumference(radius) + ", the arc length is " + arcLength(degree) + ", and the area is " + MathMethods.area(radius); //B and C
    }

    //Returns arc length of circle given central degree
    public double arcLength(double degree) {
        double percent = percent(degree); //D
        return MathMethods.roundNumber(percent * MathMethods.circumference(radius)); //E
    }

    //Finds percent of degree out of 360
    private static double percent(double degree){ 
        return degree/360.0;
    }

    //converts number to degree or radians
    public static double convertDegreesAndRadians(double num, String unit) {
        if (unit.equals("degrees")){ //converts num to degrees
            return MathMethods.roundNumber(num*180.0/Math.PI);        
        } 
        else if (unit.equals("radians")){ //converts num to radians
            return MathMethods.roundNumber(num*Math.PI/180.0);
        }
        else{
            return -1;
        }
    }
}
