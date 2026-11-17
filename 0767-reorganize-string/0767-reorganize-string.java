class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        //Count freq..
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //Max Heap based on freq:
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        for(char ch : map.keySet()){
            if(map.get(ch) > (s.length() +1 )/2){
                return "";
            }
            pq.add(ch);
        }

        StringBuilder ans = new StringBuilder();

        while(pq.size() > 1){
            char first = pq.poll();
            char sec = pq.poll();

            ans.append(first);
            ans.append(sec);

            //decre. the ferq of ele
            map.put(first, map.get(first) -1);
            map.put(sec, map.get(sec) - 1);

            // until freq becomes zero.
            if(map.get(first) > 0){
                pq.add(first);
            }
            if(map.get(sec) > 0){
                pq.add(sec);
            }
        }
        //puting remaining ch.
        if(!pq.isEmpty()){
            ans.append(pq.poll());
        }

        return ans.toString();
    }
}