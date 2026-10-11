class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        for (int i = 0; i < timeSeries.length-1; i++) {
            // if next attack occurs before current duration ends, include the difference
            if (timeSeries[i+1] <= timeSeries[i] + duration-1) {
                total += timeSeries[i+1] - timeSeries[i];
            } else { // add duration normally
                total += duration;
            }
        }
        total += duration; // include last attack from teemo
        return total;
    }
}