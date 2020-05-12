package com.xsliang;

import java.util.IllegalFormatCodePointException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadConflict {
	private int sum;

	public int getSum(int start, int end) {
		sum = 0;
		for (int i = start; i < end; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		ThreadConflict threadConflict = new ThreadConflict();
		System.out.println("main thread sum = " + threadConflict.getSum(0, 1000));
		
		ExecutorService eService=Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			eService.execute(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName()+" sum = " + threadConflict.getSum(0, 1000));
				}
			});
		}
	}
}
