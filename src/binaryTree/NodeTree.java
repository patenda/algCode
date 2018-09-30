package binaryTree;

public class NodeTree {
	int data; // ���ڵ�����
	NodeTree left; // ������
	NodeTree right; // ������

	public NodeTree() {
		super();
	}

	public NodeTree(int data) { // ʵ����������
		super();
		this.data = data;
		left = null;
		right = null;
	}

	public void insert(NodeTree root, int data) {
		if (data > root.data) { // �������Ľڵ���ڸ��ڵ�
			if (root.right == null) { // ���������Ϊ�գ��Ͳ��룬�����Ϊ�վ��ٴ���һ���ڵ�
				root.right = new NodeTree(data); // �ͰѲ���Ľڵ�����ұ�
			} else {
				this.insert(root.right, data);
			}
		} else { // �������Ľڵ�С�ڸ��ڵ�
			if (root.left == null) { // ���������Ϊ�գ��Ͳ��룬�����Ϊ�վ��ٴ���һ���ڵ�
				root.left = new NodeTree(data); // �ͰѲ���Ľڵ������߱�
			} else {
				this.insert(root.left, data);
			}
		}
	}
}