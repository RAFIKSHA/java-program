class javaex {
    void getdata(){
        system.out.println("Enter your subjects marks");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter english marks");
        int eng=sc.nextInt();

        System.out.println("enter physics marks");
        int phy=sc.nextInt();

        System.out.println("enter chemistry marks");
        int chem=sc.nextInt();

        System.out.println("enter biology marks");
        int bio=sc.nextInt();  
    }
    void display(){
        int total;
        total=eng+phy+chem+bio/100;
        System.out.println("your percentage is: "+total);
       

    }
    public static void main(String[] args) {
        javaex j=new javaex();
        j.getdata();
        j.display();
    }

    
}

