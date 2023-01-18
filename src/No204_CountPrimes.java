public class No204_CountPrimes {
        public int countPrimes(int n){
            boolean[] notPrimes= new boolean[n];
            int count=0;
            for (int i = 2; i <n ; i++) {
                if(notPrimes[i]== false){
                    count++;
                    //if Ith index is marked as false, increase count & mark i*j as true for NotPrime as well
                    //this way all upcoming numbers are determined if they are prime or not without exceeding Time limit
                    //with comparatively less iterations
                    for (int j = 2; i*j <n; j++) {
                        notPrimes[i*j]=true;
                    }
                }
            }
            return count;
        }
    //HAD TO LEARN Sieve of Erastosthenes algorithm FOR OPTIMIZATION




    // **BELOW SOLUTION WAS BRUTE FORCE ONE WITH TLE.

//    public int countPrimes(int n) {
//    int count=0;
//        for (int i = 2; i <n ; i++) {
//            if(isPrime(i)){
//                count++;
//            }
//        }
//        return count;
//    }
//    public boolean isPrime(int n){
//        if(n<=1){
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
}
