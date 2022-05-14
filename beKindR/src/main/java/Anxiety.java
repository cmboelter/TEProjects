import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anxiety {

    public static Map<String,String> anxietyThoughts(){
        Map<String,String> unhelpfulAndCounterThoughts = new HashMap<>();

                unhelpfulAndCounterThoughts.put("A1", "Though it may be risk to try X, I cannot predict the future; " +
                        "there are likely several possible outcomes, some that could be good.");
                unhelpfulAndCounterThoughts.put("A2", "Although I love person X, I have a right do make a decision that is healthy for me. " +
                        "If person X loves me too, person X may be disappointed, but person X will still love me regardless. Person X knows how to deal with disappointment.");
                unhelpfulAndCounterThoughts.put("A3", "Though it won't be easy, I have done hard things before and may be happier if I make this change.");
        return unhelpfulAndCounterThoughts;
    }

    public static void anxietyMenu(){
        System.out.println("Below are a few examples of anxious thoughts that people have. Enter the letter and number of the thought to view an example counter-thought.");
        System.out.println("A1. Something bad is going to happen if I do X.");
        System.out.println("A2. If I don't do what person X wants me to do, person X will be angry with me.");
        System.out.println("A3. It will be too hard to try to change careers at this stage in my life.");

    }

    public static String getAnxietyOptionFromMenu(Scanner userInput){
        String userEntry = userInput.nextLine();
        String option = userEntry.trim().toUpperCase();
        return option;
    }

    public static void returnAnxietyThoughtToUser(String option) {
        String returnedThought = null;
        if (option != null) {
            if (option.equals("A1")) {
                returnedThought = anxietyThoughts().get("A1");
                System.out.println(returnedThought);
            }
            if (option.equals("A2")) {
                returnedThought = anxietyThoughts().get("A2");
                System.out.println(returnedThought);
            }
            if (option.equals("A3")) {
                returnedThought = anxietyThoughts().get("A3");
                System.out.println(returnedThought);
            }
        }
        System.out.println();
    }
}
