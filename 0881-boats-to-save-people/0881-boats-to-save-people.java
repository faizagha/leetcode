import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // Case where only 1 boat is needed
        int sum = Arrays.stream(people).sum();
        if (sum <= limit) {
            return 1;
        }

        Arrays.sort(people);
        int a = 0;
        int b = people.length - 1;
        int boatCount = 0;

        while (a <= b) {
            int peopleSum = people[a] + people[b];
            if (peopleSum > limit) {
                boatCount++;
                b--;
            } else {
                // Use a single boat for both people if their sum is within the limit
                boatCount++;
                a++;
                b--;
            }
        }

        return boatCount;
    }
}
