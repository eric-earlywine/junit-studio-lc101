package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    //n = 56; right = 5, left = 4, mid = 5
    // {3, 7, 29, 46, 53, 59, 63, 71, 85, 99, 104, 108, 112}
    // {0, 1, 02, 03, 04, 05, 06, 07, 08, 09, 010, 011, 012}
    public static int binarySearch(int[] sortedNumbers, int n) {
        int right = sortedNumbers.length - 1;
        int left = 0;
        boolean gotHereTwice = false;
        while (right > left) {
            int mid = left + ((right - left) / 2);
            if (mid == left && mid > 0) {
                mid++;
                if (right == mid && !gotHereTwice) {
                    gotHereTwice = true;
                }
                else if (right == mid && gotHereTwice) return -1;
            }
            if (sortedNumbers[mid] > n) {
                right = mid;
            } else if (sortedNumbers[mid] < n) {
                left = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
