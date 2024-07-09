import java.util.*;
public class _03Implimentation{

    //class for hash map
    static class HashMap<K,V>{  // <K,V> ->Generic => we use when we don't know the type of data
        private class Node{
            K key;
            V value;

            //constructor
            // @SuppressWarnings("unchecked")
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // size
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")  //use to avoid the warning 
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        //hash function
        @SuppressWarnings(unchecked)
        public int hashFunction(K key){
            int hc = key.hashCode();  // provid the hash code for the key value
            //hc given value can be +ve or -ve so we take the |x| absolute value
            return Math.abs(hc) % N;  // abs can be more then size so take %4 so it is between 0-3
            
        }

        public int SearchInLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            //check that the value is present or not
            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;  //return the valed index
                }
                di++; // go to the next index
            }

            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBuketes[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;

            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            //nodes -> add in new bucket
            for(int i=0; i<oldBuketes.length; i++){
                LinkedList<Node> ll = oldBuketes[i];
                for(int j=0 ; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key, node.value);

                }
            }
        }


        //put function
        public void put(K key, V value){
            int bi = hashFunction(key);  //0 to 3  => bucket index
            int di = SearchInLL(key,bi); //valed; or -1  => sech the valed index int the linked list

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lamda = (double)n/N;
            if(lamda > 2.0){   //2.0 => threashold value(maximum value)
                rehash();
            }
        }

        //check for containes key
        public boolean containsKey(K key){
            int bi = hashFunction(key);  //0 to 3  => bucket index
            int di = SearchInLL(key,bi); //valed; -1  => sech the valed index int the linked list

            if(di != -1){
                return true;
            }
            else{
                return false;
            }
        }

        //get function
        public V get(K key){
            int bi = hashFunction(key);  //0 to 3  => bucket index
            int di = SearchInLL(key,bi); //valed; -1  => sech the valed index int the linked list

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }
        }

        //remove function
        public V remove(k key,V value){
            int bi = hashFunction(key);  //0 to 3  => bucket index
            int di = SearchInLL(key,bi); //valed; -1  => sech the valed index int the linked list

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;   //size will decreas after rmoving the element
                node.value = value;
            }
            else{
               return null;
            }
        }

        //print in array list form
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                //for each loop
                for(Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }

    }

    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 130);
        hm.put("china", 140);
        hm.put("indonasia", 150);
        hm.put("shrilanka" , 190);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key);
        }
    }
}