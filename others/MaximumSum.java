public class MaximumSum {
	public static void main(String[] args) {
		int[] input = new int[]{2, 1, -5, -1,-2, -2, -4, -3};
		int[] f = new int[input.length];
		int maximumSum=Integer.MIN_VALUE, sum=0;
		for (int i=0 ; i<input.length; i++) {
			sum += input[i]; 
			sum = sum > input[i] ? sum : input[i];
			maximumSum = maximumSum > sum ? maximumSum : sum;
		}
		System.out.println("Maximum Possible Sum: "+maximumSum);
	}
}