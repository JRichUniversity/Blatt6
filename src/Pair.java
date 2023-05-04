public class Pair <X, Y>{
    X p1;
    Y p2;

    Pair(X first, Y second){
        p1 = first;
        p2 = second;
    }

    public X fst(){
        return p1;
    }

    public Y snd(){
        return p2;
    }

    public Pair<Y, X> flip(){
        Pair<Y, X> flipped = new Pair<>(p2, p1);
        return flipped;
    }
}
