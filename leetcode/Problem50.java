class Solution {
    public double myPow(double x, int n) {
        long no = n;
        if(n > 0)
            return findPow(x, no);
        else if (n < 0)
            return 1/findPow(x, -no);
        else 
            return 1;
    }
    
    public double findPow(double x, long n) {
        if (n == 1) {
	            return x;
	        } else {
	            if(n % 2 == 0) {
	                return findPow(x*x, n/2);
	            } else {
	                return x * findPow(x*x, (n-1)/2);
	            }
	        }
    }
}
