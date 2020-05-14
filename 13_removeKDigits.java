class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(n<=k)
            return "0";
        int i=0;
        Stack<Character> stack = new Stack<>();
        for(i=0; i<n; i++)
        {
            if(stack.isEmpty())
                stack.push(num.charAt(i));
            else if(stack.peek()<=num.charAt(i))
                stack.push(num.charAt(i));
            else
            {
                while(!stack.isEmpty()&&stack.peek()>num.charAt(i))
                {
                    if(k==0)
                        break;
                    stack.pop();
                    k--;
                }
                stack.push(num.charAt(i));
            }
        }
        String result="";
        while(!stack.isEmpty())
        {
            result = String.valueOf(stack.peek())+result ;
            stack.pop();
        }
        if(k!=0)
            result = result.substring(0,result.length()-k);
        i=0;
        while(i<result.length() && result.charAt(i)=='0')
        {
            i++;
        }
        result = result.substring(i);
        if(!result.equals(""))
            return result;
        return "0";
    }
}
