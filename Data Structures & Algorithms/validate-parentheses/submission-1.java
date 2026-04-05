class Solution {
    public boolean isValid(String s) {
        char ch[]=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:ch){
            if(c=='['||c=='{'||c=='('){
               stack.push(c);
            }
            else{
                if(stack.size() == 0) return false; 
                char check=stack.peek();
                if((c=='}' && check=='{')||((c==']'&& check=='['))||(c==')'&& check=='(')){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.size()==0;
        
    }
}
