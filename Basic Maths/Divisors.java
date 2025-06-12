import java.util.*;


public class Divisors {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
         int count=0;
       for(int i=1;i<=x;i++){
        if(x%i==0){
            count++;
        }
       }
       int [] arr = new int[count];
       int j=0;
       for(int i=1;i<=x;i++){
        if(x%i == 0){
            arr[j] = i;
            j++;
        }
       }
       for(int i=0;i<count;i++){
        System.out.println("arr["+i+"] = "+ arr[i]);
       }
    }
}
