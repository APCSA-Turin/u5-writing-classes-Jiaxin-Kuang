public class Person{
    private String firstName;
    private String lastName;
    private int meetings;
    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getMeetings(){
        return meetings;
    }
    public String getFirstName(){
        meetings ++;
        return firstName;
    }
    public void meet(Person person){
        System.out.println("Hello, my name is " + firstName + "\nHi, my name is " + person.getFirstName());
        meetings ++;
    }
}