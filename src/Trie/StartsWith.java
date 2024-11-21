package Trie;

import java.util.Arrays;

public class StartsWith {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        public Node(){
            Arrays.fill(children, null);
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level = 0;level<word.length();level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean startsWith(String prefix){
        Node curr  = root;
        for(int level = 0;level<prefix.length();level++){
            int idx = prefix.charAt(level)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[level];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = { "apple","app","mango","man","woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i = 0;i< words.length;i++){
            insert(words[i]);
        }
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
    }
}
