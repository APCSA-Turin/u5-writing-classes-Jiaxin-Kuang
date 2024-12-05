public class AdditionPattern{
    private int originalNumber;
    private int number;
    private int change;
    AdditionPattern(int number, int change){
       this.number = number;
       originalNumber = number;
       this.change = change;
   }
   public int currentNumber(){
       return number;
   }
   public void next(){
       number += change;
   }
   public void prev(){
    if(originalNumber != number){
       number -= change;
    }
   }

}