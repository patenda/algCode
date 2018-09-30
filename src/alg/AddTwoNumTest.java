package alg;

import org.junit.jupiter.api.Test;

import alg.AddTwoNum.ListNode;

class AddTwoNumTest {

	@Test
	void test() {
		int arr1[] = { 2, 4, 8 };
		int arr2[] = { 5, 6, 4, 3 }; // 定义两个整形数组，长度可以任意
		AddTwoNum ad = new AddTwoNum();
		ListNode ls1 = ad.arrToList(arr1);
		ListNode ls2 = ad.arrToList(arr2);
		ad.outPutResult(ls1);
		ad.outPutResult(ls2); // 将数组转换成链接结构存储，以后后续操作
		ListNode result = ad.addTwoNumbers(ls1, ls2); // 调用方法addTwoNumbers对两个链接相加
		ad.outPutResult(result); // 打印输出相加后的链接
		// fail("Not yet implemented");
	}

}
