import java.util.Scanner;

public class Lav02JPA04 {
    public static void main(String[] args) {
        // 建立一個 Scanner 物件，迴圈外部使用
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Input:");

            if (scanner.hasNextInt()) {
                int number1 = scanner.nextInt();

                if (number1 % 5 == 0 && number1 % 9 == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                // 清空 scanner 的緩衝區
                scanner.next();
            }
        }

        // 關閉 Scanner
        scanner.close();
    }
}

