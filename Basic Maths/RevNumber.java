import java.util.*;

public class RevNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         if(n>=10 && n<100){
        int x = (n%10)*10;
        int y = (n/10);
        int z = x+y;
        System.out.println("Reversed Number is: " + z);
     }
    else if(n>=100 && n<1000){
        int a = (n%10)*100;
        int b = ((n/10)%10)*10;
        int c = (n/100);
        int h = a+b+c;
        System.out.println("Reversed Number is: " + h);
     }
      else if(n>=1000 && n<5000){
        int d = (n%10)*1000;
        int e = ((n/10)%10)*100;
        int f = ((n/100)%10)*10;
        int g = (n/1000);
        int l = d+e+f+g;
        System.out.println("Reversed Number is:" + l);
     }
    }
}
