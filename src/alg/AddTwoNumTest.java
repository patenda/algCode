package alg;

import org.junit.jupiter.api.Test;

import alg.AddTwoNum.ListNode;

class AddTwoNumTest {

	@Test
	void test() {
		int arr1[] = { 2, 4, 8 };
		int arr2[] = { 5, 6, 4, 3 }; // ���������������飬���ȿ�������
		AddTwoNum ad = new AddTwoNum();
		ListNode ls1 = ad.arrToList(arr1);
		ListNode ls2 = ad.arrToList(arr2);
		ad.outPutResult(ls1);
		ad.outPutResult(ls2); // ������ת�������ӽṹ�洢���Ժ��������
		ListNode result = ad.addTwoNumbers(ls1, ls2); // ���÷���addTwoNumbers�������������
		ad.outPutResult(result); // ��ӡ�����Ӻ������
		// fail("Not yet implemented");
	}

}
