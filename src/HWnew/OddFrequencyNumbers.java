package HWnew;
import java.util.*;
public class OddFrequencyNumbers {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6,9, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15};
        List<Integer> oddFrequencyNumbers = findOddFrequencyNumbers(array);

        System.out.println("Numbers that appear an odd number of times:");
        for (int num : oddFrequencyNumbers) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> findOddFrequencyNumbers(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number in the array
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> oddFrequencyNumbers = new ArrayList<>();

        // Check if the frequency of each number is odd
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddFrequencyNumbers.add(entry.getKey());
            }
        }

        return oddFrequencyNumbers;
    }
}
