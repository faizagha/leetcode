class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int a = 0;
        int b = people.length - 1;
        int boatCount = 0;
        while (a <= b){
            int peopleSum = people[a] + people[b];
            if (peopleSum > limit){
                boatCount++;
                b--;
            } else if (peopleSum <= limit) {
                boatCount++;
                a++;b--;
            }
        }
        return boatCount;
    }
}