class Solution {    
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int a :nums){
            if(set.contains(a)){
                //System.out.println("already present" + a);
                return a;
            }
            set.add(a);
        }
        //System.out.println(set);      
        return -1;

    }
}
