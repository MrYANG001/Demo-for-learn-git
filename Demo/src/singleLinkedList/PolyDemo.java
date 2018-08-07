package singleLinkedList;

public class PolyDemo {
	public static void main(String[] args) {

		// ����ʽp1
		PolyList p1 = new PolyList();
		p1.insert(new PolyNode(2, 2));
		p1.insert(new PolyNode(100, 3));
		p1.insert(new PolyNode(45, 5));
		p1.insert(new PolyNode(3, 20));
		System.out.println("p1=" + p1.printS());

		// ����ʽp2
		PolyList p2 = new PolyList();
		p2.insert(new PolyNode(8, 2));
		p2.insert(new PolyNode(7, 3));
		p2.insert(new PolyNode(4, 4));
		p2.insert(new PolyNode(6, 18));
		p2.insert(new PolyNode(7, 20));
		System.out.println("p2=" + p2.printS());

		// ���
		PolyList resultList1 = PolyList.add(p1, p2);
		System.out.println("p1+p2=" + resultList1.printS());

		System.out.println();

		// ����ʽp3
		PolyList p3 = new PolyList();
		p3.insert(new PolyNode(2, 1));
		p3.insert(new PolyNode(3, 2));
		p3.insert(new PolyNode(4, 3));
		System.out.println("p3=" + p3.printS());

		// ����ʽp4
		PolyList p4 = new PolyList();
		p4.insert(new PolyNode(5, 1));
		p4.insert(new PolyNode(1, 2));
		System.out.println("p4=" + p4.printS());

		// ���
		PolyList resuList2 = PolyList.multiply(p3, p4);
		System.out.println("p3*p4=" + resuList2.printS());

	}

}
