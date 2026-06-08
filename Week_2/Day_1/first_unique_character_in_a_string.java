package Week_2.Day_1;

import java.util.HashMap;

public class first_unique_character_in_a_string {
    public int firstUniqChar(String s) {
        int n = s.length();
        int ans = -1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < n;i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i = 0; i < n; i++){
            if(map.get(s.charAt(i)) == 1) return i;
        }
        return ans;
    }
}
