public class recursion_in_java {
//     static int factorial(int n){
// if(n==0 || n==1){
//     return 1;
// }else{
//     return n*factorial(n-1);
// }
//     }
//     static int factorial_itration(int n){
//         if(n==0 || n==1){
//             return 1;
//         }else{
//            int product=1;
//            for(int i=1;i<=n;i++){
//                product=product*i;
//            }return product;
//         }
//             }

static int fibonacci_series(int n){
   if(n<=1){
       return n;
   }else{
       return fibonacci_series(n-1)+fibonacci_series(n-2);
   }
    
}
    
    public static void main(String[] args) {
        // int x=5;
        // System.out.println("factorial using recursion: "+factorial(x));
        // System.out.println("factorial using recursion: "+factorial_itration(x));
        int n=10;
        for(int i=0;i<n;i++){
            System.out.println(fibonacci_series(i));
            
        }
        
    }
    
}
