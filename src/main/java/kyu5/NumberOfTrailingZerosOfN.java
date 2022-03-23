package kyu5;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class NumberOfTrailingZerosOfN {
    public static int zeros(int n) {
        return zeroOfTrailing(factorial(n));
    }

    private static int zeroOfTrailing(Long l) {
        int count = 0;
        while (l % 10 == 0) {
            count++;
            l /= 10;
        }
        return count;
    }

    private static long factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
        return result.longValue();
    }

    @Test
    public void testZeros() {
        assertEquals(NumberOfTrailingZerosOfN.zeros(0), 0);
        assertEquals(NumberOfTrailingZerosOfN.zeros(6), 1);
        assertEquals(NumberOfTrailingZerosOfN.zeros(14), 2);
    }
}
