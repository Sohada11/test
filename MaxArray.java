import java.util.Arrays;
import java.util.Scanner;
   
public class MaxArray{
	public static void main (String[]args){
        int sum;
        sum = 0;
        Scanner s= new Scanner (System.in);
        System.out.println("Enter the length  of the Array: ");
        int arrlength = s.nextInt();
        
        int myArray[] = new int[arrlength];
        System.out.println("Enter the elements of the array: ");
        
      for(int i=0; i<arrlength; i++){
          
          myArray[i] = s.nextInt();
          sum = sum + myArray[i];
          
      }
        int max = myArray[0];
        for(int i=0; i<myArray.length; i++){
        
        if(myArray[i]> max){
            max = myArray[i];
        }
    }
        System.out.println(Arrays.toString(myArray));
        System.out.println("The summation of the array of elements: " +sum);
        System.out.println("Max value is: " +max);
        
        
          
      }
}