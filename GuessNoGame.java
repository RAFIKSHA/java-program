import java.util.*;

public class GuessNoGame {
    int no;
    int input_no;
    public int noOfGusses=0;
    
    public int getNoOfGusses() {
        return noOfGusses;
    }
    public void setNoOfGusses(int noOfGusses) {
        this.noOfGusses = noOfGusses;
    }
    GuessNoGame(){
        Random random =new Random();
        this.no=random.nextInt(100);
    }
    public void userInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("guess your no");
        int input_no=sc.nextInt(); 

    }
    boolean iscorrect(int no){
        noOfGusses++;
        if(input_no==no){
            System.out.format("You guess no %d is correct %d attemts",no,noOfGusses);
         return true;
        }else if (input_no<no) {
            System.out.println("your no is less");
        } 
        else if(input_no>no) {
            System.out.println("your no is high");
        }
        return false;
    }
}

    public static void main(String[] args) {
        GuessNoGame g=new GuessNoGame();
        boolean b=false;
        while(!b){
            g.userInput();
            b = g.iscorrect();
        System.out.println(b);
    }
        
    }
    
    
}
