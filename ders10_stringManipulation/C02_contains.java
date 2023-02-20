package ders10_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {

        String str = "Java ile kodlama cok zevkli";

        System.out.println(str.contains("cok")); // true

        System.out.println(str.contains("odla")); // true

        System.out.println(str.contains("a")); // true

        // System.out.println(str.contains('s'));    // Parametre olarak char kabul etmez.

        // CharSequence : Char dizisi --> oda bize bool dönecek ya true ya da false

        System.out.println(str.contains("java")); // false

        String str2 = "Java";

        System.out.println(str.contains(str2));  // str --> içeriyor str2 yi true
        System.out.println(str2.contains(str));  // str2 --> içermiyor str'ı false.

        String str3 = "234 Ali Can";

        // str3.contains(2);
        str3.contains("2"); //true
    }
}
