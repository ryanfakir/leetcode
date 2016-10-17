package leetcode_423;

/**
 * Created by pyan on 10/16/2016.
 */
public class LeetCode {
    public class Solution {
        public String originalDigits(String str) {
            String res = "";

            int[] l = new int[26];
            for (int j = 0; j < str.length(); j++) l[str.charAt(j) - 'a']++;

            int z = l['z' - 'a'];
            int e = l['e' - 'a'];
            int r = l['r' - 'a'];
            int o = l['o' - 'a'];
            int n = l['n' - 'a'];
            int t = l['t' - 'a'];
            int w = l['w' - 'a'];
            int h = l['h' - 'a'];
            int f = l['f' - 'a'];
            int u = l['u' - 'a'];
            int i = l['i' - 'a'];
            int v = l['v' - 'a'];
            int s = l['s' - 'a'];
            int x = l['x' - 'a'];
            int g = l['g' - 'a'];

            int[] nums = new int[10];

            // zero
            nums[0] = z;
            e -= z;
            r -= z;
            o -= z;

            // six
            nums[6] = x;
            s -= x;
            i -= x;

            // eight
            nums[8] = g;
            e -= g;
            i -= g;
            h -= g;
            t -= g;
            g -= g;

            // two
            nums[2] = w;
            t -= w;
            o -= w;

            // seven
            nums[7] = s;
            s -= nums[7];
            e -= nums[7] * 2;
            v -= nums[7];
            n -= nums[7];

            // five
            nums[5] = v;
            f -= nums[5];
            i -= nums[5];
            v -= nums[5];
            e -= nums[5];

            // four
            nums[4] = f;
            f -= nums[4];
            o -= nums[4];
            u -= nums[4];
            r -= nums[4];

            // nine
            nums[9] = i;
            n -= nums[9] * 2;
            i -= nums[9];
            e -= nums[9];

            // three
            nums[3] = t;
            t -= nums[3];
            h -= nums[3];
            r -= nums[3];
            e -= nums[3] * 2;

            // one
            nums[1] = o;


            for (int m = 0; m < 10; m++) {
                for (int k = 0; k < nums[m]; k++) res += m;
            }


            return res;
        }
    }
}
