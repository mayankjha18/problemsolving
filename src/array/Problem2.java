package array;
/*
Search in rotated sorted array
 */
public class Problem2 {

    public static void main(String[] args) {
        int[] input = {21, 27, 31, 43, 77, 1, 2, 3, 4, 5, 6, 7, 12, 15, 17, 19 };
        int num = 4;
        int rotationPoint = findpointOfRotation(input);
        System.out.println("Point of rotation -"+rotationPoint);
        searchForElement(input, num, rotationPoint);
//        binarySearch(input, 4, 5, input.length-1);
    }

    private static int findpointOfRotation(int[] inputArr) {
        int index = -1;
        if(inputArr[0] <inputArr[inputArr.length-1])
            return -1;
        int low = 0;
        int high = inputArr.length-1;
        int mid = (low + high)/2;
        while(low < high && high-low>1)
        {
            if(mid+1 <= inputArr.length-1 && inputArr[mid] > inputArr[mid+1])
            {
                return mid+1;
            }
            else if(mid>0 && inputArr[mid] < inputArr[mid-1])
            {
                return mid;
            }
            if(inputArr[low] < inputArr[mid])
            {
                low = mid;
            }
            else if(inputArr[low] > inputArr[mid])
            {
                high = mid;
            }
            mid = (low + high)/2;
        }
        return mid;
    }

    static void searchForElement(int[] inputArr, int num, int rotation)
    {
        // simple logic for binary search
        if(num> inputArr[rotation] && num <= inputArr[inputArr.length-1])
        {
            binarySearch(inputArr, num, rotation, inputArr.length-1);
        }
        else if(num > inputArr[inputArr.length-1] && num < inputArr[rotation-1])
        {
            binarySearch(inputArr, num, 0, rotation);
        }
        else
        {
            System.out.println("Number doesn't exists.");
        }
    }

    static void binarySearch(int[] input, int num, int low, int high)
    {
        int mid = (low+high)/2;
        while(low < high)
        {
            System.out.println("low : "+low+"; high:  "+high+ "; mid"+ mid);
            if(input[mid] == num)
            {
                System.out.println("Number found at index "+mid);
                return;
            }
            if(num< input[mid])
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
            mid = (low+high)/2;
        }
        System.out.println("Number not found");
    }
}
