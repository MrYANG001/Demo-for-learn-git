package thread;

/*
 * 1���̴߳���
	
	1.1�̳�Thread
	
	1������Thread�����࣬ʵ��run��������
	
	2������Thread����Ķ��󡡡�[����֮���̴߳����½�״̬]
	
	3�������̶߳����start��������[�̴߳��ھ���״̬]
	
	1.2ʵ��runnable����callable
	
	1�������࣬ʵ��runnable�ӿڣ���дrun����
	
	2��������������Ķ��󡡡�[����֮���̴߳����½�״̬]
	
	3����ֱ�ӵ������������start���������ǽ�����Ϊtarget�� new Thread(����).start��������[�̴߳��ھ���״̬]
	
	 
	
	2�������̵߳���ط���
	
	1��join ��һ���̵߳ȴ���һ���߳���ɡ����ú󣬵�ǰ�߳�������ֱ�������õ��߳�ִ�н�����
	
	2��sleep���߳����ߣ�������̬��������̬��
	
	3��yield���߳����µ��ȣ�������̬�������̬��
	
	 
	
	3���߳�ͬ��
	
	1��ͬ������飬����Synchronized(obj){}����һ�δ���
	
	2��ͬ��������������ʹ��Synchronized����
	
	3��ͬ����Lock����ͬ�������Ƚ����ƣ�ֻ��ͬ������ʾʹ��Lock������Ϊͬ����
	
	 
	
	4���߳�ͨ��
	
	1��ȫ�ֱ���
	
	2��ʹ��Object��������������÷�����ͬ���������������
	
	wait�����µ�ǰ���̵ȴ�
	
	notify�������ڸ�ͬ���������ϵȴ��Ľ��̣����ѡһ��
	
	notifyAll�������ڸ�ͬ���������ϵȴ������н���
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

