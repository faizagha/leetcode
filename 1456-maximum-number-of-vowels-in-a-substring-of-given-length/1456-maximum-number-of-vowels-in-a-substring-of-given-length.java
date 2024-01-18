class Solution {

public int maxVowels(String s, int k) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int maxCount = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))){
                maxCount++;
            }
        }
        int tempCount = maxCount;
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k))){
                tempCount--;
            }
            if (vowels.contains(s.charAt(i))){
                tempCount++;
            }
            maxCount = Math.max(tempCount,maxCount);
        }

        return maxCount;
    }
}