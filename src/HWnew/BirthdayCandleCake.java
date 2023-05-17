package HWnew;

import java.util.*;
public class BirthdayCandleCake {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of candles: ");
	        int n = sc.nextInt();

	        int[] candles = new int[n];
	        System.out.println("Enter the heights of the candles: ");
	        for (int i = 0; i < n; i++) {
	            candles[i] = sc.nextInt();
	        }

	        int tallestCandles = countTallestCandles(candles);
	        System.out.println("The number of candles that are tallest: " + tallestCandles);

	        sc.close();
	    }

	    public static int countTallestCandles(int[] candles) {
	        int max = candles[0];
	        int count = 1;

	        for (int i = 1; i < candles.length; i++) {
	            int height = candles[i];
	            if (height > max) {
	                max = height;
	                count = 1;
	            } else if (height == max) {
	                count++;
	            }
	        }

	        return count;
	    }
}
