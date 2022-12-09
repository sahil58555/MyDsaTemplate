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
    	    
    	    FastReader fr = new FastReader();
    	    int t = fr.nextInt();
    	   
    	    sb = new StringBuilder();
    	   
    	    while(t-- > 0)
    	    {
    	       int n = fr.nextInt();
			   int[] a = fr.getArr(n);
			   Arrays.sort(a);
			   int c = 0;
			   long mod = 998244353;

			   for(int ele : a) {

					if(ele == 1) c++;
			   }

			   long ans = 1;

			   for(int ele : a) {

					if(ele % 2 == 0 && c > 0) {

						c--;
						ele++;
						ans = (ans * ele) % mod;
					}
					else {
					
						ans = (ans * ele) % mod;
					}
			   }

			   sb.append(ans+"\n");
    	    }
    	    
    	    System.out.println(sb);
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
    }

