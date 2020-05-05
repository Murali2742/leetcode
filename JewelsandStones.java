/*You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
Example 1:
Input: J = "aA", S = "aAAbbbb"
Output: 3 */

class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer>map = new HashMap<>(); 
        int k=0;
        //HashMap<String,Integer>fmap = new<String,Integer>HashMap<>();
        for(char c: J.toCharArray())
        {
            if(map.containsKey(c))
                {
                int count=map.get(c)+1;
                map.put(c,count);
            }
                else
                {
                    map.put(c,1);
                }
            
        }
        
        for(char c: S.toCharArray())
        {
            if(map.containsKey(c))
            {
                k++;
            }
        }
        return k;
        
        
    }
}
