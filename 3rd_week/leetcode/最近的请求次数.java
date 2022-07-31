class RecentCounter {
    LinkedList<Integer> list= new LinkedList<>();
    public RecentCounter() {}
    
    public int ping(int t) {
         while(!list.isEmpty() && list.peek()<t-3000)
            list.poll();
        list.offer(t);
        return list.size();
        }
    }

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */