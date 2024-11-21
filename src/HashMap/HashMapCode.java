package HashMap;

import BinaryTree.maxDiameter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class HashMapCode {
    static class hashMap<k,V>{
      private class Node{
          k key;
          V value;
          public Node(k key,V value){
              this.key = key;
              this.value = value;
          }
      }

      private int N;
      private int n;
      private LinkedList<Node> buckets[];

      @SuppressWarnings("unchecked")
      public hashMap() {
          this.N = 4;
          this.buckets = new LinkedList[4];
          for (int i = 0; i < 4; i++) {
              this.buckets[i] = new LinkedList<>();
          }
      }

      private int hashFunction(k key){
           int hc = key.hashCode();
          return Math.abs(hc) % N;
      }

      private int searchInLL(k key,int bi){
          LinkedList<Node> ll = buckets[bi];
          int di = 0;

          for(int i =0 ;i<ll.size();i++) {
              Node node  = ll.get(i);
              if(node.key == key){
                  return di;
              }
              di++;
          }
          return -1;
      }

      private void rehashing(){
          LinkedList<Node>  oldBucket[] = buckets;
          buckets = new LinkedList[N*2];
          N = N*2;
          for (int  i=0;i<buckets.length;i++) {
              buckets[i] = new LinkedList<>();
          }

          //node -> buckets
          for (int i =0;i<oldBucket.length;i++){
              LinkedList<Node> ll = oldBucket[i];
              for (int j = 0;j<ll.size();i++){
                  Node node =  ll.remove();
                  put(node.key,node.value);
              }
          }
      }

      public void put(k key,V value){
          int bi = hashFunction(key);
          int di = searchInLL(key,bi);

          if(di != -1){
              Node node = buckets[bi].get(di);
              node.value = value;
          }else {
              buckets[bi].add(new Node(key,value));
              n++;
          }

          double lambda = (double)n/N;
          if(lambda > 2.0){
              rehashing();
          }

      }

      public boolean containsKey(k key ){
          int bi = hashFunction(key);
          int di = searchInLL(key,bi);

          if(di != -1){
             return true;
          }else {
              return false;
          }
      }

      public V get(k key){
          int bi = hashFunction(key);
          int di = searchInLL(key,bi);

          if(di != -1){
              Node node = buckets[bi].get(di);
              return node.value;
          }else {
             return null;
          }
      }

      public V remove(k key){
          int bi = hashFunction(key);
          int di = searchInLL(key,bi);

          if(di != -1){
              Node node = buckets[bi].remove(di);
              n--;
              return node.value;
          }else {
              return null;
          }
      }

      public ArrayList<k> keySet(){
          ArrayList<k> keys = new ArrayList<>();

          for(int i =0;i<buckets.length;i++){
              LinkedList<Node> ll = buckets[i];
              for (Node node : ll){
                  keys.add(node.key);
              }
          }
          return keys;
      }

      public boolean isEmpty(){
          return n == 0;
      }


        public static void main(String[] args) {
            hashMap<String,Integer> hm = new hashMap<>();
            hm.put("India",100);
            hm.put("china",150);
            hm.put("pak",00);

            ArrayList<String> keys = hm.keySet();
            for(String key : keys){
                System.out.println(key);
            }

            System.out.println(hm.get("India"));
            System.out.println(hm.remove("India"));
            System.out.println(hm.get("India"));
        }


    }
}
