package leetcode_119;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 9/28/2016.
 */
class LeetCode {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> dict = new ArrayList<Integer>();
        int curlvl = 0;
        while (curlvl <= rowIndex) {
            List<Integer> cur = new ArrayList<Integer>();
            for (int j = 0; j< curlvl+1; j++) {
                if (j == 0 || j == curlvl) {
                    cur.add(1);
                } else {
                    cur.add(dict.get(j-1) + dict.get(j));
                }
            }
            dict = cur;
            curlvl++;
        }
        return dict;
    }
}

