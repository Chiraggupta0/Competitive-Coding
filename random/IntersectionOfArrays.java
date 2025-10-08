import java.util.*;

public class IntersectionOfArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        // Step 1: Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Step 2: Create two pointers and a result list
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        // Step 3: Traverse both arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // Common element found
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                // Move pointer i ahead
                i++;
            } else {
                // Move pointer j ahead
                j++;
            }
        }

        // Step 4: Convert ArrayList to int[]
        int[] res = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            res[k] = result.get(k);
        }

        return res;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] intersection = intersect(nums1, nums2);
        System.out.println("Intersection: " + Arrays.toString(intersection));

        // Example 2
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};

        int[] intersection2 = intersect(nums3, nums4);
        System.out.println("Intersection: " + Arrays.toString(intersection2));
    }
}
