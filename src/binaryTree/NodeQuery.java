package binaryTree;

public class NodeQuery {
	public static void preOrder(NodeTree root) { // �ȸ�����
		if (root != null) {
			System.out.print(root.data + "-");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public static void inOrder(NodeTree root) { // �и�����

		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + "--");
			inOrder(root.right);
		}
	}

	public static void postOrder(NodeTree root) { // �������

		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + "---");
		}
	}

	public static void main(String[] args) {
		//int[] array = { 35, 17, 39, 9, 28, 65, 56, 87 };
		int[] array = { 35, 17, 39, 9, 28, 38, 56, 87 };
		NodeTree root = new NodeTree(array[0]); // ����������
		for (int i = 1; i < array.length; i++) {
			root.insert(root, array[i]); // ��������в�������
		}
		System.out.println("�ȸ�������");
		preOrder(root);
		
		System.out.println(); 
		
		System.out.println("�и�������"); 
		inOrder(root);
		
		System.out.println(); 
		
		System.out.println("���������"); 
		postOrder(root);
		
	}
}
