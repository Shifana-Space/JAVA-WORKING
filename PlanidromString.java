public class PlanidromString {
    public static void main(String args[]){
        String a ="In India Malayalam is best for mom and dad";
        String[] word = a.split(" ");
        for(int i=0;i<word.length;i++){
          
            String rev = new StringBuffer(word[i]).reverse().toString();

            if(!word[i].equalsIgnoreCase(rev)){
                System.out.print(word[i] + " ");
        
      
        }
    }
}
}
