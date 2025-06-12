import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count=0;
        for(int i=1;i<=x;i++){
            if(x%i==0 && x!=1){
                count++;
            }
        }
        if(count==2){
            System.out.println("The given number is a prime number: "+ x);
        }
        else if(x==1 || count!=2){
            System.out.println("The given number is not a prime number: "+ x);
        }
    }
}
