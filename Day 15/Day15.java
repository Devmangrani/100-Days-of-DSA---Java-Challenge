// package Day 15;
// 20. Valid Parentheses
public class Day15 {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
    
            //Step-1 
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                //Opening
                if (ch=='(' || ch=='[' || ch=='{') {
                    stack.push(ch);
                }else{
                    //Closing
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if((stack.peek() == '(' && ch==')') //()
                    || (stack.peek() =='{' && ch == '}') //{}
                    || (stack.peek()=='[' && ch ==']')) //[]
                    {
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
            //Step-3
            if (stack.isEmpty()) {
                return true;
            }
            return false;
        }
    }
}
