package bt2;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Bước 1: Khai báo và khởi tạo mảng
        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        // Khởi tạo mảng với các giá trị mặc định
        System.out.println("Enter " + N + " elements for the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Nhập X là số cần chèn
        System.out.print("Enter the value to insert: ");
        int X = scanner.nextInt();

        // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.print("Enter the index where you want to insert the value: ");
        int index = scanner.nextInt();

        // Bước 4: Kiểm tra vị trí index có hợp lệ không
        if (index < 0 || index > array.length) {
            System.out.println("Cannot insert element at index " + index + ". Index out of range.");
        } else {
            // Bước 5: Thực hiện chèn phần tử X vào mảng
            // Tạo mảng mới có kích thước lớn hơn 1 phần tử
            int[] newArray = new int[array.length + 1];

            // Chèn phần tử vào mảng mới
            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == index) {
                    newArray[i] = X;  // Chèn X vào vị trí index
                } else {
                    newArray[i] = array[j++];  // Sao chép các phần tử từ mảng cũ
                }
            }

            // Bước 6: In ra mảng sau khi chèn
            for (int i = 0, j = 0; i < newArray.length; i++) {
                System.out.println(newArray[i]);
            }
        }

        scanner.close();

    }
}
