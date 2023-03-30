public class DLL {
    Node head;
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
        public  void insertFirst(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            newNode.prev = null;
            if(head != null){
                head.prev = newNode;
            }
            head = newNode;
        }
        public void insertLast(int data){
            Node newNode = new Node(data);
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
            newNode.prev = currNode;
            newNode.next = null;
        }

        public void insertAtPosition(int val, int pos){
            Node newNode = new Node(val);
            Node currNode = head;
            Node node = currNode.next;
            int i = 1;
            while(i < pos - 1){
                currNode = currNode.next;
                node = node.next;
                i++;
            }
            currNode.next = newNode;
            newNode.prev = currNode;
            newNode.next = node;
            node.prev = newNode;
        }

        public void deleteFirst(){
           if(head == null || head.next == null){
               return;
           }
           head = head.next;
        }

        public void deleteLast(){
            if(head == null || head.next == null){
                return;
            }
            Node currNode = head;
            while(currNode.next.next != null){
                currNode = currNode.next;
            }
            currNode.next = null;
        }

        public void deleteAtPosition(int pos){
            Node currNode = head;
            Node node = currNode.next.next;
            int i = 1;
            while(i < pos - 1){
                currNode = currNode.next;
                node = node.next;
                i++;
            }
            currNode.next = node;
            node.prev = currNode;
        }
        public void printList(){
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.val + " -> ");
                currNode = currNode.next;
            }
            System.out.println("NULL");
        }

        void printReverse(){
           Node currNode = head;
           Node node = null;
           while(currNode != null){
               node = currNode;
               currNode = currNode.next;
           }
           while(node != null){
               System.out.print(node.val + " -> ");
               node = node.prev;
           }
            System.out.println("START");
        }


        public static void main(String[] args) {
          DLL list = new DLL();
          list.insertFirst(4);
          list.insertFirst(3);
          list.insertFirst(2);
          list.insertFirst(1);
          list.printList();
          list.insertLast(5);
          list.printList();
          list.insertAtPosition(6,2);
          list.printList();
          list.deleteFirst();
          list.printList();
          list.deleteLast();
          list.printList();
          list.deleteAtPosition(3);
          list.printList();
        }
}
