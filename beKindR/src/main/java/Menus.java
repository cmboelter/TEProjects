import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Menus {
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Menus menu = new Menus();
        menu.runMainMenu();
    }
    public static void mainMenuWelcome(){

        System.out.println("                %%%%%%%%%%%       %%%%%%%%%%%%%                      ");
        System.out.println("              %%%%%%%%%%%%%%%   %%%%%%%%%%%%%%%%                     ");
        System.out.println("             %%%%%%%%%%%%%%%%%  %%%%%%%%%%%%%%%%%                 ");
        System.out.println("            %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                   ");
        System.out.println("            %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%             ");
        System.out.println("            %%%%%%%%%% Welcome to BeKindR! %%%%%%                       ");
        System.out.println("             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%             ");
        System.out.println("                %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                       ");
        System.out.println("                   %%%%%%%%%%%%%%%%%%%%%%%%%%                          ") ;
        System.out.println("                      %%%%%%%%%%%%%%%%%%%%%                              ");
        System.out.println("                         %%%%%%%%%%%%%%%%                                  ");
        System.out.println("                            %%%%%%%%%%%                                     ");
        System.out.println("                              %%%%%%%                                       ");
        System.out.println("                               %%%%%                                   ");
        System.out.println("                                %%%                                   ");
    }

    public static String menuOptionsDisplay(){
        System.out.println("Please enter the number of the topic you would like to explore: ");
        System.out.println("1. Anxiety");
        System.out.println("2. Depression");
        System.out.println("3. Shame and Guilt");
        System.out.println("4. Self-criticism");

        String userEntry = userInput.nextLine();
        String option = userEntry.trim();

        switch (option){
            case "1":
                return "anxietyMenu";
            case "2":
                return "depressionMenu";
            case "3":
                return "shameAndGuiltMenu";
            case "4":
                return "selfCriticismDMenu";
        }
            return "";
    }


    public static void depressionMenu(){
        System.out.println("Below are a few examples of anxious thoughts that people have. Enter the letter and number of the thought to view an example counter-thought.");
        System.out.println("D1. ");
        System.out.println("D2. ");
        System.out.println("D3. ");

        String userEntry = userInput.nextLine();
        String option = userEntry.trim().toUpperCase();

    }

    public void runMainMenu(){
        boolean isRunning = true;

        while(isRunning){
            mainMenuWelcome();
            String option = Menus.menuOptionsDisplay();
            if(option.equals("anxietyMenu")){
            Anxiety.anxietyMenu();
            String choice = Anxiety.getAnxietyOptionFromMenu(userInput);
            Anxiety.returnAnxietyThoughtToUser(choice);
                System.out.println("Press enter to continue: ");
                userInput.nextLine();
            }
        }
    }

    }

