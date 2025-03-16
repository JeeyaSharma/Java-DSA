import java.util.*;
public class LinearSearchInString{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        System.out.print("Target Character: ");
        char target = in.next().charAt(0);

        if(StringLinearSearch(str, target)){
            System.out.println("Target Character is present in the String");
        }else{
            System.out.println("Target Character is not present in the String");
        }
        in.close();
    }

    public static boolean StringLinearSearch(String str, char target){
        if(str.length()== 0){
            return false;
        }else{
            for(int i=0;i<str.length();i++){
                if(target == str.charAt(i)){
                    return true;
                }
            }
        }

        return false;
    }
}