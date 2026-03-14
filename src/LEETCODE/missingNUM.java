package LEETCODE;

class amn {

    int[] arr = {1,2,3,4,6,7,8,9,10};

    public int findmax() {

        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public int findMissing() {

        int max = findmax();

        int expectedSum = (max * (max + 1)) / 2;

        int actualSum = 0;

        for(int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }

        return expectedSum - actualSum;
    }
}

public class missingNUM {

    public static void main(String[] args) {

        amn am = new amn();

        System.out.println("The array is {1,2,3,4,6,7,8,9,10}");

        int missing = am.findMissing();

        System.out.println("Missing number is: " + missing);
    }
}