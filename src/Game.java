import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        System.out.println("The Quest for Baby Yoda's Coffeey");
        Scanner scanner = new Scanner(System.in);
//        String playerInput = scanner.nextLine();
        beginGame(scanner);
        gameContinues();


        }


    public static void beginGame(Scanner scanner){
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you ready to begin your quest? (y/n)");
        String playerReply = scanner.next();
        if (playerReply.equals("y")) {
            System.out.println("Your quest starts now. ");
        }

    }
    public static void gameContinues(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String playerName = scanner.nextLine();

        }
}