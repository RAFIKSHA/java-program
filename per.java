import java.util.Scanner;
class per {
    public static void main(String[] args) {
        float eng,phy,bio,chem;
    
            System.out.println("Enter your subjects marks");
            Scanner sc=new Scanner(System.in);
            System.out.println("enter english marks");
            eng=sc.nextInt();
    
            System.out.println("enter physics marks");
            phy=sc.nextInt();
    
            System.out.println("enter chemistry marks");
            chem=sc.nextInt();
    
            System.out.println("enter biology marks");
             bio=sc.nextInt();  
    
     
            float total;
            total=(eng+phy+chem+bio)/4;
            System.out.println("your percentage is: "+total);
    
}}

