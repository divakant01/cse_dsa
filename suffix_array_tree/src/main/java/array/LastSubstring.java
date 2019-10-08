package array;

import java.util.Arrays;

/**
 * Created by Divakant on 10/6/19.
 */
public class LastSubstring extends SuffixArraY{

    public String lastSubstring(String s) {


        if(s==null || s.isEmpty() || s.length()<1 || s.length() > (4 * Math.pow(10,5)) || !s.equals(s.toLowerCase())){
            return "";
        }

        int length=s.length();
        String max="";

        for (int i = 0; i < length; i++) {
            String sub = s.substring(i, length);
            if (sub.compareTo(max) > 0)
                max = sub;
        }

        return max;
    }

}
