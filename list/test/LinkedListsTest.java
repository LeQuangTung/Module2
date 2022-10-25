import static org.junit.jupiter.api.Assertions.*;

class LinkedListsTest {
    public static void main(String[] args) {
        LinkedLists<String> str = new LinkedLists<String>();
        str.addLast("a");
        str.addLast("b");
        str.addLast("c");
        str.addLast("d");
        str.addLast("e");
        //str.printList();
        LinkedLists<String> str1 = str.clone();
        str1.printList();
    }

}