package ListenAufgabe;

public class ListenElement<T> {
    ListenElement<T> nachfolger;
    T reference;

    ListenElement(T inhalt){
        reference = inhalt;
    }

    public void insertHere(ListenElement e){
        e.setNachfolger(nachfolger);
        setNachfolger(e);
    }

    public void setNachfolger(ListenElement e){
        this.nachfolger = e;
    }

    public void hintenAnhaengen(ListenElement e){
        if(this.nachfolger == null){
            this.nachfolger = e;
        } else {
            nachfolger.hintenAnhaengen(e);
        }
    }

    public void einfuegenAnPosition(int index, ListenElement e){
        this.einfuegenAnPosition(index, 0, e);
    }


    private void einfuegenAnPosition(int index, int thisIndex, ListenElement e){
        if(nachfolger == null){
            this.nachfolger = e;
        }
        else {
            if(index == thisIndex){
                insertHere(e);
            } else {
                this.nachfolger.einfuegenAnPosition(index, ++thisIndex, e);
            }
        }
    }

    void loeschen(ListenElement e){
        if(this.nachfolger != null){
            if(this.nachfolger.equals(e)){
                nachfolger = this.nachfolger;
            } else {
                nachfolger.loeschen(e);
            }
        }
    }

    void listeAusgeben(){
        System.out.println(this.toString());
        if(nachfolger != null) nachfolger.listeAusgeben();
    }
}
