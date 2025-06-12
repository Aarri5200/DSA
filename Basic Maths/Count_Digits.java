import java.util.*;

public class Count_Digits{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=0 && n<10){
            System.out.println("Number of Digits: 1");
        }
        else if(n>=10 && n<100){
            System.out.println("Number of Digits: 2");
        }
        else if(n>=100 && n<1000){
            System.out.println("Number of Digits: 3");
        }
        else if(n>=1000 && n<10000){
            System.out.println("Number of Digits: 4");
        }
    }
}