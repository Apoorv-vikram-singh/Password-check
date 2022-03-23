import java.util.*;
public class Solution
{
    public int Pass(String pas,int len)
    {
        if(len<4)
        {
        return 0;
        }
        if(pas.charAt(0)>='1'&& pas.charAt(0)<='9')
        {
            return 0;
        }

        int num = 0, cap = 0;
        for (int i = 0; i <     len; i++)
        {
            if (pas.charAt (i) == ' ' || pas.charAt (i) == '/')
                return 0;
            if (pas.charAt (i) >= 'A' && pas.charAt (i) <= 'Z')
                cap++;
            if (pas.charAt (i) >= '0' && pas.charAt (i) <= '9')
                num++;
        }
        if (cap > 0 && num > 0)
            return 1;
        else
            return 0;
    }
    
    public static void main(String args[])
    {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        String  pas=sc.next();
        int len=pas.length();
        int result=obj.Pass(pas,len);
        System.out.println(result);
    }
}
