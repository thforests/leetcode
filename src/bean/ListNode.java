package bean;

public class ListNode {
    public int val; //赋值链表的值
    public ListNode next;  // 下一个链表对象

    ListNode() {
    }



    ListNode(int x) {
        val = x;
    }


    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


}
