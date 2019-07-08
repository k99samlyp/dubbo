package com.uvb76.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server implements Runnable {

    @Override
    public void run() {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
            context.start();
            System.out.println("启动完成 ");

            synchronized (Thread.currentThread()){
                Thread.currentThread().wait();
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }

//    public void StartUp(){
//
//        Thread t1 = new Thread(new Server());
//        t1.start();
//
//    }
}
