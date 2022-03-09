package collection1demo;

 

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

 

public class collection1demo 
{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //        SortedSet ts  = new TreeSet<String>();
        //        ts.add(1);
        //        ts.add(2);
        //        ts.add("3");
        //        int[] arr = new int[5];
        //        arr[0] = 3;
        //        arr[1] = "java";
        //        System.out.println(ts);
        String s = "java program";
        System.out.println(s.length());
// for loop int i = 0;
        // foreach loop
        HashMap<Character,Integer> charCountMap = new HashMap();
        System.out.println(charCountMap);
        char[] ch = s.toCharArray();
//        System.out.println("ch is "+Arrays.toString(ch));
        for(char c: ch) {
            if(charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c)+1);
            }else {
                charCountMap.put(c,1);
            } 

 

        }
        System.out.println(charCountMap);
        // duplicate count of char
        Set<Entry<Character, Integer>> se = charCountMap.entrySet();
        for(Map.Entry<Character,Integer> entry  : se){
            if(entry.getValue()>1) {
                System.out.println("duplicate key is "+ entry.getKey());
            }
        }
        //    cSystem.out.println(charCountMap.entrySet());
        // count words
        String  languages = "marati hindi english telugu hindi japanese  telugu";
        String[] splittedArray = languages.split(" ");
        HashMap<String,Integer> wordCountMap = new HashMap();
        for(String word: splittedArray) {
            if(wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word)+1);
            }else {
                wordCountMap.put(word,1);
            }
        }
        System.out.println(wordCountMap);
        Set<Map.Entry<String, Integer>> se2 = wordCountMap.entrySet();
        for(Map.Entry<String,Integer> entry  : se2){
            if(entry.getValue()>1) {
                System.out.println("duplicate word is "+ entry.getKey());
            }
        }
    }

 

}