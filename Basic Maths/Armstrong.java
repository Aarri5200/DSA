import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int count = 0;
     int sum=0;
     int original = n;
     int t=n;
     int x;
     while(t !=0 ){
          x = t%10;
          t=t/10;
          count++;
     }
     System.out.println("The number of digits in the number is: "+ count);
     while(n !=0 ){
           x = n%10;
          n=n/10;
          sum += Math.pow(x, count);
     }
     if (sum == original){
       System.out.println("The number is an armstrong number");
     }
     else{
        System.out.println("The number is not an armstrong number");
     }

    }
}
