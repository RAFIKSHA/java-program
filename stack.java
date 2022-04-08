import java.util.Scanner;

class stack1{
    int stack[]=new  int[5];
    int top=-1;
    int item;
     
    void push(){
if(top==5){
    System.out.println("stack is full");
} else{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter elment");
    int item =sc.nextInt();
    top=top+1;
    stack[top]=item;
     System.out.println("data is pushed");
}
    }
    void pop(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
           int item=stack[top];
            System.out.println("element poped: "+stack[item]);
            top=top-1;
            
        }




}void display(){
    for(int i=0;i>=0;i--){
    System.out.println(stack[i]);
    }
    }
    public static void main(String[] args) {
        stack1 s=new stack1();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice");
        System.out.println("1: push \n 2: pop \n 3: display");
        int ch=sc.nextInt();
        while(ch==1){
        switch(ch){
case 1:  s.push();
break;
case 2:  s.pop();
break;
case 3:  s.display();
break;
        }}
       
       
      
        
    }
  
}

