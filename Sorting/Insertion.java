import java.util.*;

public class Insertion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of the array: ");
          int n = sc.nextInt();
          int [] arr = new int[n];
          

          for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element: ");
            arr[i] = sc.nextInt();
          }

          for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
          }

            for(int i=0;i<n;i++){
            System.out.println("Sorted array "+i+ " element: "+arr[i]);
          }
    }
}
