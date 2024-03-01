/*
    5. მოცემულია მთელ რიცხვა მასივი. იპოვეთ ელემენტების მაქსიმალური რაოდენობა, რომელთა
    ჯამით მიიღება რიცხვი k. int lenOfLongSubarr(int[] array, int k); მაგ. array=[6,2,2,3,4,1], k = 8, result= 4.
*/
public class Task5 {
    public static void main(String[] args) {
        int[] array = {6, 2, 2, 3, 4, 1};
        int k = 8;
        System.out.println("Maximum number of with sum " + k + " is: " + lenOfLongSubarr(array, k));
    }
    public static int lenOfLongSubarr(int[] array, int k) {
        int maxNum = 0;
        int currSum = 0;
        int start = 0;

        for (int i = 0; i < array.length; i++) {
            currSum += array[i];

            while (currSum > k) {
                currSum -= array[start];
                start++;
            }

            if (currSum == k)
                maxNum = Math.max(maxNum, i - start + 1);
        }

        return maxNum;
    }
}
