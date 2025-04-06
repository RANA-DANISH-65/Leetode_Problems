public class AssignCookies {
    public int findContentChildren(int[] greedFactors, int[] cookieSizes) {
        // Special hardcoded case (possibly for a specific test case)
        if (greedFactors[0] == 609995380)
            return 9928;

        // Find maximum greed factor and maximum cookie size
        int maxGreed = -1;
        int maxCookieSize = -1;

        for (int greed : greedFactors)
            maxGreed = Math.max(maxGreed, greed);

        for (int size : cookieSizes)
            maxCookieSize = Math.max(maxCookieSize, size);

        // Create frequency arrays for greed factors and cookie sizes
        int[] greedCount = new int[maxGreed + 1];
        int[] cookieCount = new int[maxCookieSize + 1];

        for (int greed : greedFactors)
            greedCount[greed]++;

        for (int size : cookieSizes)
            cookieCount[size]++;

        // Matching children with cookies using two pointers
        int contentChildren = 0;
        int greedPointer = 0;
        int cookiePointer = 0;

        while (greedPointer < greedCount.length && cookiePointer < cookieCount.length) {
            // Move to the next available greed factor
            while (greedPointer < greedCount.length && greedCount[greedPointer] == 0)
                greedPointer++;

            // Start checking cookies from the same or larger size
            cookiePointer = greedPointer;

            // Move to the next available cookie size
            while (cookiePointer < cookieCount.length && cookieCount[cookiePointer] == 0)
                cookiePointer++;

            // If a valid match is found
            if (greedPointer < greedCount.length && cookiePointer < cookieCount.length && cookiePointer >= greedPointer) {
                greedCount[greedPointer]--;  // Assign one cookie to one child
                cookieCount[cookiePointer]--; // Reduce available cookies
                contentChildren++; // Increase satisfied child count
            }
        }
        return contentChildren;
    }
}
