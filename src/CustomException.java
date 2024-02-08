// Create a program to compare a string in a current input string if the element is not present in the string then throw an Exception

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

//Creating a custom exception which extends exception and does the exception throwing
public class CustomException extends Exception{
    public String element;
    //Creating a Constructor for the custom exception
    CustomException(String element) {
        super(String.format("Element '%s' not present in the input string", element));
        this.element = element;
    }

}

//Driver class
class Driver{
    public static void main(String[] args) {

        //Scanner to get the input from the user
        Scanner scanner = new Scanner(System.in);

        //Getting the String to check
        System.out.println("Enter a string to check :");
        String reg = scanner.nextLine();

        //Getting the Sentence to be checked
        System.out.println("Enter a sentence :");
        String sen = scanner.nextLine();

        //Using Regex to compile and match the both string and the sentence
        Pattern pattern = Pattern.compile(reg,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sen);

        //Checking if the sentence matches the string
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");

        }
        else {
            System.out.println("Match not found");

            //Throwing the exception
            CustomException c = new CustomException(reg);
            System.out.println(c);
        }
    }
}
