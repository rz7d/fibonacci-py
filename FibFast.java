import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.BitSet;

public class FibFast {

    private static final BigInteger ONE = BigInteger.valueOf(1);

    public static void main(String[] args) throws Exception {
        System.out.print("fib(x) x=");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        System.out.println(fib(n));
    }

    private static BigInteger fib(long n) {
        if (n <= 0) {
            return BigInteger.valueOf(n);
        }
        long bs = 0;
        long m = n;
        while (m > 1) {
            bs <<= 1;
            bs |= m & 1;
            m >>>= 1;
        }
        BigInteger a = ONE;
        BigInteger b = ONE;
        while (m < n) {
            m = (m << 1) + (bs & 1);
            bs >>>= 1;
            BigInteger np = a.pow(2).add(b.pow(2));
            if ((m & 1) == 0) {
                a = a.multiply(b.shiftLeft(1).subtract(a));
                b = np;
            } else {
                b = b.multiply(a.shiftLeft(1).add(b));
                a = np;
            }
        }
        return a;
    }

    private static long fibLong(long n) {
        if (n <= 0) {
            return n;
        }
        long bs = 0;
        long m = n;
        while (m > 1) {
            bs <<= 1;
            bs |= m & 1;
            m >>>= 1;
        }
        long a = 1;
        long b = 1;
        while (m < n) {
            m = (m << 1) + (bs & 1);
            bs >>>= 1;
            long np = (a * a) + (b * b);
            if ((m & 1) == 0) {
                a = a * ((b << 1) - a);
                b = np;
            } else {
                b = b * ((a << 1) + b);
                a = np;
            }
        }
        return a;
    }

}
