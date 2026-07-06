class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int result[];
        Stack<Integer> stack = new Stack<>();
        
        for( int a : asteroids){
            if(a>0){
                stack.push(a);
            }
            else{
                while(!stack.isEmpty() && stack.peek() >0 && stack.peek() < -a){
                    stack.pop();
                }

                if(stack.isEmpty() || stack.peek()<0){
                    stack.push(a); // suppose [8,-8,2] ---> after removing 8,-8 to add 2 for that condition
                }

                if(stack.peek() == -a){
                    stack.pop();
                }
            }
        }

        result = new int[stack.size()];

        int i = result.length - 1;

        while(!stack.isEmpty()){
            result[i--] = stack.pop();
        }

        return result;
    }
}