package com.company;

/**
 * Created by pwnd on 4/5/2017.
 */
public class Fibonacci {

    public int fibo(int n)
    {
        if ( n > 2 ){
            return fibo(n-1) + fibo(n-2);
        }
        else if ( n ==1 || n == 2) {
            return 1;
        }
        else{ //error
            throw new IllegalArgumentException("El valor debe ser positivo");
        }
    }

//Public Stuff



    public static int fibonacci(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Valor incorrecto");
        }

        int cached = Cache.cachedFibo(n);

        if (cached > 0) {
            return cached;
        }

        if (n <= 2) {
            Cache.cacheFibo(n, 1);
        }

        int f = fibonacci(n - 1) + fibonacci(n - 2);

        Cache.cacheFibo(n, f);

        return f;
    }

    public int fiboN(int n) {
        Cache.initCache(n);
        int f = fibonacci(n);
        return f;
    }

    public int[] fiboNArray(int n) {
        Cache.initCache(n);
        fibonacci(n);
        return Cache.getCache();
    }


}
