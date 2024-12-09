package bt5;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo mảng số nguyên với kích thước SIZE phần tử
        System.out.print("Nhập kích thước của mảng: ");
        int SIZE = scanner.nextInt();
        int[] array = new int[SIZE];

        // Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Bước 3: Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
        int min = array[0];

        // Bước 4: Duyệt mảng từ phần tử thứ 2 đến hết mảng
        for (int i = 1; i < SIZE; i++) {
            if (array[i] < min) {
                min = array[i]; // Cập nhật giá trị nhỏ nhất
            }
        }

        // Bước 5: Kết thúc duyệt mảng. In ra giá trị nhỏ nhất.
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);

        scanner.close();
    }
}
