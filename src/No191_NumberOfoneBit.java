public class No191_NumberOfoneBit {
    public static void main(String[] args) {
        System.out.print( hammingWeight(000111110));
    }
    static int hammingWeight(int n) {
       //Bit manipulation is required in this. n will taken as decimal number.
        //We check if there's 0 from the right & keep shifting
        int counter = 0;
        while (n != 0) {
            counter += n & 1;
            n >>>= 1;
        }

        return counter;
    }
}
