import java.util.Scanner;

public class Game {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String playerInput = scanner.nextLine();
        gameContinues();

        public static void beginGame(Scanner scanner){
            System.out.println("Are you ready to begin your quest? (y/n)");
            String playerReply = scanner.nextLine();
            if (playerReply.equals("y")) {
                System.out.println("Your quest starts now. ");
            }

        }

//        while (true) {

//            System.out.println("Are you ready to begin?");
//            String answer = scanner.nextLine();
//            if (answer.toLowerCase().equals("yes")) {
//                System.out.println("Your quest starts now.");
//            }else{
//                break;
//            }

        }

    public static void gameContinues(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String playerName = scanner.nextLine();

    }

}
