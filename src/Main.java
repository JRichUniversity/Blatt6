public class Main {
    public static void main(String[] args){
        Butter bu1 = new Butter();
        Brot br1 = new Brot();
        Pair<Butter, Brot> butterbrot = new Pair<Butter, Brot>(bu1,br1);
        Butter bu2 = butterbrot.fst() ;
        Brot br2 = butterbrot.snd() ;
        Pair<Brot, Butter> brotbutter = butterbrot.flip();
    }
}
