package com.xsliang;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] inputs = {10, 39, 7, 18, 89, 2, 78, 99};
        Arrays.sort(inputs);

        System.out.println(Arrays.toString(inputs));

        int value = 18;

        int low = 0;
        int high = inputs.length - 1;
        while (low <= high) {

            int mid = (low + high) / 2;
            if (value == inputs[mid]) {
                System.out.println(mid);
                return;
            }

            if (mid < high) {
                high = mid - 1;
            }

            if (mid > low) {
                low = mid + 1;
            }
        }
    }
}
