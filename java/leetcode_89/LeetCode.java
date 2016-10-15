package leetcode_89;

import java.util.ArrayList;

/**
 * Created by pyan on 10/14/2016.
 */
class LeetCode {
    public class Solution {
        public ArrayList<Integer> grayCode(int n) {
            ArrayList<Integer> ans=new ArrayList<Integer>();
            ans.add(0);
            int num=1;
            for(int i=1;i<=n;i++){
                for(int j=ans.size()-1;j>=0;j--){
                    ans.add(num+ans.get(j));
                }
                num<<=1;
            }
            return ans;
        }
    }
}
