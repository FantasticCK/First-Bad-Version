package com.CK;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while (low + 1 < high) {
            int mid = (high - low) / 2 + low;
            boolean midVal = isBadVersion(mid);
            if (midVal) {
                high = mid;
            } else
                low = mid;
        }
        return isBadVersion(low) ? low : high;
    }
}