package final2023.matrix;

import java.util.Arrays;
import java.util.Random;

public class SquareMatrixTestDrive {
    public static void main(String[] args) {
        /* TODO
        Tạo ra 2 ma trận có cùng kích thước là một số ngẫu nhiên nằm trong đoạn [5, 10].
        Viết code thực hiện test các chức năng sau của các ma trận:
          - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
          - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
          - In ra ma trận là ma trận tổng của 2 ma trận.
          - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
          - In ra ma trận là ma trận tích của 2 ma trận.
          - In ra các số nguyên tố có trong 2 ma trận.

         Lưu kết quả chạy chương trình trên terminal vào file text và nộp cùng source code chương trình.
         File text kết quả được đặt tên như sau: <TenSinhVien_MaSinhVien_Matrix.txt> (Ví dụ, NguyenVanA_123456_Matrix.txt).
         */

        Random random = new Random();

        // Tạo ra 2 ma trận có cùng kích thước là một số ngẫu nhiên nằm trong đoạn [5, 10].
        int size = random.nextInt(5, 11);
        SquareMatrix squareMatrix1 = new SquareMatrix(size);
        SquareMatrix squareMatrix2 = new SquareMatrix(size);

        printTranspose(squareMatrix1);
        printTranspose(squareMatrix2);
        System.out.println("===============================\n");

        printDiags(squareMatrix1);
        printDiags(squareMatrix2);
        System.out.println("===============================\n");

        printAdd(squareMatrix1, squareMatrix2);
        System.out.println("===============================\n");

        printMinus(squareMatrix1, squareMatrix2);
        System.out.println("===============================\n");

        printMultiply(squareMatrix1, squareMatrix2);
        System.out.println("===============================\n");

        printPrimes(squareMatrix1);
        printPrimes(squareMatrix2);
        System.out.println("===============================\n");

        printSorted(squareMatrix1);
        printSorted(squareMatrix2);
        System.out.println("===============================\n");
    }


    // In ra ma trận và ma trận chuyển vị tương ứng.
    private static void printTranspose(SquareMatrix squareMatrix) {
        System.out.println("Ma trận:");
        System.out.println(squareMatrix);
        System.out.println("Ma trận chuyển vị:");
        System.out.println(squareMatrix.transpose());
    }

    // In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
    private static void printDiags(SquareMatrix squareMatrix) {
        System.out.println("Primary diag: ");
        System.out.println(Arrays.toString(squareMatrix.principalDiagonal()));
        System.out.println("Second diag: ");
        System.out.println(Arrays.toString(squareMatrix.secondaryDiagonal()));
    }

    // In ra ma trận là ma trận tổng của 2 ma trận.
    private static void printAdd(SquareMatrix squareMatrix1, SquareMatrix squareMatrix2) {
        System.out.println("Sum of 2 matrix: ");
        System.out.println(squareMatrix1.add(squareMatrix2));
    }

    // In ra ma trận là ma trận hiệu của 2 ma trận.
    private static void printMinus(SquareMatrix squareMatrix1, SquareMatrix squareMatrix2) {
        System.out.println("Subtract of 2 matrix: ");
        System.out.println(squareMatrix1.minus(squareMatrix2));
    }

    // In ra ma trận là ma trận tich của 2 ma trận.
    private static void printMultiply(SquareMatrix squareMatrix1, SquareMatrix squareMatrix2) {
        System.out.println("Multiply of 2 matrix: ");
        System.out.println(squareMatrix1.multiply(squareMatrix2));
    }

    // In ra các số nguyên tố có trong ma trận.
    private static void printPrimes(SquareMatrix squareMatrix) {
        System.out.println("Primes of matrix: ");
        System.out.println(Arrays.toString(squareMatrix.primes()));
    }

    // In ra ma trận được sắp xếp
    private static void printSorted(SquareMatrix squareMatrix) {
        System.out.println("Sort matrix: ");
        System.out.println(squareMatrix.getSortedMatrix());
    }
}
