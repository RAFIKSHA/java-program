import java.util.Scanner;

public class add {
    int i;
    void display(){
        System.out.println(i);
    }
}
class B extends add{
    int j;
    void display(){
        System.out.println(j);
    }

    public static void main(String[] args) {
        B b=new B();
        b.i=1;
        b.j=2;
        b.display();
    }
}

