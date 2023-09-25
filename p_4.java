class Solution {
    public long solution(long n)
    {
        long answer = 0;
        double a=Math.sqrt(n);
        
        if(a%1==0)
        {
            answer=(long) Math.pow(a+1, 2);
            
        }
        else
        {
            answer=-1;
        }
        
        return answer;
    }
}
