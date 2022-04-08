import java.io.*;
import java.util.*;
 
public class Contest1077C
{
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }
        String next() { // reads in the next string
            
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() { // reads in the next int
            return Integer.parseInt(next());
        }
        public long nextLong() { // reads in the next long
            return Long.parseLong(next());
        }
        public double nextDouble() { // reads in the next double
            return Double.parseDouble(next());
            }
        }
    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);
    static long mod = 1000000007;
    public static void main(String[] args)
    {
    	int t = r.nextInt();
    	while (t > 0)
    	{
    		t--;
    		long a = r.nextLong();
    		long b = r.nextLong();
    		long k =  r.nextLong();
            long l = r.nextLong();
    		long m = r.nextLong();
    		long n =  r.nextLong();
            
    		if (k%2 == 0)
    		{
    			pw.println((n/2)*(a-b-k-l-m));
    		}
    		else
    		{
    			pw.println((n/2)*(a-b-k-l-m) + a);
    		}
    	}
        pw.close();
    }
}