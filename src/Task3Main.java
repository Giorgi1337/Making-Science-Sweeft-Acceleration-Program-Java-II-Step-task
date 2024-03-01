/*
    3. მოცემულია ერთმიმართულებიანი linked list-ის თავი. დაწერეთ ფუნქცია, რომელიც
    დააბრუნებს შეტრიალებულ ვერსიას. ListNode reverseList(ListNode head);

    მაგ. head = 1->2->3->4->5, result = 1<-2<-3<-4<-5.
*/
public class Task3Main {
    public static void main(String[] args) {
        MyLinkedSingleList myLinkedList = new MyLinkedSingleList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);

        System.out.println(myLinkedList);

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));

        myLinkedList.remove(1);
        System.out.println(myLinkedList);


        ReverseLinkedList solution = new ReverseLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversedHead = solution.reverse(head);

        System.out.println("Reversed list:");
        solution.printList(reversedHead);
    }
}