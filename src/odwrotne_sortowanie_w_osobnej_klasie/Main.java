package odwrotne_sortowanie_w_osobnej_klasie;


import java.util.Comparator;

class przykladKomparatora
{
    static class Komparator implements Comparator<String> //klasa komparatora

    @Override //adntacja, sprawdza czy dana metoda przesłania metodę klasy nadrzędnej

    public int compare(String o1, String o2)
    {
        return o2.compareTo(o1);
    }
}

public class Main {
    public static void main(String[] args)
    {
        
    }
}
