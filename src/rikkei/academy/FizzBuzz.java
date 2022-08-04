package rikkei.academy;

public class FizzBuzz {
    public static String translate(int number){
        String show = "";
        boolean isDiviable3 = number % 3 == 0;
        boolean isDiviable5 = number % 5 == 0;
        if(isDiviable3 && isDiviable5){
            show = "FizzBuzz";
        }else if(isDiviable3){
            show = "Fizz";
        }else if (isDiviable5){
            show = "Buzz";
        }else {
            show = String.valueOf(number);
        }
    return show;
    }
}
