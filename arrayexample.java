import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class arrayexample {
    
        public static void main(String[] args) {
        // float sum=0;
        // float array[] = {1.1f,2.2f,3.5f};

        // for (float element : array) {
        //     sum=sum+element;

        // }
        // System.out.println(sum);

        // int array[] = {122,20,55,44,66,88,99};
        // int num=43;
        // boolean isArray=false;
        // for (int j : array)
            
        // {
        //     if(num==j)
        //        {
        //         isArray=true;
        //         break;
        //        }
            
        // } if (isArray) {
        //     System.out.println("elemente is found");
        // }else{
        //     System.out.println("elemente is not found");
        //    }

        ///problem 3

//         int marks[] = {75,80,85,84,76,88,99};
//         int avg=0;
//         for(int i:marks){
//             avg=avg+i;        
//         }
// System.out.println("avrage of all  student in physics sub: "+avg/marks.length+"%");
//sum of 2X3 array
// int array1[][]={{1,2,3},{4,5,6}};
// int array2[][]={{1,2,3},{4,5,6}};
// int result[][]={{0,0,0},{0,0,0}};
// for(int i=0;i<array1.length;i++){
//     for(int j=0;j<array1[i].length;j++){
//         result[i][j]=array1[i][j]+array2[i][j];
//     }
// }
// for(int i=0;i<array1.length;i++){
//     for(int j=0;j<array1[i].length;j++){
//         System.out.print(result[i][j]+" ");
//         result[i][j]=array1[i][j]+array2[i][j];
        
//     }
//     System.out.println(" ");
// }

//reverse array

    //      int arr[] = {75,80,85,84,76,88,99};
    //      int l=arr.length;
    //     int reverse=Math.floorDiv(l, 2);
    //     int temp;
    //     for(int i=0;i<reverse;i++){
    //         temp=arr[i];
    //         arr[i]=arr[l-i-1];
    //         arr[l-i-1]=temp;

    //  }for (int element : arr) {
    //     System.out.println(element );   
    //  }
//max element in the array

// int arr[] = {75,80,85,84,76,88,99};
// int max=0;
// for (int i : arr) {
//     if(i>max){ 
//         max=i;
//     }   
// } System.out.println("max element: "+max);

//min element of the array

// int arr[] = {75,80,85,84,76,7,5};
// int min=arr[0];
// for (int i=0;i<arr.length;i++) {
//     if(arr[i]<min){ 
//         min=arr[i];
//     } 
// }  System.out.println("min element: "+min); 
//Check 
//if array is sorted or not
boolean isSorted=true;
int arr[] = {8,17,10,11,12};
for(int i=0;i<arr.length-1;i++){
    if(arr[i]>arr[i+1]){
        isSorted=false;
        break;
    }
}if(isSorted){
    System.out.println("arry is sorted");
}else{
    System.out.println("array is not sorted");
}
}
}