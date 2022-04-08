 class inheritance {
  int i;
 

}
class sub extends inheritance{
    int j;
    final void second(){
        System.out.println(j);
    }
    
}
class sub2 extends sub{
    int k;
    void third(){
        System.out.println(k);
    }
    
}
class Main{
 public static void main(String[] args) {
        sub2 e= new sub2();
       
        e.second();
        e.third();
    }
}