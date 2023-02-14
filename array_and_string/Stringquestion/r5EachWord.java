public class r5EachWord {
    public static void main(String[] args) {
        String str = "hello word";

        String words[] = str.split(" ");
        String revString = "";
        for(int i=0;i<words.length;i++){
            String word = words[i];   //oth index we have java
            String revword = "";

            //java
            for(int j= word.length() -1;j>=0;j--){
                revword = revword + word.charAt(j); //a //v // a // j
            }

            revString = revString + revword +" ";
        }
        System.out.print(revString);
    }
}
