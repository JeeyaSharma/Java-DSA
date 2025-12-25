package basics;

// Find if a number is armstrong number or not
public class Code_5 {
    private static boolean isArmstrong(int n){
        int original = n;
        int temp = n;
        int digits = 0;
        while(temp!=0){
            digits++;
            temp/=10;
        }
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            n/=10;
            int power = 1;
            for(int i=0;i<digits;i++){
                power*=rem;
            }
            sum+=power;
        }
        return original == sum;
    }
    public static void main(String[] args){
        System.out.println(isArmstrong(153));
    }
}
