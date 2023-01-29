import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class tWOsUM2 {
    public static List<Pair<Integer, Integer>> twoSum(List<Integer> arr, int target, int n) {
        List<Pair<Integer, Integer>> solution = new ArrayList<>();
        Collections.sort(arr);
        int start_index = 0;
        int end_index = arr.size() - 1;
        for (start_index = 0; start_index <= end_index - 1;) {
            if (arr.get(start_index) + arr.get(end_index) == target) {
                Pair<Integer, Integer> pairing = new Pair<>(arr.get(start_index), arr.get(end_index));
                solution.add(pairing);
                start_index++;
                end_index--;
            } else if (arr.get(start_index) + arr.get(end_index) < target) {
                start_index++;
            } else {
                end_index--;
            }
        }
        if (solution.size() == 0) {
            Pair<Integer, Integer> pairing = new Pair<>(-1, -1);
            solution.add(pairing);
            return solution;
        }
        return solution;
    }
}
