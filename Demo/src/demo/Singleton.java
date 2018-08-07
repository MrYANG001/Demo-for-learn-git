package demo;
/*
 * 单例模式：单例模式可以保证系统中一个类只有一个实例而且该实例易于外界访问，从而方便对实例个数的控制并节约系统资源。
 * 如果希望在系统中某个类的对象只能存在一个，单例模式是最好的解决方案。
 */

// 懒汉式 （线程不安全）
public class Singleton {
	public static Singleton single = null;
	private  Singleton() {
		
	}
	public static Singleton getInstance() {
		if(single==null) {
			single = new Singleton();
		}
		return single;
	}
}

// 饿汉式 （线程安全）
class Single1{
	public static Single1 single1 = new Single1();
	private  Single1() {
		
	}
	public static Single1 getInstance() {
		return single1;
	}
}

// 懒汉式加锁同步
class Single2{
	private static Single2 single2 = null;
	private Single2() {
		
	}
	public static synchronized Single2 getInstance() {
		if(single2==null) {
			single2 = new Single2();
		}
		return single2;
	}
}


//懒汉式加双重锁
class Single3{
	private static Single3 single3 = null;
	private Single3() {
		
	}
	public static Single3 getInstance() {
		if(single3==null) {
			synchronized(Single3.class) {
				if(single3==null) {
					single3 = new Single3();
				}
			}			
		}
		return single3;
	}
}


//静态内部类
class Single4{
	public static class LazyHolder{
		public static Single4 single4 = new Single4();
	}
	private Single4() {
		
	}
	public static Single4 getInatance() {
		return LazyHolder.single4;
	}
}