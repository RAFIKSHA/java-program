public class problem1 {
    public void car(){
        System.out.println("Fathers car");
    }
}
class son extends problem1{
    public void car(){
        System.out.println("sons car");
    }
    
}
class min{
    public static void main(String[] args) {
        son s=new son();
       
        s.car();
        // int n=3;
        // do{
        //     System.out.println("n= "+n);  
        //     n--;
        // }while(n>0);
    }
}
