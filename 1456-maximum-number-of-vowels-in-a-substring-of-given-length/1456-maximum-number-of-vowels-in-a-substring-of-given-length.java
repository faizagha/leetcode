class Solution {

public int maxVowels(String s, int k) {
        int maxCount = 0;
        int tempCount = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                tempCount++;
            }
        }
        maxCount = tempCount;

        // Slide the window and update the count
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                tempCount--; // Remove the leftmost character from the previous window
            }
            if (isVowel(s.charAt(i))) {
                tempCount++; // Add the rightmost character of the current window
            }

            maxCount = Math.max(tempCount, maxCount);
        }

        return maxCount;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}