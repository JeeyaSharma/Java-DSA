public class FormatSpecifiers {
    public static void main(String[] args){
        char c = 'a';
        System.out.printf("Character format specifier: %c",c);

        System.out.println();

        int val1 = 12;
        System.out.printf("Decimal no format specifier: %d",val1);

        System.out.println();

        double val2 = 6.022e23;
        System.out.printf("Exponential floating point no format specifier: %e%n",val2);

        float val3 = 12.6748f;
        System.out.printf("Floating point number format specifier: %.02f%n",val3);

        int val4 = 0123;
        System.out.printf("Octal format specifier: %o%n",val4);
        System.out.printf("Octal number with decimal format specifier: %d%n",val4);

        String str = "Jeeya";
        System.out.printf("String format specifier: %s%n",str);

        int val5 = 0x7F;
        System.out.printf("Hexadecimal format specifier: %x%n",val5);
        System.out.printf("Hexadecimal number with decimal format specifier: %d%n",val5);
    }
}
