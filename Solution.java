class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n == 0) return false;
        while (true){
            if (n%2 == 0)
                n = n/2;
            else
                break;
        }
        return n==1;
    }
}