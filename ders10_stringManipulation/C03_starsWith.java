package ders10_stringManipulation;

public class C03_starsWith {
    public static void main(String[] args) {

        String str = "manti acarken java ogrenilmez";

        System.out.println(str.startsWith("Manti")); // false

        System.out.println(str.startsWith("m")); // true

        System.out.println(str.startsWith("manti acarken java ogrenilmez"));

        System.out.println(str.startsWith("")); // true

        str.startsWith("acarken", 6);  // 6. index ve sonrası acarken ile mi başlıyor ? // true

        System.out.println(str.startsWith("manti", 0)); // true

        System.out.println(str.startsWith("java", 10)); // false

    }
}
