import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        System.out.println("<=(⬤‿⬤)=＞" +
                "The Quest for Baby Yoda's Coffee");
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
        System.out.printf("Welcome, young master %s. We have much faith you will successfully accomplish your " +
                        "mission.\n Baby Yoda is in disguise and its our job to safely get him passed storm trooper " +
                "check points \n in and out of cities, the storm troopers are every where so you must be careful. \n " +
                "Choose wisely whether to fight, hide, or run to save baby " +
                "Yoda. \n Along the way you need to collect points to keep baby Yoda alive with coffee and frog " +
                "biscuits.\n Good luck, young Padawan! May the force be with you.", playerName);

        }
//        public static int firstQuestLevel (int lives, int defeatingTheEnemy){
//            System.out.println("Your current stats are: " );
//        }
}