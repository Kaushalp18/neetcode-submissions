class Node {
    int val;
    Node next;

    public Node(int val){
        this.val = val;
        this.next = null;
    }

    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}

class LinkedList {

    Node head;
    Node tail;
    int size;

    public LinkedList() {
        this.head = null;
        this.tail = this.head;
        this.size = 0;
    }

    public int get(int index) {
        Node curNode = head;
        int i = 0;
        while(curNode != null){
            if(i == index){
                return curNode.val;
            }
            i++;
            curNode = curNode.next;
        }
        
        return -1;
    }

    public void insertHead(int val) {
        Node newHead = new Node(val);
        newHead.next = this.head;
        this.head = newHead;
        if(newHead.next == null){
            this.tail = newHead;
        }
        this.size++;
    }

    public void insertTail(int val) {
        Node newTail = new Node(val);
        if(this.tail == null){
            this.head = newTail;
            this.tail = newTail;
        } else {
            this.tail.next = newTail;
            this.tail = newTail;
        }
        this.size++;
    }

    public boolean remove(int index) {
        if(index >= size || index < 0){
            return false;
        }
        if(index == 0){
            this.head = this.head.next;
            this.size--;
            return true;
        }
        Node curNode = head;
        for(int i = 0; i<index-1; i++){
            curNode = curNode.next;
        }

        curNode.next = curNode.next.next;
        if(curNode.next == null){
            this.tail = curNode;
        }

        this.size--;

        return true;
    }

    public ArrayList<Integer> getValues() {
        Node curr = head;
        ArrayList<Integer> values = new ArrayList<>();
        while(curr != null){
            values.add(curr.val);
            curr = curr.next;
        }

        return values;
    }
}
