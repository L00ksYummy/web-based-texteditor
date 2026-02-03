
public class BinarySearch {
    public static void main(String[] args) {
        
        int[] numArr = {1,3,4,6,8,9,11,14};

        System.out.println(BinarySearch(numArr, 9));

    }

    private static int BinarySearch(int[] nums, int numToFind){
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int middlePos = high / 2; // same thing as splitting the length of the array in half
            int middleNum = nums[middlePos];

            if (numToFind == middleNum) return middlePos;
            else if (numToFind < middleNum) {
                high = middlePos - 1;
            }
            else low = middlePos + 1;
        }
        return -1;
    }
}