import java.util.Scanner;  
public class reverseArray
{
  public static void main(String [] args)
 {
   Scanner sc = new Scanner(System.in);
     System.out.print(" how many numbers u want to store :: ");
     int n = sc.nextInt();
     System.out.println(" ");
     int arr[] = new int[n];
      for(int i = 0;i<n;i++)
        {
          arr[i] = sc.nextInt();
        }
         System.out.println(" the reverse array is :: ");
         {
          for(int i = arr.length-1;i>=0;i--)
          {
           System.out.print(arr[i]+" ");
          }
         }    
 }
}


