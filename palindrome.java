public class palindrome {
    public static void main(String[] args) {
        String input = "MoM";

        if(isPalindrome(input)){
            System.out.println("It is a palimdrom");
        }else{
            System.out.println("Is not a palimdrom");
        }
    }
    public static boolean isPalindrome(String str){
        int left =0, right=str.length()-1;

        while(left <right){
            if(str.charAt(right) != str.charAt(left)){
                return false;
            }
            left ++;
            right --;
            
        }
        return true;
    }
    
}
