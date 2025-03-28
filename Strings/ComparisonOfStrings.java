// We will show how the strings are compared using two different methods and how to differentiate between those methods
public class ComparisonOfStrings{
    public static void main(String[] args){
        String a = "Java";
        String b = "Java";
        // The above reference variables point to the same object in the string pool in heap memory
        System.out.println(a == b);
        // Now, we will make two strings whose objects are outside the string pool in heap memory
        // even though, they will have the same value but they will still not be considered equal
        String name1 = new String("Jeeya");
        String name2 = new String("Jeeya");
        System.out.println(name1 == name2);
        // Now, we will see a method ".equals()" it compares the values of 2 strings and returns true/false based on only the value
        System.out.println(name1.equals(name2));
    }
}