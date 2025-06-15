import java.util.*;

public class Selection{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of the array: ");
          int n = sc.nextInt();
          int [] arr = new int[n];
          

          for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element: ");
            arr[i] = sc.nextInt();
          }

          for(int j=0;j<n-1;j++){
           int min=j;
             for(int k=j+1;k<n;k++){
                   if(arr[k]<arr[min]){
                    min = k;
                   }
             }
             int temp = arr[j];
             arr[j] = arr[min];
             arr[min] = temp;
          }

          for(int i=0;i<n;i++){
            System.out.println("Sorted array "+i+ " element: "+arr[i]);
          }

    }
}


