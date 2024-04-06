package odwrotne_sortowanie_w_osobnej_klasie;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class przykladKomparatora
{
    static class Komparator implements Comparator<String> //klasa komparatora
    {
        @Override //adntacja, sprawdza czy dana metoda przesłania metodę klasy nadrzędnej

        public int compare(String o1, String o2)
        {
            return o2.compareTo(o1);
        }
    }
}

public class Main {
    public static void main(String[] args)
    {
        List<String> imiona = Arrays.asList("Adam", "Ewa", "Katarzyna", "Bartosz", "Jakub", "Sławomira", "Magdalena");

        System.out.println("Lista przed sortowaniem.");
        System.out.println(imiona);

        Collections.sort(imiona, new przykladKomparatora.Komparator()); //odwrocone sortowanie kolekcji

        System.out.println("Lista po sortowaniem.");
        System.out.println(imiona);
    }
}
