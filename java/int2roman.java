public class Solution {

    public void populateMaps(Map<Integer,String> map)
    {
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");
        return;

    }

    public String intToRoman(int num) {
        Map<Integer,String> int2rom = new HashMap<>();
        populateMaps(int2rom);
        int[] x = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder sb = new StringBuilder();
        for(int base:x)
        {
            int coeff = num/base;
            if(coeff!=0)
            {
                for(int k=0;k<coeff;k++)
                    sb.append(int2rom.get(base));


            }
             num = num-coeff*base;
        }
        return sb.toString();


    }
}
