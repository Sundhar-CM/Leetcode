class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int y=0;
        if(num<0){
            return false;
        }
        while(x>9){
            y+=x%10;
            x=x/10;
            y*=10;
        }
        y+=x;
        System.out.println(y);
        return num==y?true:false;
    }
}
