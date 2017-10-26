package com.yonyou.testmain;

import java.util.concurrent.*;

public class TestMain {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newSingleThreadExecutor();

        FutureTask<String> task = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                int result = 1 / 0;
                return "123";
            }
        });

        pool.execute(task);

        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        pool.shutdown();
    }
}
