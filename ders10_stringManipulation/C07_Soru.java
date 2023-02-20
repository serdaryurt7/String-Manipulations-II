package ders10_stringManipulation;

public class C07_Soru {
    public static void main(String[] args) {

        /* Kullanıcıdan bir cümle ve bir metin alın. Cümlede metnin durumuna göre
         1- Cümle metni içermiyor
         2- Cümle metni sadece 1 kere içeriyor.
         3- Cümle metni birden fazla içeriyor.
         seçeneklerinden uygun olanı yazdırın.  */

        String cumle = "Java cok guzeldir cok";
        String metin = "cok";


        if (!cumle.contains(metin)){
            System.out.println("Cümle metni içermiyor");
        }
        else {

            int ilkIndex = cumle.indexOf(metin); //

            System.out.println(ilkIndex);

            int ikinciIndex = cumle.indexOf(metin, ilkIndex+1);

            System.out.println(ikinciIndex);

            if (ikinciIndex == -1)  // Burada ikinci indexin -1 olduğu kontrol ediliyor çünkü -1 indexi demek değerin içermemesi demektir.
            {
                System.out.println("Cümle metni sadece 1 kere içeriyor.");
            }
            else
            {
                System.out.println("Cümle metni birden fazla içeriyor.");
            }




        }




    }
}
