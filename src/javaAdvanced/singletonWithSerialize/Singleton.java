package javaAdvanced.singletonWithSerialize;

import java.io.Serializable;

 public class Singleton implements Serializable {

    private Singleton() {
    }

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    protected Object readResolve() {
        return SingletonHelper.INSTANCE;
    }
}


