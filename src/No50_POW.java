public class No50_POW {
    public double myPow(double base, int power) {
     double ans=1;
     if(power==0){
         return 1;
     }

     //for negative powers
     if(power<0){
         power=-power;
         base=1/base;
         while (power>0){
             if((power & 1)==1){
                 ans=ans*base;
             }
             base=base*base;
             power=power>>1;
         }
     }

     //for positive powers
        if(power>0){
            while (power>0){
                if((power & 1)==1){
                    ans=ans*base;
                }
                base=base*base;
                power=power>>1;
            }
        }

     return ans;
    }
}
