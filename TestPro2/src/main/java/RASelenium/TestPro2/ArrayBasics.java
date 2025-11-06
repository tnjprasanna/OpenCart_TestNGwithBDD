package RASelenium.TestPro2;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayBasics implements Comparator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[] = {"bee","a","dee","cee"};
		
		ArrayBasics ab = new ArrayBasics();
		Arrays.sort(names, ab);
		
		for(int i=0; i < names.length; i++ )
			System.out.println(names[i]);
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String s1 = (String)o1;
		String s2 = (String)o2;
		
		int result = s1.compareTo(s2);
		
		if(result > 0)
			return 1;
		else if (result < 0)
			return -1;
		else
			return 0;
	}

}
