import java.util.Stack;

public class valid_paranthesis {
    public class Solution{
        public boolean valid_paranthesis(String str){
           Stack<Character> stack=new Stack<>();
           for (Character c: str.toCharArray()){
               if(c=='{' || c=='[' || c=='('){
                   stack.push(c);
               }else{
                   if(stack.isEmpty()){
                       return false;
                   }
                   Character ch=stack.pop();
                   if( (c=='(' && ch!=')') &&  (c=='{' && ch!='}') &&  (c=='[' && ch!=']' ) ){
                       return false;
                   }
               }
           }
           return stack.isEmpty();
        }
    }
}
