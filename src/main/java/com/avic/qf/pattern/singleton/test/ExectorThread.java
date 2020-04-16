package com.avic.qf.pattern.singleton.test;


import com.avic.qf.pattern.singleton.lazy.LazySimpleSingletion;
import com.avic.qf.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * Created by LiBo.
 */
public class ExectorThread implements Runnable{

    public void run() {

        LazySimpleSingletion instance = LazySimpleSingletion.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
//        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + instance);

    }
}
