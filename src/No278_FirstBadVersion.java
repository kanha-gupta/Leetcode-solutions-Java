public class No278_FirstBadVersion {

        public int firstBadVersion(int high) {
            //implementing binary search
            int low=1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(isBadVersion(mid)){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            return low;
        }

    private boolean isBadVersion(int m) {
            return true;//randomly constructed to prevent local errors
    }
}
