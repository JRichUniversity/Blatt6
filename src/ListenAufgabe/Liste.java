package ListenAufgabe;

public class Liste {
    ListenElement first;

    void vorneEinfuegen(ListenElement e){
        first = e;
    }

    void hintenAnhaengen(ListenElement e){
        first.hintenAnhaengen(e);
    }

    void anfuegenAnPosition(int index, ListenElement e){
        if(first != null){
            first.einfuegenAnPosition(index, e);
        } else first = e;
    }

    void loeschen(ListenElement e){
        if(first != null){
            first.loeschen(e);
        }
    }

    void listeAusgeben(){
        if(first != null){
            first.listeAusgeben();
        } else System.out.println("Liste ist leer!");
    }
}
