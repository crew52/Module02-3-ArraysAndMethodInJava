package bt1;

import java.sql.Array;
import java.util.Scanner;

public class RemoveElementFromArray {

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        int n = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                index_del = i;
                break;
            }
        }

        // Kiểm tra nếu X không tồn tại
        if (index_del == -1) {
            System.out.println("Phần tử " + n + " không tồn tại trong mảng.");
        } else {
            // Bước 4: Xoá phần tử X khỏi mảng
            for (int i = index_del; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            // Giảm kích thước mảng (thực chất là bỏ qua phần tử cuối)
            n--;

            // Bước 5: In mảng sau khi xoá
            System.out.println("Mảng sau khi xoá phần tử " + n + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }

        scanner.close();


    }
}
