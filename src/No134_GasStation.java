public class No134_GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int totalGas=0;
        int currentGas=0;
        for (int i = 0; i < gas.length; i++) {
            currentGas=currentGas+gas[i]-cost[i]; //travel formulas
            totalGas=totalGas+gas[i]-cost[i];

            if(currentGas<0){
                currentGas=0;
                start=i+1; //start increments by 1 to try another index
            }
        }
        if(totalGas<0){
            return -1;
        } else {
            return start;
        }
    }
}
