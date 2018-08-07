package demo;
/*
 * ����ģʽ������ģʽ���Ա�֤ϵͳ��һ����ֻ��һ��ʵ�����Ҹ�ʵ�����������ʣ��Ӷ������ʵ�������Ŀ��Ʋ���Լϵͳ��Դ��
 * ���ϣ����ϵͳ��ĳ����Ķ���ֻ�ܴ���һ��������ģʽ����õĽ��������
 */

// ����ʽ ���̲߳���ȫ��
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

// ����ʽ ���̰߳�ȫ��
class Single1{
	public static Single1 single1 = new Single1();
	private  Single1() {
		
	}
	public static Single1 getInstance() {
		return single1;
	}
}

// ����ʽ����ͬ��
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


//����ʽ��˫����
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


//��̬�ڲ���
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