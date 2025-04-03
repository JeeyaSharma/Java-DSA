/*
find the square root of perfect square
 */
import java.util.*;
public class SquareRootOfNum{
    private static int squareRoot(int n){
        int start=0,end=n,ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid < n){
                start=mid+1;
            }
            else if(mid*mid>n){
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = S.nextInt();
        System.out.println("Square Root of number: "+squareRoot(n));
        S.close();
    }
}