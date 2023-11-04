package com.company1.patterns.singleton;

public class Singleton {
    //1 способ
    //private static Singleton uniqueSingleton = new Singleton();
    //2 способ
    //private volatile static Singleton uniqueSingleton
    private static Singleton uniqueSingleton;
    private Singleton() {}
    public static Singleton getInstance() {
        if (uniqueSingleton == null) {
            uniqueSingleton = new Singleton();
        }
        return uniqueSingleton;
        //1 - return uniqueSingleton
        //2
//        if (uniqueSingleton == null) {
//        synchronized (Singleton.class);
//        if(uniqueSingleton == null){
//            uniqueSingleton = new Singleton();
//        }
//    }
    }
}
