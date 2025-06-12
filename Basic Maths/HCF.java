import java.util.*;

public class HCF {
    public static void main(String[] args) {
        System.out.print("Enter the two numbers: ");

        Scanner sc = new Scanner(System.in);
          int x = sc.nextInt();
          int y = sc.nextInt();
          int z;
        if(x>y){
            z=y;
        }
        else{
            z=x;
        }
        for(int i=z; i>=1; i--){
            if(x%i==0 && y%i==0){
                System.out.println("HCF of the given numbers is: "+ i);
                break;
            }

        }
    }
}
