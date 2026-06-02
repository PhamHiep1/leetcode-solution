class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length+1];
        int[] res = new int [k];
        int index = 0;
        for(var num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int frequency = entry.getValue();
            if(buckets[frequency]==null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(entry.getKey());
        }

        for(int i = buckets.length-1; i>0;i--){
            if(buckets[i]==null){
                continue;
            }
            for(var x: buckets[i]){
                res[index++] = x;
                if(index==k)
                    return res;
            }
        }
        return res;
    }
}