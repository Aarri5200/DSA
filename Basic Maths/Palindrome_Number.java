import java.util.*;

public class Palindrome_Number {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while(n != 0){
           int x = n%10;
            n = n/10;
            rev = rev*10 + x;
        }
        
        if(rev == original){
            System.out.println("The given number is Palindrome: "+ rev);
        }
        else{
             System.out.println("The given number is not Palindrome: "+ rev);
        }
    }
}
