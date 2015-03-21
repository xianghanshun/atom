package com.thread;

import java.lang.Thread;

public class TestMutiThread {
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName() + "�߳̿�ʼ��");
		//new ThreadTest("A").start();
		//new ThreadTest("B").start();
		TestMutiThread2 test = new TestMutiThread2();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.setName("A");
		t2.setName("B");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName() + "�߳̽�����");
	}
}


class ThreadTest extends Thread{
	public ThreadTest(String name){
		super.getName();
	}
	public void run(){
		System.out.println(getName() + " ��ʼ");
		for(int i = 0; i < 10; i++){
			System.out.println(i + " " + getName());
		}
		System.out.println(getName() + " ����");
	}
}


class TestMutiThread2 implements Runnable{
/*	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName() + " begin");
		TestMutiThread2 test = new TestMutiThread2();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName() + " end");
	}*/
	public void run(){
		System.out.println(Thread.currentThread().getName() + " begin");
		for(int i = 0; i < 10; i++){
			System.out.println(i + " " + Thread.currentThread().getName());
			try{
				Thread.sleep((int)Math.random() *10);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " end");
	}
}
