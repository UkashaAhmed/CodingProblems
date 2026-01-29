class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0 ;
        for( int i = 0 ; i < gas.length ; i ++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }

        if(totalcost>totalgas) return -1;
        
        int final_index = 0;
        int current_gas = 0 ;
        int sum = 0 ;
        for( int i = 0 ; i < gas.length ; i ++){
            current_gas += gas[i] - cost[i]; 
            if(current_gas < 0 ){
                final_index = i+1;
                current_gas = 0 ;
            }
        }

        return final_index;
    }
}
