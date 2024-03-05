import java.util.Scanner;

public class Lav02JPA04 {
    public static void main(String[] args) {
        for (int i =0 ; i<2 ; i++){ 
        System.out.println("Input:");
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();
        if (number1 % 5 == 0 & number1 % 9==0) {
            System.out.println("Yes");
            
        }else{
            System.out.println("No");

        }

    }  
    }
}
