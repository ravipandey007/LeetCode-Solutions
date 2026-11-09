class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        TreeSet<Integer> availableServers = new TreeSet<>();
        for(int i =0; i < k; i++){
            availableServers.add(i); // k * log(k)
        }

        //Min-Heap : {finishTime , serverId}
        PriorityQueue<int[]> busyServers = new PriorityQueue<>(
            (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0])
                                  : Integer.compare(a[1], b[1]) 
        );

        int[] countRequests = new int[k];

        //Total request = n
        //T.C = n * log(k)

        for(int i = 0; i < arrival.length; i++){
            int time = arrival[i];

            while(!busyServers.isEmpty() && busyServers.peek()[0] <= time){
                int server = busyServers.poll()[1];
                availableServers.add(server);
            }

            if(availableServers.isEmpty()){
                continue;
            }

            int target = i % k;
            //smallest available server <= time
            Integer targetServer = availableServers.ceiling(target);

            if(targetServer == null){  //wrap around
                targetServer = availableServers.first();
            }

            availableServers.remove(targetServer);   //this server is going to be busy

            busyServers.offer(new int[]{time + load[i], targetServer});

            countRequests[targetServer]++;
        }
        int max = 0; 
        for(int c : countRequests){
            max = Math.max(max, c); //O(k)
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < k; i++){
            if(countRequests[i] == max){
                result.add(i);
            }
        }

        return result;
    }
}
//T.C : O(klogk + n*logk + k) ~= O(nlogk)
//S.C : O(k)