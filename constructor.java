import java.lang.*;
public class constructor {
    String name;
    int roll_no;
    int age;

    constructor(){
    name="Ravi";
    roll_no=2265;
    age =19;
    System.out.println("name: "+name+ " roll no: "+roll_no+ " age: "+age);

    }
    constructor(String n,int r, int ag){
        name=n;
        roll_no=r;
        age=ag;
        System.out.println("name: "+name+ " roll no: "+roll_no+ " age: "+age);

    }
    constructor(constructor obj){
        System.out.println("name: "+obj.name+ " roll no: "+obj.roll_no+ " age: "+obj.age);
    }
    public static void main(String[] args) {
        constructor c=new constructor();
        constructor c1=new constructor("Ravi", 2265, 19);
        constructor c2 = new constructor(c1);
    }
}
