package offer;

import java.util.Scanner;

/*
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.
 * �򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class Title2 {
	String string ="";
	public String replaceSpace(StringBuffer str) {
		int m = str.indexOf(" ");
		if(m != -1) {
			str.replace(m, m+1, "%20");
			replaceSpace(str);
		}
		string = str.toString();
		return string;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str0 =sc.nextLine();		
		StringBuffer str = new StringBuffer();
		str.append(str0);
		Title2 title = new Title2();
		System.out.println(title.replaceSpace(str));
	}
}
