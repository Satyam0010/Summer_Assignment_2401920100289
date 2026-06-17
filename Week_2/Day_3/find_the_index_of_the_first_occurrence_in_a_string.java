package Week_2.Day_3;
public class find_the_index_of_the_first_occurrence_in_a_string {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        //int l2 = needle.length();
        int i = 0;
        int j = 0;

        while(j < l1){
            

            if(haystack.charAt(j) == needle.charAt(i)){
                i++;

                if(i == needle.length()){
                int ans = j - i + 1;
                return ans;
            }
            }else{
              j = j - i;
              i = 0;
            }

            j++;
        }
        return -1;
    }
}