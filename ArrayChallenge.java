/*
 * Input : Integer Array.(example: {4,8,6})
 * Find the number of missing values between the minimum and maximum number in the array.
 * Return number of missing values.(example output: 2 i.e. 5 and 7)
 */
import java.util.Arrays;
public class ArrayChallenge {
    static int function(int[] arr){
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            count+=arr[i+1]-arr[i]-1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4,8,6};
        System.out.println(function(arr));
    }
}
