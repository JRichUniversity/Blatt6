package PairListMap;

public class TestPairListMap {
    public static void main(String[] args){
        PairListMap m = new PairListMap("Wallah", 20);
        m.put("Wahla", "Hellios");
        m.put(20, "Krass");
        try {
            m.get("Hans");
        } catch (KeyNotFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println(m.size());
    }
}
