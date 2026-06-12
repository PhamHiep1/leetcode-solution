class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {        
        if(cpdomains == null || cpdomains.length == 0){
            return new ArrayList<>();
        }

        Map<String, Integer> map = new HashMap<>();

        for(var cpdomain : cpdomains){
            int spaceIndex = cpdomain.indexOf(" ");
            int count = Integer.parseInt(cpdomain.substring(0, spaceIndex));
            String domain = cpdomain.substring(spaceIndex+1);
            int dotIndex = 0;
            map.put(domain, map.getOrDefault(domain , 0) + count);

            while((dotIndex = domain.indexOf(".", dotIndex)) != -1){
                String subDomain = domain.substring(dotIndex+1);
                map.put(subDomain, map.getOrDefault(subDomain, 0) + count);
                dotIndex++;
            }
        }

        List<String> res = new ArrayList<>(map.size());

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            res.add(entry.getValue() + " " + entry.getKey());
        }
        return res;
    }
}