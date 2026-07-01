class MyHashSet {

    HashSet<Integer> set = new HashSet<>();
    
    public MyHashSet() {
        
    }
    
    public void add(int key) {
         set.add(key);    
    }
    
    public void remove(int key) {
        set.remove(key);
    }
    
    public boolean contains(int key) {
        return set.contains(key);
    }
}