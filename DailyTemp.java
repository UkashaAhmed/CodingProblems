class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];

        for (int i = n - 2; i >= 0; i--) {
            int next = i + 1;
            while (next < n && temperatures[i] >= temperatures[next]) {
                if (answer[next] == 0) break; // No warmer day ahead
                next += answer[next];        // Skip ahead using jump table
            }
            if (next < n && temperatures[i] < temperatures[next]) {
                answer[i] = next - i; // Calculate days to the next warmer day
            }
        }

        return answer;
    }
}

/*
 * SUMMARY (Interview Style)
 * -------------------------
 * This solution solves Daily Temperatures in O(n) time using a 
 * reverse traversal + jump-ahead optimization.
 *
 * Key Idea:
 * We iterate from right to left so future results are already known.
 * For each day i, we look at the next day (i + 1). If that day is not
 * warmer, instead of checking day-by-day, we “jump ahead” using the
 * precomputed answer of that next day. This avoids unnecessary work 
 * and keeps the algorithm efficient.
 *
 * How It Works:
 * - Start from the second-last day and move backwards.
 * - While the next day is not warmer:
 *      • If that next day has no warmer future day (answer[next] == 0),
 *        then day i also has none → stop.
 *      • Otherwise jump ahead by answer[next] to skip cold days quickly.
 * - If a warmer day is found, store the difference (next - i).
 *
 * Result:
 * Each index points directly or indirectly to the next warmer day
 * without re-scanning the same days, giving an optimal linear solution.
 */
