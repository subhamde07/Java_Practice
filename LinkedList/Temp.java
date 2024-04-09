class Temp {
    static int maxSubArray(int arr[], int n)
    {
        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int temp = Math.max(
                    Math.max(arr[i], arr[i] * maxEndingHere),
                    arr[i] * minEndingHere);
            minEndingHere = Math.min(
                    Math.min(arr[i], arr[i] * maxEndingHere),
                    arr[i] * minEndingHere);
            maxEndingHere = temp;
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
    public static void main(String args[])
    {
        int[] arr = { -11, -3, -5, -27, -2, -5, -1 };
        int n = arr.length;
        System.out.printf("Maximum Sub arr product is %d",
        maxSubArray(arr, n));
    }
}