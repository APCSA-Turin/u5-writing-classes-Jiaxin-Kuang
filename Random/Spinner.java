public class Spinner {
    private int sections;
    private int currentSpin = 0;
    private int totalSpins = 0;
    private int sumOfSpins = 0;
    Spinner(int sections){
        this.sections = sections;
    }
    public int getSpinValue(){
        return currentSpin;
    }
    public int getSpinCount(){
        return totalSpins;
    }
    public int getSpinSum(){
        return sumOfSpins;
    }
    public double averageSpin(){
        return sumOfSpins/totalSpins;
    }
    public void spin(){
        currentSpin = (int) (Math.random() * (sections)) + 1;
        totalSpins ++;
        sumOfSpins += currentSpin;
    }
}

