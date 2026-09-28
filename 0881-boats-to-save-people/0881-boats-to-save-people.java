class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people); // sorting unlocks the two-pointer trick
        int light = 0;
        int heavy = people.length - 1;
        int boats = 0;
        while (light <= heavy) {
            if (people[light] + people[heavy] <= limit) {
                light++; // lightest person fits in, seat them too
            }
            heavy--;  // heaviest is always seated this round, paired or alone
            boats++;
        }
        return boats;
    }
}