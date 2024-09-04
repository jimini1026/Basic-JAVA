package static2.ex;

public class MathArrayUtils {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double average(int[] arr) {
        return (double)(sum(arr) / arr.length);
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (min > num) {
                min = num;
            }
        }

        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }

        return max;
    }
}
