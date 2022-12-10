import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args)
	{
		FastReader obj = new FastReader(3);
		obj.solver();
	}
	
}

class FastReader 
{
		BufferedReader br;
		StringTokenizer st;
 
		public FastReader()
		{
			br = new BufferedReader(
				new InputStreamReader(System.in));
		}
		
		public FastReader(int n)
		{
		    
		}
 
		String next()
		{
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
 
		int nextInt() { return Integer.parseInt(next()); }
 
		long nextLong() { return Long.parseLong(next()); }
 
		double nextDouble()
		{
			return Double.parseDouble(next());
		}
 
		String nextLine()
		{
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
		
        int[] getArr(int size)
    	{
    	    int[] a = new int[size];
    	    
    	    for(int i=0;i<size;i++)
    	        a[i] = nextInt();
    	        
    	   return a;     
    	}
    	
    	StringBuilder sb;
    	int mod = 1000000000 + 7;
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;
    	
    	void solver()
    	{
    	    
    	    List<Integer> l = new ArrayList<>();
			l.add(4);
			l.add(3);
			l.add(2);
			l.add(1);
			//l.add(4);

    	    System.out.println(maxTrailing(l));
    	   // System.out.println(Arrays.toString(funcBouquet(new int[]{7,43,12,4,1,3,78,6}, 4)));
    	}
    	
		public static int[] funcBouquet(int[] flowerStick, int random) {

			int n = flowerStick.length;
			Arrays.sort(flowerStick);
			int[] ans = new int[n];
			int idx = 0;

			for(int i = 0 ; i < random ; i++) {

				ans[idx++] = flowerStick[i]; 
			}

			for(int i = n - 1 ; i >= random ; i--) {

				ans[idx++] = flowerStick[i];
			}

			return ans;
		}

        void sort(int[] a)
    	{
    	    ArrayList<Integer> list = new ArrayList<>(a.length);
    	    
    	    for(int i=0;i<a.length;i++)
    	    list.add(a[i]);
    	    
    	    Collections.sort(list);
    	    
    	    for(int i=0;i<a.length;i++)
    	    a[i] = list.get(i);
    	    
    	}
    	long gcd(long a, long b)
        {
            if (a == 0)
                return b;
            return gcd(b % a, a);
        }
         
        // method to return LCM of two numbers
        long lcm(long a, long b)
        {
            return (a / gcd(a, b)) * b;
        }

		public static int maxTrailing(List<Integer> arr) {

			int max = Integer.MIN_VALUE;
			int min = arr.get(0);

			for(int i = 1 ; i < arr.size() ; i++) {

				if(min < arr.get(i)) {

					max = Math.max(max, arr.get(i) - min);
				}

				min = Math.min(min, arr.get(i));
			}

			if(max == Integer.MIN_VALUE) return -1;

			return max;
		}
    }

	// import java.util.*;
	// import java.lang.*;
	// import java.io.*;
	
	// /*
	//  * 
	//  */
	// public class Solution
	// {
	//   public static int[]  funcBouquet(int[] flowerStick, int random)
	//   {
	// 	int n = flowerStick.length;
	// 	Arrays.sort(flowerStick);
	// 	int[] ans = new int[n];
	// 	int idx = 0;

	// 	for(int i = 0 ; i < random ; i++) {

	// 		ans[idx++] = flowerStick[i]; 
	// 	}

	// 	for(int i = n - 1 ; i >= random ; i--) {

	// 		ans[idx++] = flowerStick[i];
	// 	}

	// 	return ans;
	//   }
	
	//   public static void main(String[] args)
	//   {
	// 	Scanner in = new Scanner(System.in);
	// 	//input for flowerStick
	// 	int flowerStick_size = in.nextInt();
	// 	int flowerStick[] = new int[flowerStick_size];
	// 	for(int idx = 0; idx < flowerStick_size; idx++)
	// 	{
	// 	  flowerStick[idx] = in.nextInt();
	// 	}
	// 	// input for random
	// 	int random = in.nextInt();
		
		
	// 	int[] result = funcBouquet(flowerStick, random);
	// 	for(int idx = 0; idx < result.length - 1; idx++)
	// 	{
	// 	  System.out.print(result[idx] + " ");
	// 	}
	// 	System.out.print(result[result.length - 1]);
	//   }
	// }