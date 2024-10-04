/*
Given an array arr, rotate the array by one position in clock-wise direction.

Examples:

Input: arr = [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]
Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
Input: arr = [9, 8, 7, 6, 4, 2, 1, 3]
Output: [3, 9, 8, 7, 6, 4, 2, 1]
Explanation: After rotating clock-wise 3 comes in first position.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1<=arr.size()<=105
0<=arr[i]<=105
*/


class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length;
        int ele = arr[n-1];
        for(int i=n-1;i>0;i--){
            
            arr[i] = arr[i-1];
            
        }
        arr[0] = ele;
    }
}
