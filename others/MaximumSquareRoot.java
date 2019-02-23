import java.util.HashMap;
import java.util.Map;

public class MaximumSquareRoot {
	public static void main(String[] args) {
		int firstNo = 1000;
		int secondNo = 1000000;
		int count=0;
		int maxCount = 0;
		Map<Integer, StringBuilder> map = new HashMap<>();
		
		for(int i=firstNo; i<= secondNo; i++) {
			count=findSqroot(i, 0);
			if(count != 0) {
			if(maxCount < count) { maxCount = count; }
			if(map.containsKey(count)) {
				map.get(count).append(" "+i);
			} else {
				map.put(count,new StringBuilder().append(i));
			}
			}
		}
		System.out.println(map.get(maxCount));
	}
	
	public static int findSqroot(int i, int count) {
		double j = Math.sqrt(i);
		
		if (j%1 != 0) {
			return count;
		}
		
		return findSqroot((int)j, ++count);	 
	}
}