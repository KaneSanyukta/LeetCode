class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> lexicalOrder(int size){
        for(int i=1; i<=9;i++){
            solution(i,size,result);
        }
        return result;
    }

    public void solution(int currentNo,int size,List<Integer> result){
        if(currentNo>size){
            return;
        }
        result.add(currentNo);
        for(int i =0;i<=9;i++){
            int newNumber = currentNo * 10 + i;
            if(newNumber>size){
                return;
            }
            solution(newNumber,size,result);
        }
    }
}