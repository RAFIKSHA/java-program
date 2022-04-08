package packageex;

import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

class statickey {
    static int i=10;
}
class sub1 extends statickey{
    
   static int dis(int b) {
    int a=b;
    return a;
        }
  
}
class main0{
    public static void main(String[] args) {
        
         System.out.println(statickey.i);
         int d=sub1.dis(5);
         System.out.println(d);

        
         
       }
   }