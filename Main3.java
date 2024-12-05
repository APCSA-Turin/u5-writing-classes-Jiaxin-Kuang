import java.util.Scanner;
import java.util.ArrayList; 
 
public class Main3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalInputs = sc.nextInt();
        sc.nextLine();
        int inputNumber = 1;
        ArrayList<String> allOutputs = new ArrayList<String>();
        String numberSolution = ""; 
        while(inputNumber <= totalInputs){
            int numberLength = sc.nextInt();
            if(numberLength % 2 == 0){
                if(numberLength >= 2){
                    numberSolution = "3".repeat(numberLength - 2) + "66";
                    allOutputs.add(numberSolution);
                }
                else{
                    allOutputs.add("-1");
                }
            }
            else{
                if(numberLength >= 4){
                    numberSolution = "3".repeat(numberLength - 4) + "6366";
                    allOutputs.add(numberSolution);
                }
                else{
                    allOutputs.add("-1");
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