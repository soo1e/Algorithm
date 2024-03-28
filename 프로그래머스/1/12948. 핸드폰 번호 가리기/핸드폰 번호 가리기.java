import java.util.*;

class Solution {
    public String solution(String phone_number) {
        char[] arr = new char[phone_number.length()];
        for (int i = 0; i < phone_number.length(); i++) {            
            arr[i] = phone_number.charAt(i);        
        }
        for (int i = 0; i < phone_number.length()-4; i++) {
            arr[i] = '*';
        }
        String str = String.valueOf(arr);
        return str;
    }
}