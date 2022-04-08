package packageex;
public class superkey {
     int i;
    
    void one(){
    System.out.println(i);

    }
    superkey(int a, int b){
       this.i=a+b;
        System.out.println(i);  
    }
}
class B extends superkey{
    int j;
    B(int a,int b){
    super(a,b);
        System.out.println(i);
        
        j=a+b;
    
    }
}
class Main1{
    public static void main(String[] args) {
           B e= new B(10,20);
           
         
       }
   }