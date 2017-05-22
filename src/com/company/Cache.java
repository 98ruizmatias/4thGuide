package com.company;

/**
 * Created by pwnd on 4/5/2017.
 */
public class Cache {

    //Private Stuff

    private static int[] cache;

/*
- variable de instancia #
- constructor #
-consultar el cache #
- poner el valor que hay en esa posicion
-duplicar el cache
 */

    public static int[] getCache(){
        return Cache.cache;
    }

    public Cache(int[] cache){
        Cache.cache = cache;
    }

    public static void checkRange(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Valor incorrecto");
        }
    }

    public static void initCache(int size) {
        cache = new int[size];
    }

    public static int cachedFibo(int n) {
        Cache.checkRange(n);
        return Cache.cache[n - 1];
    }

    public static void cacheFibo(int n, int f) {
        Cache.checkRange(n);
        cache[n - 1] = f;
    }



}
