package ListenAufgabe;

public class TestListe {
    public static void main(String[] args){
        Liste l = new Liste();
        ListenElement<Integer> l1 = new ListenElement<>(10);
        l.vorneEinfuegen(l1);
        l.listeAusgeben();
    }
}
