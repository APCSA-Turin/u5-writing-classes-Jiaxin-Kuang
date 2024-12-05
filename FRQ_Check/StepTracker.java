public class StepTracker{ 
    private int activeAmount;
    private int totalSteps = 0;
    private int days = 0; 
    private int activeDays = 0;
    StepTracker(int activeAmount){
       this.activeAmount = activeAmount;
    } 
    public int activeDays(){
       return activeDays;
    }
    public double averageSteps(){
       return (double) totalSteps/days; 
    } 
    public void addDailySteps(int amount){
       if(amount >= activeAmount){
          activeDays ++;
       }
       totalSteps += amount;
       days ++;
    }
  }
  