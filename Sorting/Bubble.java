import java.util.*;

public class Bubble{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of the array: ");
          int n = sc.nextInt();
          int [] arr = new int[n];
          

          for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element: ");
            arr[i] = sc.nextInt();
          }

          for(int i=0;i<(n-1);i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
          }
 for(int i=0;i<n;i++){
            System.out.println("Sorted array "+i+ " element: "+arr[i]);
          }
    }
}

    

