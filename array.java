import java.util.Arrays;

public class array {
    public static void main(String[] arg){
        int[] arr = {10, 20, 30, 40,50};
      //  For loop
             for (int i=0; i<arr.length; i++){                
                 System.out.print(arr[i] + " ");
             }
             System.out.println();
      //  for loop directly accessing the element 
                for (int num : arr){
                    System.out.print(num + " ");
                }
                System.out.println();
     //   sum of array 
            int sum =0;
            for(int i=0; i<arr.length; i++){
                sum+=arr[i];
            }
            System.out.println("sum of array arr: "+ sum);

        // using java.util array method 
            int[] num = {1,4,5,7,24,6};
            Arrays.sort(num);
            System.out.println(Arrays.toString(num));
            int idx = Arrays.binarySearch(num, 7); // finding index using builtin binary search method
            System.out.println(idx);

            int[] copy = Arrays.copyOf(num, 4); // make a array name as copy and copy the first four element of array num
            System.out.println(Arrays.toString(copy));

            // Problem 1 — Find the largest number
            // Input:  {3, 7, 1, 9, 4}
            int[] prob1 = {3, 7, 1, 9, 4};
            int lrg = Integer.MIN_VALUE;
            for(int k : prob1){
                if(k>lrg){
                    lrg = k;
                }
            }
            System.out.println(lrg);

            // Problem 2 — Reverse an array!
            // Input:  {1, 2, 3, 4, 5}
            int[] prob2 = {1, 2, 3, 4, 5};
            for(int i = prob2.length-1; i>=0; i--){
                System.out.print(prob2[i] + " ");
            }

            // same with better solution 
            int left = 0;
            int right = prob2.length - 1;
            while (left < right) {
            // swap left and right
             int temp = prob2[left];
             prob2[left] = prob2[right];
             prob2[right] = temp;

             left++;   // move left pointer forward
             right--;  // move right pointer backward
            }
            System.out.println(Arrays.toString(prob2)); // [5, 4, 3, 2, 1]
            
            // Problem 3 — Check duplicates
            // Input:  {1, 2, 3, 2, 5}
            // Output: true
            int[] prob3a = {1, 2, 3, 2, 5};
            boolean hasDuplicate = false;
            for (int h =0; h<prob3a.length-1; h++){
                for(int g=h+1; g<prob3a.length; g++){
                if(prob3a[h]==prob3a[g]){
                    hasDuplicate = true;
                    break;
                }
                }
                 if (hasDuplicate) break;
                
            }
            System.out.println(hasDuplicate);
            // Input:  {1, 2, 3, 4, 5}
            // Output: false
            int[] prob3b = {1, 2, 3, 4, 5};
            boolean hasDuplicate2 = false;
            for (int h =0; h<prob3b.length-1; h++){
                for(int g=h+1; g<prob3b.length; g++){
                if(prob3b[h]==prob3b[g]){
                    hasDuplicate2 = true;
                    break;
                }
                }
                 if (hasDuplicate2) break;
               
            }
             System.out.println(hasDuplicate2);
    }
}

