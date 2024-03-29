import java.util.Arrays;
public class MyLinkedSingleList {
    private Node head;
    private int size;
    public void add(int value) {
        if (head == null){
            this.head = new Node(value);
        } else {
            Node temp = head;

            while (temp.getNext() != null){
                temp = temp.getNext();
            }

            temp.setNext(new Node(value));
        }

        size++;
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }
        int currentIndex = 0;
        Node temp = head;

        while (temp != null){
            if(currentIndex == index - 1){
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            }else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }

    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else{
                temp = temp.getNext();
                currentIndex++;
            }
        }

        throw new IllegalArgumentException();
    }
    public String toString(){
        int[] result = new int[size];

        int index = 0;
        Node temp = head;

        while (temp != null){
            result[index++] = temp.getValue();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }
    public static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }
    }
}
