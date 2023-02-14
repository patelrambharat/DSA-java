public class c4outword {
    public static void main(String[] args) {
        String str = "I am a boy";
        int cnt =1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
