package U5T8;

public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private static int mostRecentEmployee;
    private static int totalEmployeesCreated = 0;

    Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        mostRecentEmployee = 100 + totalEmployeesCreated;
        totalEmployeesCreated ++;
        employeeID = mostRecentEmployee;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getID(){
        return employeeID;
    }

    public int getMostRecentEmployeeID(){
        return mostRecentEmployee;
    }

    public int getTotalEmployeesCreated(){
        return totalEmployeesCreated;
    }

    public String employeeInfo(){
        return "--------------------------" + "\nEmployee full name: " + getFullName() + "\nEmployee ID: " + employeeID + "\nMost recent ID assigned: " + mostRecentEmployee + "\nTotal employees hired: " + totalEmployeesCreated + "\n--------------------------";
        
    }
}
