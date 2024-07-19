public class HashMapImplementation {

    static class MyHashMap<k, v> {
        private static final int DEFAULT_CAPACITY = 4;
        private static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node{
            k key;
            v value;
            Node(k key, v value){
                this.key = key;
                this.value = value;
            }
        }

        public int size(){

        }

        public void put(k key, v value){
            //TODO
        }
        
        public v get(k key){
            //TODO
        }

        public v remove(k key){
            //TODO
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
    }
}
