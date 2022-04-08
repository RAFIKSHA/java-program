import java.util.*;

public class RSPGAME {
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("How Many Round Would You Like To Play");
        int round= Integer.parseInt(sc.nextLine());
        for(int i=0;i<round;i++){

        
        System.out.println("Play Your Move (ROCK, SCISSORS, PAPER) ");
        String player_move=sc.nextLine();

        Random random =new Random();
        int random_number=random.nextInt(3);

        String computer_Move;
        if(random_number==0){
            computer_Move="ROCK";
        }else if (random_number==1) {
            computer_Move="SCISSORS";
        } else {
            computer_Move="PAPER";
        }
        System.out.println("computer chose: "+computer_Move+"*");

        if(player_move.equals(computer_Move)){
            System.out.println("Tie/Draw");
            System.out.println("*********");
        }else if (player_move.equals("ROCK")) {
            if(computer_Move.equals("SCISSORS")){
            System.out.println("YOU WIN!");
            System.out.println("*********");
            }
        } else if(computer_Move.equals("PAPER")) {
            System.out.println("YOU LOSS!");
            System.out.println("*********");
        }else if(player_move.equals("PAPER")){
            if(computer_Move.equals("SCISSORS")){
                System.out.println("YOU LOSS!!");
                System.out.println("*********");
            }
        }else if(computer_Move.equals("ROCK")){
            System.out.println("YOU WIN!");
            System.out.println("*********");
        }else if(player_move.equals("SCISSORS")){
            if(computer_Move.equals("PAPER")){
                System.out.println("YOU WIN!");
                System.out.println("*********");
            }
        }else{
            System.out.println("Your Move are Invalid");
        }
        }
            
        }}
    

