package Week_2.Day_2;

public class longest_substring_without_repeating_character {
    public int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length ; i++){
            for(int j = 1 ; j < ch.length;j++){
                if(ch[i] == ch[j]){
                    return j;
                }
            }
        }
        return -1;
    }
}
