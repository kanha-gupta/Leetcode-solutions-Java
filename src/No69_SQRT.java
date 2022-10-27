public class No69_SQRT {
    public static void main(String[] args) {
        System.out.println(Mysqrt(245830));
    }
    static int Mysqrt(int x){
    //applying binary search to improve time complexity to O(logn)
        long start=0;
        long end=x;
        while (start+1<end){
            long mid= start + (end-start)/2;
            if(mid*mid==x){
                return (int) mid;
            } else if (mid*mid<x) {
                start=mid;
            }
            else{
                end=mid;
            }
        }
        //in the 2nd last step there would be 2 values. i.e. Start and end & for it to decide which value is the answer,
        //below code is used
        if(end*end==x){
            return (int) end;
        }
        return (int) start;
    }
}
