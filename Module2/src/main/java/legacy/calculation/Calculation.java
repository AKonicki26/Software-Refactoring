package legacy.calculation;

public class Calculation {
    public static int findMax(int arr[]) {
        // return 0 if the array is empty, there is no max
        if (arr.length == 0) return 0;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
}
