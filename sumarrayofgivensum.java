// Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

// In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

// Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

// Example 1:

// Input:
// N = 5, S = 12
// A[] = {1,2,3,7,5}
// Output: 2 4
// Explanation: The sum of elements 
// from 2nd position to 4th position 
// is 12.
// Example 2:

// Input:
// N = 10, S = 15
// A[] = {1,2,3,4,5,6,7,8,9,10}
// Output: 1 5
// Explanation: The sum of elements 
// from 1st position to 5th position
// is 15.


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
     static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) {
        int start = -1;
        int end = -1;
        int currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum == sum) {
                start = 0;
                end = i;
                break;
            }

            if (map.containsKey(currSum - sum)) {
                start = map.get(currSum - sum) + 1;
                end = i;
                break;
            }

            map.put(currSum, i);
        }

        if (start == -1 && end == -1) {
            result.add(-1);
        } else {
            result.add(start + 1); // Convert to 1-based indexing
            result.add(end + 1);   // Convert to 1-based indexing
        }

        return result;
    }
}