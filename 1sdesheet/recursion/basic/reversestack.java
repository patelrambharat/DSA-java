class Solution
{ 
    static void insertAtbottom(Stack<Integer>s , int item){
        if(s.empty()){
            s.push(item);
            return;
            
        }
        int top  = s.peek();
        s.pop();
        insertAtbottom(s, item);
        s.push(top);
        
    }
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.empty()){
            return;
        }
        int item = s.peek();
        s.pop();
        reverse(s);
        insertAtbottom(s, item);
    }
}