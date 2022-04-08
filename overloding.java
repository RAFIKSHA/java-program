public class overloding {
  static void get(int x, int y){
     int a=x;
     int b=y;
     int add=a+b;
       System.out.println("addition: "+add);
   } 
  static void get(int x, int y,int z){
      int d=x;
      int e=y;
      int f=z;
      int add=d+e+f;
    System.out.println("add of 3 ele: "+add);
   }



   public static void main(String[] args) {
       get(5,6);
       get(5,6,8);
   }
}

