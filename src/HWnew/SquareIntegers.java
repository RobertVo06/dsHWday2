package HWnew;
import java.util.Scanner;
public class SquareIntegers {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number of test cases: ");
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            System.out.println();
            System.out.println("Please input the lower range boundary: ");
            int a = sc.nextInt();
            System.out.println("Please input the upper range boundary: ");
            int b = sc.nextInt();
            int result = countSquareIntegers(a, b);
            System.out.println("-- The number of square integers in the range: " + result);
        }
        sc.close();
    }

    public static int countSquareIntegers(int a, int b) {
        int start = (int) Math.ceil(Math.sqrt(a));
        int end = (int) Math.floor(Math.sqrt(b));
        return end - start + 1;
    }

}
