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
            int mod = number % 2;//lấy phần dư của phép chia cho 2 để push vào Stack bên dưới
            decToBin.push(mod);//nhận lấy phần dư ở phép chia phía trên và push vào
            number /= 2;//Gán lại number = phần nguyên của phép chia cho 2 để dùng cho vòng lặp tiếp theo
        } while (number != 0);//kiểm tra điều kiện để dừng vòng lặp khi number trở về= 0
        int sizeStack = decToBin.size();//kiểm tra kích thước của stack, dùng cho vòng lặp for phía dưới
        for (int i = 0; i < sizeStack; i++) {
            //Pop để lấy ra lần lượt từng phần tử trong stack
            //Nối danh sách số dư theo chiều ngược lại sẽ gia giá trị nhị phân
            int numberBin = decToBin.pop();
            bin += numberBin;
        }
        System.out.println("Số nhị phân là: " + bin);
    }
}
