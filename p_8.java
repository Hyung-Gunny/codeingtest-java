class Solution {
    boolean solution(String s) 
    {
        boolean answer = true;
        
        char at=' ';
        int x=0;
        int y=0;
    

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
       for(int i=0; i<s.length(); i++)
       {
           at=s.charAt(i);
           if(at=='p' || at=='P')
           {
               x++;
           }
           else if(at=='y' || at=='Y')
           {
               y++;
           }
          
           
       }
        
        if(x==y)
        {
            return true;
            
        }
        else if(x==0 && y==0)
        {
            return true;
        }
        else
        {
            return false;
        }
       
    }
}
