
import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        oddNumbers();
    }
    public static void oddNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = scan.nextInt();
        scan.close();
        if(a < 0){
            System.out.println("enter the positive number");
            a = scan.nextInt();
        }
        int num = 1;
        for(int i = 1; i <= a; i++){
            if(i != 1){
                System.out.print(", ");
            }
            System.out.print(num);
            num  += 2;
        }
        
    
     
    }
}
