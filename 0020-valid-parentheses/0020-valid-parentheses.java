class Solution {
    char[] arr;
    int top;
    public void push(char ch){
        arr[++top] = ch;
    }
    public char pop(){
        return arr[top--];
    }
    public boolean isValid(String s) {
        arr = new char[s.length()];
        top = -1;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('||ch =='{'||ch =='['){
                push(ch);
            }
            else if (ch == ')') {
                if (top == -1 ||pop() != '(') {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (top == -1 ||pop() != '{') {
                    return false;
                }
            } else {
                if (top == -1 ||pop() != '[') {
                    return false;
                }
            }

        }
        return top==-1;
    }
}