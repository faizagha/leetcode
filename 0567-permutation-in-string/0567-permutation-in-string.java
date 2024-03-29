class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len2 < len1){
            return false;
        }
        int[] s1Cnt = new int[26];
        int[] currCnt = new int[26];
        for (char ch : s1.toCharArray()){
            s1Cnt[ch - 'a']++;
        }
        for (int i = 0; i < len1; i++) {
            currCnt[s2.charAt(i) - 'a']++;
        }
        int j = 0;
        for (int i = len1; i < len2; i++) {
            if (Arrays.compare(s1Cnt, currCnt) == 0) {
                return true;
            }
            currCnt[s2.charAt(i) - 'a']++;
            currCnt[s2.charAt(j) - 'a']--;
            j++;
        }
        return Arrays.compare(s1Cnt, currCnt) == 0;
    }
}
