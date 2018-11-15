/**Author: Wenhao Lin
 *
 *Implement Stack using Queues
 */
class MyStack {
    Queue<Integer> myQueue1;
    Queue<Integer> myQueue2;
    
    /** Initialize your data structure here. */
    public MyStack() {
        myQueue1 = new LinkedList<Integer>();     //Queue is implemented with LinkedList
        myQueue2 = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        myQueue1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int num = 0;
        int size=0;
        while(myQueue1.isEmpty()==false){
            num=myQueue1.peek();             //to store the last element(to be returned)
            size++;                          //track the size
            myQueue2.add(myQueue1.remove());  //transfer to the other queue
        }
        
        //size-1 is use to ignore the lase elemment when transfer back to queue 1
        for(int i = 0; i < size-1; i++){     
            myQueue1.add(myQueue2.remove());
        }
        
        //but we do need to clear that last element in queue2
        myQueue2.remove();
        return num;
    }
    
    /** Get the top element. */
    /**similar to pop(), but no need to delete that last elemenet retrieved*/
    public int top() {
        int num = 0;
        while(myQueue1.isEmpty()==false){
            num = myQueue1.peek();
            myQueue2.add(myQueue1.remove());
        }
        
        while(myQueue2.isEmpty()==false){
            myQueue1.add(myQueue2.remove());
        }
        return num;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return myQueue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */