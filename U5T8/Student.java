package U5T8;

public class Student {
    private String firstName;
    private int points = 0;
    private static int totalPoints = 0;
    private int greatestPoints = 0;
    private static int allTimeGreatestPoints = 0;

    Student(String firstName){
        this.firstName = firstName;
    }

    public int getGreatestPoints(){
        return greatestPoints;
    }

    public int getTotalPoints(){
        return totalPoints;
    }

    public void addPoints(int newPoints){
        points += newPoints;
        totalPoints += newPoints;
        if(newPoints > greatestPoints){
            greatestPoints = newPoints;
        }
        if(points > allTimeGreatestPoints){
            allTimeGreatestPoints = points;
        }
    }

    public String studentInfo(){
        return "Student: " + firstName + "\nPoints: " + points;
    } 

    public static String classInfo(){
        return "Total points earned by all students: " + totalPoints + "\nMost points earned by any student: " + allTimeGreatestPoints;
    }
}
