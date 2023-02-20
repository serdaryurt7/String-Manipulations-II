package ders10_stringManipulation;

public class C01_concatenation {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Guzeldir";
        boolean bl = true;
        int sayi = 20;
        double dbl = 3.54;

        System.out.println(str1 + bl + sayi); // Javatrue20
        // System.out.println(bl + sayi);
        // String dışındaki data türlerinde toplama yapmamıza izin vermeyebilir.

        System.out.println(sayi+dbl);

        // System.out.println(str1.concat(bl));
        // String ile başka değişkeni concat yapmamıza izin vermiyor.


        // Concat() sadece String variable'lari birleştirmek için kullanılır.  + işlemi'de aynı görevi görür.

        System.out.println(str1.concat(" ").concat(str2)); // Java Guzeldir

    }
}
