import java.util.Scanner;

public class Exp4Solution {
    public static void main(String[] args) {
        System.out.println("First Matrix: ");
        Matrix first = new Matrix();

        System.out.println("Second Matrix: ");
        Matrix second = new Matrix();

        System.out.println("Addition of both Matrices is: ");
        System.out.println(first.add(second));

        System.out.println("Subtraction of Second Matrix from First is: ");
        System.out.println(first.subtract(second));

        System.out.println("Multiplication of both Matrices is: ");
        System.out.println(first.multiply(second));
    }
}

class Matrix {
    private int[][] matrix = null;

    public Matrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter No. of Columns: ");
        int cols = sc.nextInt();
        System.out.println("Enter Elements of Matrix of Size " + rows + " * " + cols + ":");
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }
        matrix = arr;
    }

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix add(Matrix other) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] _other = other.toArray();
        int _rows = _other.length, _cols = _other[0].length;
        if (rows == _rows && cols == _cols) {
            int[][] ans = new int[rows][cols];
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < cols; ++j) {
                    ans[i][j] = matrix[i][j] + _other[i][j];
                }
            }
            return new Matrix(ans);
        } else {
            System.out.println("Operation Undefined!");
            return new Matrix(null);
        }
    }

    public Matrix multiply(Matrix other) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] _other = other.toArray();
        int _rows = _other.length, _cols = _other[0].length;
        if (cols != _rows) {
            System.out.println("Operation Undefined!");
            return new Matrix(null);
        }
        int[][] ans = new int[rows][_cols];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < _cols; ++j) {
                int tmp = 0;
                for (int k = 0; k < _rows; ++k) {
                    tmp += matrix[i][k] * _other[k][j];
                }
                ans[i][j] = tmp;
            }
        }
        return new Matrix(ans);
    }

    public Matrix subtract(Matrix other) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] _other = other.toArray();
        int _rows = _other.length, _cols = _other[0].length;
        if (rows == _rows && cols == _cols) {
            int[][] ans = new int[rows][cols];
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < cols; ++j) {
                    ans[i][j] = matrix[i][j] - _other[i][j];
                }
            }
            return new Matrix(ans);
        } else {
            System.out.println("Operation Undefined!");
            return new Matrix(null);
        }
    }

    public int[][] toArray() {
        return matrix;
    }

    @Override
    public String toString() {
        if (matrix == null) {
            return "";
        }
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return "";
    }
}