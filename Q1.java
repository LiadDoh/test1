import java.util.Scanner;

public class Q1 {


    public static int[] power() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(i, 2);
        }
        return arr;
    }
    public static int takeStairs(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return takeStairs(n - 1) + takeStairs(n - 2);
    }

    public static void main(String[] args) {
        int[] arr = power();
        for (int j : arr) {
            System.out.println(j);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(takeStairs(i));
        }
    }
}
