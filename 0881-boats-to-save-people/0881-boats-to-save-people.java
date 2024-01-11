class Solution {
    public int numRescueBoats(int[] people, int limit) {
        //case where only 1 boat is needed
        int sum = 0;
        for (int num : people){
            sum = sum + num;
        }
        if (sum == limit){
            return 1;
        }
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