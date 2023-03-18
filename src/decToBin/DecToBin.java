package decToBin;

import java.util.Scanner;
import java.util.Stack;

public class DecToBin {
    public static void convertDecToBin(Scanner scanner) {
        Stack<Integer> decToBin = new Stack<>();
        String bin = "";
        System.out.print("Nhập vào một số: ");
        int number = Integer.parseInt(scanner.nextLine());
        do {
            //Phép chia lấy phần dư để đưa vào Stack, vòng lặp dừng lại khi phép chia phần nguyên về = 0
            int mod = number % 2;
            decToBin.push(mod);
            number /= 2;
        } while (number != 0);
        int sizeStack = decToBin.size();
        for (int i = 0; i < sizeStack; i++) {
            //Nối danh sách số dư theo chiều ngược lại sẽ gia giá trị nhị phân
            int numberBin = decToBin.pop();
            bin += numberBin;
        }
        System.out.println("Số nhị phân là: " + bin);
    }
}
