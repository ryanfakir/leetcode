package leetcode_67;

/**
 * Created by pyan on 10/3/2016.
 */
class LeetCode {
    public class Solution {
        public String addBinary(String a, String b) {
            if (a.length() < b.length()) {
                String temp = a;
                a = b;
                b = temp;
            }
            int lenB = b.length();
            int lenA = a.length();
            int carry = 0;
            String digit = "";
            for (int i = lenB- 1; i>=0; i--) {
                System.out.println(i);
                int sum = (int)(a.charAt(i+lenA-lenB)-'0') + (int)(b.charAt(i)-'0') + carry;
                carry = sum/2;
                digit += sum%2;
            }
            for (int i = lenA-lenB-1; i>=0; i--) {
                int sum = (int)(a.charAt(i)-'0') + carry;
                carry = sum/2;
                digit += sum%2;
            }
            if (carry != 0) {
                digit += "1";
            }
            return new StringBuilder(digit).reverse().toString();
        }
    }
}
