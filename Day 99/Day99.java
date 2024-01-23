public class Day99 {
    class RandomizedSet {
//Day 99
        private ArrayList<Integer> list;
        private Map<Integer, Integer> map;
    
        public RandomizedSet() {
            list = new ArrayList<>();
            map = new HashMap<>();
        }
    
        public boolean search(int val) {
            return map.containsKey(val);
        }
        
        public boolean insert(int val) {
            if(search(val)) return false;
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }
    
        public boolean remove(int val) {
            if(!search(val)) return false;
            int index = map.get(val);
            list.set(index, list.get(list.size() - 1));
            map.put(list.get(index), index);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
        
        public int getRandom() {
            Random rnd = new Random();
            return list.get(rnd.nextInt(list.size()));
        }
    }
    
}
