package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// find the union of two arrays
public class Code_9 {
    private static int[] unionBruteForce(int[] arr1, int[] arr2){
        Set<Integer> set = new TreeSet<>();
        for(int ele: arr1){
            set.add(ele);
        }
        for(int ele: arr2){
            set.add(ele);
        }
        int[] ans = new int[set.size()];
        int idx = 0;
        for(int val: set){
            ans[idx++] = val;
        }
        return ans;
    }
    private static List<Integer> unionOptimal(int[] arr1, int[] arr2){
        List<Integer> union = new ArrayList<>();
        int size1 = arr1.length;
        int size2 = arr2.length;

        int i=0;
        int j=0;
        while(i<size1 && j<size2){
            if(arr1[i]<arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else if(arr2[j]<arr1[i]){
                if(union.isEmpty() || union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
            else{
                if(union.isEmpty() || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while(i<size1){
            if(union.get(union.size()-1)!=arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        while(j<size2){
            if(union.get(union.size()-1)!=arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 7};
        System.out.println(Arrays.toString(unionBruteForce(arr1, arr2)));
        System.out.println(unionOptimal(arr1, arr2));
    }
}
