import java.util.*;

public class Remove_Duplicate_from_Array {
    public static void main(String[] args) {

        int[] originalArray = {1, 2, 3, 2, 4, 1, 5};

        // Use LinkedHashSet to maintain insertion order
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : originalArray) {
            set.add(num);
        }

        // Convert set back to array
        int[] uniqueArray = new int[set.size()];
        int i = 0;
        for (int num : set) {
            uniqueArray[i++] = num;
        }

        // Print result
        System.out.print("Array after removing duplicates: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }



        /*int [] arr = {5,7,1,2,6,5,7,1,2};
        int n = arr.length;

        int[] temp = new int[n];
        int uniqueCount = 0;
                    for (int i = 0; i < n; i++) {
                        boolean isDuplicate = false;

                        for (int j = 0; j < uniqueCount; j++) {
                            if (arr[i] == temp[j]) {
                                isDuplicate = true;
                                break;
                            }
                        }

                        if (!isDuplicate) {
                            temp[uniqueCount++] = arr[i];
                        }
                    }

                    // Print unique elements
                    System.out.print("Array after removing duplicates: ");
                    for (int i = 0; i < uniqueCount; i++) {
                        System.out.print(temp[i] + " ");
                    }
         */

    }
}
