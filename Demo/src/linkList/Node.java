package linkList;

public class Node {
	protected Node next; //ָ����
	protected int data; //������
	
	public Node(int data){
		this.data = data;
	}
	
	//��ʾ�˽ڵ�
	public void display(){
		System.out.println(data + " ");
	}
}
