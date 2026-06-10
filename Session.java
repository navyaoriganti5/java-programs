public class Session {
    public static void main (String args[]){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Avya",90);
        map.put("Bunny",80);
        map.put("Avyajay",85);
        map.put("Jaya",95);
        map.put("avii",80);
        System.out.println(map);
        map.put("Avya",90);
        System.out.println(map.get("Bunny"));
        System.out.println(map.get("Avyajay"));
        System.out.println(map.getOrDefault("Bhavya",0));
        System.out.println(map.containsKey("Avya"));
        System.out.println(map.containsValue(90));
        map.remove("Bunny");
    System.out.println(map);
    for(String key:map.keySet()){
        System.out.println(key);
    }
    System.out.println(map.values());
    System.out.println(map.size());
}
    }

