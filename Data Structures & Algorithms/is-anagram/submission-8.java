
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        else{
        HashSet<Character> set = new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        boolean flag=false;
        for(char ch:set){
            int count1=0;
            int count2=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==ch){
                    count1++;
                }
            }
            for(int j=0;j<t.length();j++){
                if(t.charAt(j)==ch){
                    count2++;
                }
            }
            if(count1==count2)
                flag=true;
            else{
                flag=false;
                break;
            }


        }
        return flag;
        }
    }
}
