package thread;

/*
 * 1，线程创建
	
	1.1继承Thread
	
	1）定义Thread的子类，实现run（）方法
	
	2）创建Thread子类的对象　　[创建之后，线程处于新建状态]
	
	3）调用线程对象的start方法　　[线程处于就绪状态]
	
	1.2实现runnable或者callable
	
	1）定义类，实现runnable接口，重写run方法
	
	2）创建上述类类的对象　　[创建之后，线程处于新建状态]
	
	3）不直接调用上述对象的start方法，而是将其作为target。 new Thread(对象).start（）　　[线程处于就绪状态]
	
	 
	
	2，控制线程的相关方法
	
	1）join 让一个线程等待另一个线程完成。调用后，当前线程阻塞，直到被调用的线程执行结束。
	
	2）sleep让线程休眠，由运行态进入阻塞态。
	
	3）yield让线程重新调度，有运行态进入就绪态。
	
	 
	
	3，线程同步
	
	1）同步代码块，利用Synchronized(obj){}修饰一段代码
	
	2）同步方法，将方法使用Synchronized修饰
	
	3）同步锁Lock，和同步方法比较类似，只是同步锁显示使用Lock对象作为同步锁
	
	 
	
	4，线程通信
	
	1）全局变量
	
	2）使用Object类的三个方法：该方法有同步监视器对象调用
	
	wait：导致当前进程等待
	
	notify：唤醒在该同步监视器上等待的进程（随机选一）
	
	notifyAll：唤醒在该同步监视器上等待的所有进程
 */



//public class ThreadDemo extends Thread{
//public class ThreadDemo implements Runnable{
//	public static void main(String[] args) {
//		Runnable r = new ThreadDemo();
//		Thread t1 = new Thread(r,"t1");
//		Thread t2 = new Thread(r, "t2");
//		t1.start();
//		t2.start();
//		t1.run();
//	}
	
	
//	public static void main(String[] args) {
//		ThreadDemo t1 = new ThreadDemo();
//		t1.start();
//	}
//	
//	
//	public void run() {
//		
//		System.out.println("Thread's name is " + Thread.currentThread().getName());
//	}
	
	
	
//}

public class ThreadDemo{
	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();
		
		Thread thread1 = new Thread() {
			public void run() {
				while(true) {
					try {
						Thread.sleep(500);						
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thread's name1 is " + Thread.currentThread().getName());
				}
			}
		};
		
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				while(true) {
					try {
						Thread.sleep(300);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					System.out.println("Thread's name2 is " + Thread.currentThread().getName());
				}
			}
		});
		
	//		thread2.start();
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Runnable name3 is " + Thread.currentThread().getName());
			}
		}) {
			public void run() {
				System.out.println("thread's name4 is " + Thread.currentThread().getName());
			}
		}.start();
	
	}
}

