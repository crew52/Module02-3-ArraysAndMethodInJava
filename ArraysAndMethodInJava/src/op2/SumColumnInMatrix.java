package op2;

import java.util.Scanner;

public class SumColumnInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tính tổng các phần tử của một cột trong mảng có sẵn
        System.out.println("Bước 1: Mảng có sẵn");
        double[][] matrix = {
                {1.2, 2.5, 3.1},
                {4.0, 5.6, 6.3},
                {7.8, 8.9, 9.4}
        };

        // Hiển thị mảng
        System.out.println("Mảng có sẵn:");
        printMatrix(matrix);

        // Hỏi người dùng cột cần tính tổng
        System.out.print("Nhập thứ tự cột cần tính tổng (tính từ 0): ");
        int column = scanner.nextInt();

        // Tính tổng của cột trong mảng có sẵn
        double sum = calculateColumnSum(matrix, column);
        System.out.println("Tổng các phần tử ở cột " + column + " là: " + sum);

        // Bước 2: Thu thập mảng thực từ nhập liệu của người dùng
        System.out.println("\nBước 2: Mảng từ nhập liệu của người dùng");
        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        double[][] userMatrix = new double[rows][cols];

        // Nhập giá trị từ người dùng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                userMatrix[i][j] = scanner.nextDouble();
            }
        }

        // Hiển thị mảng người dùng nhập
        System.out.println("Mảng của bạn:");
        printMatrix(userMatrix);

        // Hỏi cột cần tính tổng
        System.out.print("Nhập thứ tự cột cần tính tổng (tính từ 0): ");
        column = scanner.nextInt();

        // Tính tổng
        sum = calculateColumnSum(userMatrix, column);
        System.out.println("Tổng các phần tử ở cột " + column + " là: " + sum);

        scanner.close();
    }

    // Hàm tính tổng các phần tử của một cột
    public static double calculateColumnSum(double[][] matrix, int column) {
        double sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (column < matrix[i].length) {
                sum += matrix[i][column];
            } else {
                System.out.println("Cột " + column + " không tồn tại trong hàng " + i);
                return 0;
            }
        }

        return sum;
    }

    // Hàm in ma trận
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
