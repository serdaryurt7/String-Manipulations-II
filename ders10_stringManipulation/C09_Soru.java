package ders10_stringManipulation;

public class C09_Soru {
    public static void main(String[] args) {

        /* Kullanıcıdan bir cümle ve bir metin alın. Cümlede metnin durumuna göre
         1- Cümle metni içermiyor
         2- Cümle metni sadece 1 kere içeriyor.
         3- Cümle metni birden fazla içeriyor.
         seçeneklerinden uygun olanı yazdırın.  */

        String cumle = "Java cok guzeldir cok";
        String metin = "cok";

        int ilkIndex = cumle.indexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);


        if (ilkIndex==-1){

            System.out.println("Cümle metni içermiyor");

        }

        else if (ilkIndex == sonIndex){
            System.out.println("Cümle metni sadece 1 kere içeriyor.");
        } else{
            System.out.println("Cümle metni birden fazla içeriyor.");
        }


    }
}
