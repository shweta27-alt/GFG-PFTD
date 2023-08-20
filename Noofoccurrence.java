// Number of occurrence
// MediumAccuracy: 59.34%Submissions: 156K+Points: 4
// Applying for Jobs, Now Easier Than Today's Problem! Explore Now

// Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

// Example 1:

// Input:
// N = 7, X = 2
// Arr[] = {1, 1, 2, 2, 2, 2, 3}
// Output: 4
// Explanation: 2 occurs 4 times in the
// given array.
// Example 2:

// Input:
// N = 7, X = 4
// Arr[] = {1, 1, 2, 2, 2, 2, 3}
// Output: 0
// Explanation: 4 is not present in the
// given array.

class Solution {
    int count(int[] arr, int n, int x) {
        int count=0;
        ArrayList<Integer> data = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           if(arr[i] == x){
               data.add(arr[i]);
               count++;
           }
        }
        
        if(data.contains(x)) {
            return count;
        } else {
            return 0;
        }
    }
}