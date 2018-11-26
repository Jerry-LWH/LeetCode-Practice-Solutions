/**Author: Wenhao Lin
 *
 *Given a non-empty array of integers, every element appears twice except for one. Find that single one
 */
class Solution {
    public int singleNumber(int[] nums) {
       List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i< nums.length;i++){
            if(list.contains(nums[i])){
                list.remove(list.indexOf(nums[i]));
            }else{
                list.add(nums[i]);
            }
        }
        return list.get(0);
        
        
        // Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        // for(int i = 0; i< nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],2);
        //     }else{
        //         map.put(nums[i],1);
        //     }
        // }
        // int value=0;
        // Set set = map.entrySet();
        // Iterator iterator = set.iterator();
        // while(iterator.hasNext()) {
        //     Map.Entry mentry = (Map.Entry)iterator.next();
        //     if(((Integer)mentry.getValue())==1){
        //         value=((Integer)mentry.getKey());
        //     }
        // }
        // return value;
        
        
    }
}a