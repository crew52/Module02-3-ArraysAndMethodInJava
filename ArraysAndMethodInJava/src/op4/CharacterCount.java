package op4;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo một chuỗi và gán giá trị
        String str = "Hello, welcome to the programming world!";

        // Hiển thị chuỗi cho trước
        System.out.println("Chuỗi cho trước: " + str);

        // Bước 2: Nhập ký tự từ bàn phím
        System.out.print("Nhập một ký tự cần đếm: ");
        char characterToCount = scanner.next().charAt(0);

        // Bước 3: Khai báo biến count và gán giá trị 0
        int count = 0;

        // Bước 4: Duyệt từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == characterToCount) {
                count++; // Tăng biến đếm nếu ký tự trùng khớp
            }
        }

        // Bước 5: In ra kết quả
        System.out.println("Ký tự '" + characterToCount + "' xuất hiện " + count + " lần trong chuỗi.");

        scanner.close();
    }
}
