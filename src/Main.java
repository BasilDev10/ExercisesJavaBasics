import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // All Exercises
        // Exercise number one
        CalculatesBMI();
        // Exercise number tow
        CalculatesPercentage();
        // Exercise number there
        CalculatesCuranccyUSDtoEUR();
        // Exercise number four
        ReveredStringAndGetLength();
        // Exercise number five
        SubstringSentence();
        // Exercise number six
        FindKeywordInSentence();
        // Exercise number seven
        SentenceReplacement();
        // Exercise number eight
        StringCheckEquals();
    }
    public static void CalculatesBMI(){
        Scanner input = new Scanner(System.in);

        // calculates The BMI :
        System.out.printf("Enter the Weight (kg): ");
        double weight = input.nextDouble();
        System.out.printf("Enter the Height (m): ");
        double height = input.nextDouble();
        System.out.println("BMI: " + (weight / (Math.pow(height, 2))));
    }
    public static void CalculatesPercentage(){
        Scanner input = new Scanner(System.in);
        // Calculates percentage of the takes the obtained marks and total marks
        System.out.printf("Enter Obtained Marks: ");
        double obtainedMarks = input.nextDouble();
        System.out.printf("Enter Total Marks: ");
        double totalMarks = input.nextDouble();
        System.out.println("Percentage: " + ((obtainedMarks/totalMarks)*totalMarks)+"%");
    }

    public static void CalculatesCuranccyUSDtoEUR(){

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the USD Amount: ");
        double usdAmount = input.nextDouble();
        System.out.printf("Enter the Exchange rate of EUR: ");
        double exchangeEUR = input.nextDouble();
        System.out.println("Amount in EUR: " + (usdAmount*exchangeEUR));
    }

    public static void ReveredStringAndGetLength(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the String to get Length and reverse the String: ");
        String string = input.nextLine();
        int length = string.length();
        String reversedString = new StringBuilder(string).reverse().toString();
        System.out.println("Length of the string: " + length+" - And the reversed String: " + reversedString);

    }

    public static void SubstringSentence(){
        //The quick brown fox jumps over the lazy dog
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the sentence to Substring: ");
        String sentence = input.nextLine();
        System.out.printf("Enter the start substring: ");
        int startSubstring = input.nextInt();
        System.out.printf("Enter the end substring: ");
        int endSubstring = input.nextInt();
        System.out.println(sentence.substring(startSubstring,endSubstring));

    }
    public static void FindKeywordInSentence(){
        //The quick brown fox jumps over the lazy dog
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the sentence to find keyword in sentence: ");
        String sentence = input.nextLine();
        System.out.printf("Enter the keyword: ");
        String keyword = input.nextLine();

        System.out.println("the Keyword ("+keyword+") is "+
                (sentence.toLowerCase().contains(keyword)? "":"not ") // check keyword contain in sentence if true add empty string else add not
                +"present in the sentence" );
    }

    public static void SentenceReplacement(){
        //The quick brown fox jumps over the lazy dog
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the sentence to replace worn in sentence: ");
        String sentence = input.nextLine();
        System.out.printf("Enter the Replace word: ");
        String replace = input.nextLine();
        System.out.printf("Enter the Replacement word: ");
        String replacement = input.nextLine();

        System.out.println(sentence.replace(replace,replacement));
    }
    public static void StringCheckEquals(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first string: ");
        String firstString = input.nextLine();
        System.out.printf("Enter the second string: ");
        String secondString = input.nextLine();
        System.out.println("String are "+((firstString.toLowerCase().equals(secondString.toLowerCase())) ? "equal":"not equal"));
    }
}