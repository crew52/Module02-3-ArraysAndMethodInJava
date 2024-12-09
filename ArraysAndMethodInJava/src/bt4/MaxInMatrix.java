package bt4;

import java.util.Scanner;

public class MaxInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tìm phần tử lớn nhất của ma trận có sẵn
        System.out.println("Bước 1: Ma trận có sẵn");
        double[][] matrix = {
                {1.2, 3.5, -2.1},
                {4.6, 0.0, 7.8},
                {-1.4, 6.9, 2.3}
        };

        // Tìm phần tử lớn nhất trong ma trận có sẵn
        findMaxInMatrix(matrix);

        // Bước 2: Tạo ma trận từ nhập liệu của người dùng
        System.out.println("\nBước 2: Ma trận từ nhập liệu của người dùng");
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        double[][] userMatrix = new double[rows][cols];

        // Thu thập giá trị từ người dùng
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                userMatrix[i][j] = scanner.nextDouble();
            }
        }

        // Tìm phần tử lớn nhất trong ma trận nhập liệu
        findMaxInMatrix(userMatrix);

        scanner.close();
    }

    // Hàm tìm phần tử lớn nhất và tọa độ trong ma trận
    public static void findMaxInMatrix(double[][] matrix) {
        int maxRow = 0, maxCol = 0;
        double maxValue = matrix[0][0];

        // Duyệt qua toàn bộ ma trận để tìm giá trị lớn nhất
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Hiển thị kết quả
        System.out.println("Giá trị lớn nhất là: " + maxValue);
        System.out.println("Tọa độ: [" + maxRow + "][" + maxCol + "]");
    }
}
