package ders10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); // (9 index) ilk küçük a nın bulunduğu index'i döndürür.

        System.out.println(str.indexOf('c')); // 8    int döndürür.

        System.out.println(str.indexOf("hersey")); // başlangıç index'ini döndürür --> 'h' değerinin indexi.

        System.out.println(str.indexOf("e",9));  // aramaya 9. karakterden sonra başlayacak  // 13

        //13 indexteki e'den bir sonraki e'nin indexini bulalım

        System.out.println(str.indexOf("e",14)); // 13 dersek 13. indextekini verir o yüzden bir sonraki index'i seçiyoruz. // 16

        //cümledeki ikinci c'nin indexini yazdırın.

        int ilkIndex = str.indexOf("c"); // 8

        System.out.println(ilkIndex);

        System.out.println(str.indexOf("c", ilkIndex+1));

        System.out.println(str.indexOf("ali"));  // index olarak int döndürmesi bekleniyor.  (-1 döndürür.)


    }
}
