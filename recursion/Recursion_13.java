package recursion;

public class Recursion_13 {
    private static int optimizedPower(int base,int exp){
        if(exp==0) return 1;
        if(exp==1) return base;

        if(exp%2==0){
            return optimizedPower(base, exp/2) * optimizedPower(base, exp/2);
        }else{
            return base * optimizedPower(base, exp/2) * optimizedPower(base, exp/2);
        }
    }
    public static void main(String[] args){
        System.out.println(optimizedPower(2, 1));
    }
}
