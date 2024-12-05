import java.util.Scanner;
import java.util.ArrayList; 
 
public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalInputs = sc.nextInt();
        sc.nextLine();
        int inputNumber = 1;
        ArrayList<ArrayList> allOutputs = new ArrayList<ArrayList>(); 
        while(inputNumber <= totalInputs){
            int solutions = 0;
            String nlr = sc.nextLine();
            int l = Integer.parseInt(nlr.substring(2,3));
            int r = Integer.parseInt(nlr.substring(4,5));
            ArrayList<Integer> deck = new ArrayList<Integer>();
            String egorDeck = sc.nextLine();
            for(int i = 0; i < egorDeck.length(); i += 2){
                deck.add(Integer.parseInt(egorDeck.substring(i, i+1)));
            }
            int currentSum = 0;
            for(int i = 0; i < deck.size(); i ++){
                if(deck.get(i) > r){
                    deck.remove(i);
                }
                else if(deck.get(i) + currentSum <= r){
                    
                }
            }
            inputNumber ++;
        }
        for(int i = 0; i < allOutputs.size(); i++){
            System.out.println(allOutputs.get(i));
        }
        sc.close();
    }
}