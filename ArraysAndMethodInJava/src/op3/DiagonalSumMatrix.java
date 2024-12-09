package op3;

import java.util.Scanner;

public class DiagonalSumMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tính tổng các phần tử của một ma trận vuông có sẵn
        System.out.println("Bước 1: Ma trận vuông có sẵn");
        double[][] matrix = {
                {1.5, 2.5, 3.5},
                {4.5, 5.5, 6.5},
                {7.5, 8.5, 9.5}
        };

        // Hiển thị ma trận
        System.out.println("Ma trận có sẵn:");
        printMatrix(matrix);

        // Tính tổng đường chéo chính
        double diagonalSum = calculateDiagonalSum(matrix);
        System.out.println("Tổng các phần tử trên đường chéo chính là: " + diagonalSum);

        // Bước 2: Thu thập mảng thực từ nhập liệu của người dùng
        System.out.println("\nBước 2: Ma trận vuông từ nhập liệu của người dùng");
        System.out.print("Nhập kích thước của ma trận vuông: ");
        int size = scanner.nextInt();

        double[][] userMatrix = new double[size][size];

        // Nhập giá trị từ người dùng
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                userMatrix[i][j] = scanner.nextDouble();
            }
        }

        // Hiển thị ma trận người dùng nhập
        System.out.println("Ma trận của bạn:");
        printMatrix(userMatrix);

        // Tính tổng đường chéo chính
        diagonalSum = calculateDiagonalSum(userMatrix);
        System.out.println("Tổng các phần tử trên đường chéo chính là: " + diagonalSum);

        scanner.close();
    }

    // Hàm tính tổng các phần tử trên đường chéo chính
    public static double calculateDiagonalSum(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // Lấy phần tử ở vị trí [i][i]
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
