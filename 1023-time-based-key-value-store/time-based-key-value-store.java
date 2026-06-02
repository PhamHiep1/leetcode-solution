class TimeMap {
    Map<String,List<Pair<Integer,String>>> map;

    public TimeMap() {
        this.map = new HashMap<>();    
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key,v->new ArrayList<>())
        .add(new Pair<>(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        List<Pair<Integer, String>> list = 
        map.getOrDefault(key,new ArrayList<>());
        String res="";
        int l = 0;
        int r = list.size()-1;

        while(l <= r){
            int mid = l+(r-l)/2;

            if(list.get(mid).getKey() <= timestamp){
                res = list.get(mid).getValue();
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return res;
    }

    private static class Pair<K,V>{
        private final K k;
        private final V v;

        public Pair(K k, V v){
            this.k = k;
            this.v = v;
        }

        public K getKey(){
            return this.k;
        }
        public V getValue(){
            return this.v;
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */