import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Min and Max Number Challenge!");

        double min = 0;
        double max = 0;
        while(true){
            System.out.println("Enter a number or any char to quit");
            try{
                String userInput = scanner.nextLine();
                double tempNum = Double.parseDouble(userInput);
                if (min == 0){
                    min = tempNum;
                }
                if(tempNum > max){
                   max = tempNum;
                } else if (tempNum < min){
                    min = tempNum;
                }

            }catch(NumberFormatException nfe){
                break;
            }
        }
        System.out.println("min: " + min + " max: " + max);
    }
}
