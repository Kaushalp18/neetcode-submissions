class Node {
    int value;
    Node next;
    Node prev;

    public Node(int value){
        this.value = value;
    }
}
class Deque {
    Node head;
    Node tail;

    public Deque() {
        this.head = null;
        this.tail = this.head;
    }

    public boolean isEmpty() {
        if(this.head == null || this.tail == null){
            return true;
        }
        return false;
    }

    public void append(int value) {
        Node node = new Node(value);
        if(isEmpty()){
            this.head = node;
            this.tail = node;
        } else{
            node.prev = this.tail;
            node.next = null;
            this.tail.next = node;
            this.tail = node;
        }
    }

    public void appendleft(int value) {
        Node node = new Node(value);
        if(isEmpty()){
            this.head = node;
            this.tail = node;
        } else {
            node.prev = null;
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    public int pop() {
        if(isEmpty()){
            return -1;
        } else {
            int tail = this.tail.value;
            this.tail = this.tail.prev;
            if(this.tail != null){
                this.tail.next = null;
            }

            return tail;
        }
    }

    public int popleft() {
        if(isEmpty()){
            return -1;
        } else {
            int head = this.head.value;
            this.head = this.head.next;
            if(this.head != null){
                this.head.prev = null;
            }

            return head;
        }
    }
}
