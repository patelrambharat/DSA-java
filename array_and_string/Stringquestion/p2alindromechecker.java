public class p2alindromechecker {
    public static void main(String[] args) {
        String str = "nitin";
        int start=0;
        int end = str.length() -1;
        boolean flag = true;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
               flag  = false;
               break;

            }
            start++;
            end--;
        }
        if(flag){
            System.out.println("palindrome");
        }
        else{
            System.out.print("is not palindrome");
        }
    }
}
