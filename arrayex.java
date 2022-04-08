import java.util.Scanner;
import java.lang.*;
import java.lang.reflect.Array;
public class arrayex {
    void pass(int arr[]){
        System.out.println("//passing array to method ");
        System.out.println("array element are: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]); 
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        int a[]= new int[s];
    

        System.out.println("Enter "+s+" array element");
        for(int i=0;i<s;i++){
         a[i]=sc.nextInt();
        }
        System.out.println("array element are: ");
        for(int i=0;i<s;i++){
            System.out.println(a[i]);
        }

        //passing array to method
        int array2[]={10,20,30,40,50};
        arrayex ar=new arrayex();
        ar.pass(array2);
    }
}
