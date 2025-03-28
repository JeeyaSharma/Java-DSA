public class String_Builder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            // append method adds the value at the end of the string
            sb.append((char)(ch));
        }
        System.out.println(sb);

        // reverse method reverses the string
        System.out.println(sb.reverse());

        sb.reverse();

        // insert method inserts values at a specified index
        sb.insert(1,"Jeeya");
        System.out.println(sb);

        // replace method replaces the given string from the specified beginIndex and endIndex
        sb.replace(1,6,"Laksh");
        System.out.println(sb);

        // delete method is used to delete the string from the specified start index and end index
        sb.delete(1,6);
        System.out.println(sb);

        // capacity method tells the capacity of the string builder
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.capacity());
        System.out.println(sb.capacity());

        // charAt method tells the value of the character at a particular index
        System.out.println(sb.charAt(1));

        // length method gives the length of the string
        System.out.println(sb.length());

        // substring(int beginIndex) gives the substring from the start to the end of the string
        System.out.println(sb.substring(15));

        // substring(int beginIndex, int endIndex) gives the substring from the specified start indices to end indices
        System.out.println(sb.substring(9,18));
    }
}
