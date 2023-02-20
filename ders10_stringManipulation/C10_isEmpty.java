package ders10_stringManipulation;

public class C10_isEmpty {

    public static void main(String[] args) {

        String str = "";

        System.out.println(str.isEmpty()); // true   dolu mu boş mu kontrol ediyor.

        str = "    ";

        System.out.println(str.isEmpty()); // false

        System.out.println(str.isBlank()); // birşeyler var ama boşluk mu  // true

        str = "x";

        System.out.println(str.isEmpty()); // false

        System.out.println(str.isBlank()); // false

    }
}
