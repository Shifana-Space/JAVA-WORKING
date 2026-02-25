//Delete all the common elements of two string and concatenate both
   //a="aaaa"
   //b="aabbbb"
   //output:"bbbb"
public class deletecommonelementsinString {
    public static void main(String args[]){
        String a = "aaaaahigf";
        String b = "aabbbbzzzzihja"; 
        String result =""; 

        for(int i =0;i<a.length();i++){
         if(b.indexOf(a.charAt(i))==-1){
            result = result + a.charAt(i);
         }
        }
        for(int i =0;i<b.length();i++){
          if(a.indexOf(b.charAt(i))==-1){
            result = result + b.charAt(i);
          }
        }
        System.out.print(result);
    }
}
