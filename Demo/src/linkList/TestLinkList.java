package linkList;
// ≤‚ ‘¿‡
public class TestLinkList {
	public static void main(String[] args) {
		LinkList linklist = new LinkList();
		linklist.addFirstNode(20);
		linklist.addFirstNode(21);
		linklist.addFirstNode(19);
		// 19 21 20
		linklist.add(1, 22);
		linklist.add(2, 23);
		linklist.add(3, 99);
		linklist.displayAllNodes();
		Node node = linklist.deleteFirstNode();
		System.out.println("node : " + node.data);
		linklist.displayAllNodes();
		node = linklist.deleteBypos(2);
		System.out.println("node : " + node.data);
//		linklist.displayAllNodes();
//		linklist.deleteFirstNode();
//		Node node = linklist.deleteByData(19);
		Node node0 = linklist.deleteBypos(0);
		System.out.println("node : " + node0.data);
		linklist.displayAllNodes();
		Node node1 = linklist.findByPos(0);  
        System. out.println( "node1: " + node1. data);  
//        Node node2 = linklist.findByData(22);  
//        System. out.println( "node2: " + node2. data); 
	}
}
