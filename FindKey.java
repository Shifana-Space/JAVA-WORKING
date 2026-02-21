public class FindKey {
    public static void main(String args[]){
        int A = 3521;
        int B = 2452;
        int C = 1352;

        int maxA = Math.max((A/1000),(B/1000));
         maxA = Math.max((maxA),(C/1000));  
        int minA = Math.min((A/1000),(B/1000));
         minA = Math.min((minA),(C/1000)); 
        int tho = maxA - minA;
        
        int maxB = Math.max(((A/100)%10),((B/100)%10));
         maxB = Math.max((maxB),((C/100))%10);  
        int minB = Math.min(((A/100)%10),((B/100)%10));
         minB = Math.min((minB),((C/100)%10)); 
        int hun = maxB - minB;

        int maxC = Math.max(((A/10)%10),((B/10)%10));
         maxC = Math.max((maxC),((C/10))%10);  
        int minC = Math.min(((A/10)%10),((B/10)%10));
         minC = Math.min((minC),((C/10)%10)); 
        int tens = maxC - minC;

        int maxD = Math.max((A%10),(B%10));
         maxD = Math.max((maxD),(C%10));  
       int minD = Math.min((A%10),(B%10));
         minD = Math.min((minD),(C%10));  
        int once = maxD - minD;
       
        System.out.print(tho*1000 + hun*100 + tens*10 + once);
    }
}
