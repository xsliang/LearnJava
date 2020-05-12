package com.xsliang;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomThread extends Thread {
	@Override
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(this);
	}
	
	public static void testCachedPool() {
		ExecutorService eService=Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			eService.execute(new ThreadRunnable(i*100, i*1000));
		}
		eService.shutdown();
	}
	
	public static void testFixedPool() {
		ExecutorService eService=Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			eService.execute(new ThreadRunnable(i*100, i*1000));
		}
		eService.shutdown();
	}
	
	
	public static void main(String[] args) {
		CustomThread thread1=new CustomThread();
		thread1.setPriority(Thread.MAX_PRIORITY);
		CustomThread thread2=new CustomThread();
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		//thread2.setDaemon(true);
		thread2.start();
		
		testCachedPool();
		testFixedPool();
	}
}
