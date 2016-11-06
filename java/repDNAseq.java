public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        Set<Integer> dict = new HashSet<>();
        Set<Integer> rep = new HashSet<>();
        List<String> res = new ArrayList<>();
        char[] map = new char[26];
        //map['A'-'A'] = 0;
        map['C'-'A'] = 1;
        map['G'-'A'] = 2;
        map['T'-'A'] = 3;
        for(int i=0;i<s.length()-9;i++)
        {
            int v=0;
            for(int j=i;j<i+10;j++)
            {
                v<<=2;
                v |= map[s.charAt(j)-'A'];
                
            }
            if(!dict.add(v) && rep.add(v))
                res.add(s.substring(i,i+10));
        }
        
     
        
        
        return res;
    }
}