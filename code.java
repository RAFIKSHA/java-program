

public class code
{
      public int x;
      private int y;
      void cal(int a,int b)
      {
              x=a+1;

              y=b;
      }

        

}
        
         class access_specifier{
        
                public static void main(String args[]){
                code c=new code();
                c.cal(2, 3);
                System.out.println(c.x+ " "+c.y);
                
                }
}
