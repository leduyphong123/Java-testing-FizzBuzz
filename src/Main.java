import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int number;
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("Input number = ");
            number=input.nextInt();
        }while(number>100 || number<0);
        System.out.println(checkNumber(number));
    }

    public static String checkNumber(int number){
        boolean chia3 = number % 3 == 0;
        boolean chia5 = number % 5 == 0;
        if(chia3 && chia5){
            return "FizzBuzz";
        }else {
            if(chia3){
                return "Fizz";
            }else if(chia5){
                return "Buzz";
            }else {
                return readNumber(number);
            }
        }
    }
    private static String readNumber(int number){
        int dv=number%10;
        int chuc=(number-dv)/10;
        if(number<=12){
            return readDV(number);
        }else if(number<20){
            return readDV(dv)+"teen";
        }else if(number<30){
            return "Twenty"+readDV(dv);
        }else {
            return readDV(chuc) +"ty"+readDV(dv);
        }
    }

    private static String readDV(int number) {
        switch (number) {
            case 0:
                return "";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            default:
                return "No error";
        }
    }
}