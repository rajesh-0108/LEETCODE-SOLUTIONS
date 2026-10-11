import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> hs = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            // Process each distinct number only once
            if (visited.contains(arr[i])) {
                continue;
            }
            visited.add(arr[i]);

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (hs.contains(count)) {
                return false;
            }

            hs.add(count);
        }

        return true;
    }
}