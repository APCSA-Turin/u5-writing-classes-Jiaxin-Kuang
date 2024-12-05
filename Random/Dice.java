public class Dice{
    private int sides;
    private int rollCount = 0;
    private int rollValue = 0;
    Dice(int sides){
        this.sides = sides;
    }
    public int getSides(){
        return sides;
    }
    public int getRollCount(){
        return rollCount;
    }
    public int getRollValue(){
        return rollValue;
    }
    public void setSides(int newSides){
        sides = newSides;
    }
    public void roll(){
        rollValue = (int) (Math.random() * (sides)) + 1;
        rollCount ++;
    }
}