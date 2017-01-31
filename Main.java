import java.util.Scanner;

/**
 * Created by davidshinabarger on 1/31/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = " ";
        char answerChar = 'Y';

        System.out.println("Welcome to virtual pet assistant, where WE help YOU decide which animal is right for you.");
        System.out.println("What is your name?");
        name = scan.nextLine();
        System.out.println("Hello, " + name + ".");
        System.out.println("Let's get started.");
        System.out.println("Do you want an animal? yes/no");
        String answer1 = scan.nextLine();
        if (!answer1.equals("yes") && !answer1.equals("no")) {
            System.out.println("That's not Yes or No! Let's try that again");
            answer1 = scan.nextLine();
        }

        switch (answer1) {
            case "yes":
                System.out.println("Great! Thanks, " + name + ". Do you like land or water creatures? ");
                break;
            case "no":
                System.out.println("Thanks anyways. Good luck out there... puppy-hater.");
                break;
            default:
                break;
        }
        String answer2 = scan.nextLine();

        if (!answer2.equals("water") && !answer2.equals("land")) {
            System.out.println("Oops! Please enter either water or land.");
            answer2 = scan.nextLine();
        }

        switch (answer2) {
            case "water":
                System.out.println("Great! Do you like salt or freshwater animals? Enter saltwater or freshwater.");
                break;
            case "land":
                System.out.println("Fantastic! Do you like furry or scaly animals? Enter furry or scaly.");
                break;
            default:
                break;
        }
        String answer3 = scan.nextLine();

        if (!answer3.equals("furry") && !answer3.equals("scaly") && !answer3.equals("saltwater") && !answer3.equals("freshwater")) {
            System.out.println("Oops! That wasn't right.");
            answer3 = scan.nextLine();
        }

        switch (answer3) {
            case "furry":
                System.out.println("Getting closer. Enter large or smallish. ");
                break;
            case "scaly":
                System.out.println("That's gross. But whatever. Enter venomous or docile?");
                break;
            case "saltwater":
                System.out.println("Cool. Enter giant or tiny.");
                break;
            case "freshwater":
                System.out.println("Cool. Enter big or small.");
                break;
            default:
                break;
        }
        String answer4 = scan.nextLine();

        if (!answer4.equals("large") && !answer4.equals("smallish") & !answer4.equals("venomous") & !answer4.equals("docile") & !answer4.equals("giant") & !answer4.equals("tiny") & !answer4.equals("big") & !answer4.equals("small")) {
            System.out.println("Oops! Try again.");
            answer4 = scan.nextLine();
        }
        switch (answer4) {
            case "large":
                System.out.println("You should get an Irish Wolfhound. For sure.");
                break;
            case "smallish":
                System.out.println("You should get some sort of cat.");
                break;
            case "venomous":
                System.out.println("You should get a rattlesnake, you sadistic bastard.");
                break;
            case "docile":
                System.out.println("You should get a salamander");
                break;
            case "giant":
                System.out.println("You should get a SHARK");
                break;
            case "tiny":
                System.out.println("You should get a guppie.");
                break;
            case "big":
                System.out.println("You should get a freshwater dolphin");
                break;
            case "small":
                System.out.println("You should get a river trout.");
                break;
            default:
                break;
        }
        System.out.println("Thanks, " + name + ". This fits you best because you like " + answer2 + " animals that are both " + answer3 + " and " + answer4 + ".");



    }
}

