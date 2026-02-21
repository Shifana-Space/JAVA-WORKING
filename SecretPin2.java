public class SecretPin2 {
    public static void main(String args[]){
        int A = 3521;
        int B = 2452;
        int C = 1352;
        int D = 38;
        int maxA = Math.max(Math.max(A/1000,(A/100)%10),
                            Math.max((A/10)%10,A%10));

        int maxB = Math.max(Math.max(B/1000,(B/100)%10),
                            Math.max((B/10)%10,B%10));

        int maxC = Math.max(Math.max(C/1000,(C/100)%10),
                            Math.max((C/10)%10,C%10));                    
   
        int mul = (maxA*maxB*maxC)+D;
        System.out.print(mul);

        
}
}