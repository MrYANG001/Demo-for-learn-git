package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//public class Test extends Thread{
//	public static void main(String[] args) {
//		Test tt = new Test();
//		Test tt1 = new Test();
//		tt.start();	
//		tt1.start();
//	}
//	@Override
//	public void run() {
//		System.out.println("This is "+Thread.currentThread().getName());
//	}
//}

//public class Test implements Runnable{
//	public void run() {
//		System.out.println("This is "+Thread.currentThread().getName());
//	}
//	
//	public static void main(String[] args) {
//		Test tt = new Test();
//		Runnable run = new Test();
//		
//		Thread th = new Thread(tt);
//		Thread th1 = new Thread(tt);
//		Thread thr = new Thread(run,"thr");
//		th.start();
//		th1.start();
//		thr.start();
//	}
//}

class Test implements Callable<Integer>{
	public Integer call() {
		int i = 0;
		for(; i<100; i++) {
			System.out.println(Thread.currentThread().getName() + " 的循环变量i的值："+i);
		}
		return i;
	}
	public static void main(String[] args) {
		Test test = new Test();
		FutureTask<Integer> task = new FutureTask<Integer>(test) ;
		for(int i =0; i<100; i++) {
			System.out.println(Thread.currentThread().getName() + "的循环变量i的值："+i);
			if(i == 20) {
				new Thread(task,"有返回值的线程").start();				
			}			
		}
		try {
			System.out.println("子线程的返回值：" + task.get());
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}

public class ThreadTest{
	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();
		
		new Thread() {
			public void run() {
				System.out.println("This is " + Thread.currentThread().getName());
			};
		}.start();
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Runnable is " + Thread.currentThread().getName());
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("second is " + Thread.currentThread().getName());
			}
		}) {
				public void run() {
					System.out.println("third is " + Thread.currentThread().getName());
				}
		}.start();
		
	}
}
