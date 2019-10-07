package array;

import java.util.Arrays;

/**
 * Created by Divakant on 10/6/19.
 *
 * Let the given string be "banana".

 0 banana                          5 a
 1 anana     Sort the Suffixes     3 ana
 2 nana      ---------------->     1 anana
 3 ana        alphabetically       0 banana
 4 na                              4 na
 5 a                               2 nana

 So the suffix array for "banana" is {5, 3, 1, 0, 4, 2}
 *
 */
public class SuffixArraY {

    static class SA implements Comparable<SA>{
        private static final String DELIMITER = ":";
        private String words;
        private int suffix;

        public SA(String words, int suffix) {
            this.words = words;
            this.suffix = suffix;
        }

        public SA(String words) {
            this.words=words;
        }

        @Override
        public int compareTo(SA o) {
            return this.words.compareTo(o.words);
        }

        @Override
        public String toString() {
            return suffix+DELIMITER+words;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SA sa = (SA) o;

            //if (suffix != sa.suffix) return false;
            return words.equals(sa.words);
        }

        @Override
        public int hashCode() {
          //  int result = words.hashCode();
           // result = 31 * result + suffix;
            return words.hashCode();
        }
    }

    SA[] build(String text){

        int length=text.length();

        if (text==null || text.isEmpty())
            return new SA[]{};

        SA[] suffixArray=new SA[length];

        for (int i = 0; i < length; i++) {
            suffixArray[i]=new SA(text.substring(i,length),i);
        }

        Arrays.sort(suffixArray);

        return suffixArray;
    }

   /* int[] build(String text){

        int length=text.length();

        if (text==null || text.isEmpty())
            return new int[]{};

        int[] suffixArray=new int[length];

        for (int i = 0; i < length; i++) {
            suffixArray[i]=;
        }

        Arrays.sort(suffixArray);

        return suffixArray;
    }*/

}
