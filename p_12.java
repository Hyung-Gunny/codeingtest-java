class Solution {
    public long solution(int a, int b) 
    {
        
        long answer = 0;
        if(a>b)
        {
            for(int i=b; i<=a; i++)
            {
                answer+=b;
                b++;
            }
        }
        else
        {
            for(int j=a; j<=b; j++)
            {
                answer+=a;
                a++;
            }
        }
        
        return answer;
    }
}
