class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int j=0;j<t.length();j++){
            char ch = t.charAt(j);
            map.put(ch,map.getOrDefault(ch,1)-1);
        }

        for(int val:map.values()){
            if(val!=0) return false;
        }
        return true;
    }
}
