import java.util.Stack;

public class ReverseElements<T> {
    public Integer[] arr = {1,2,3,4,5};
    static Stack<Integer> stack = new Stack<>();

    public void pushElement() {
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
    }

    public void reverseElement(){
        pushElement();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.peek();
            stack.pop();
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ReverseElements<Integer> reverse = new ReverseElements<>();
        reverse.reverseElement();
    }
}
