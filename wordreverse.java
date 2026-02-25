//Word reverse 
   //Input="indian institute of technology"
   //Output="naidni etutitsni fo ygolonhcet"

public class wordreverse {
    public static void main(String args[]){
        String s = "indian institute of technology";
        String word[] = s.split(" ");
        for(int i =0;i<word.length;i++){
        String rev = new StringBuffer(word[i]).reverse().toString();
        System.out.print(rev+ " ");
      }
}
}