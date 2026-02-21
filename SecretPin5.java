public class SecretPin5 {
    public static void main(String arg[]){
      int A = 3521;
        int B = 2452;
        int C = 1352;
       
        int maxA = Math.max(Math.max(A/1000,(A/100)%10),
                            Math.max((A/10)%10,A%10));
        int minA = Math.min(Math.min(A/1000,(A/100)%10),
                            Math.min((A/10)%10,A%10));

        int maxB = Math.max(Math.max(B/1000,(B/100)%10),
                            Math.max((B/10)%10,B%10));
        int minB = Math.min(Math.min(B/1000,(B/100)%10),
                            Math.min((B/10)%10,B%10));

        int maxC = Math.max(Math.max(C/1000,(C/100)%10),
                            Math.max((C/10)%10,C%10));   
        int minC = Math.min(Math.min(C/1000,(C/100)%10),
                            Math.min((C/10)%10,C%10));

        int pin = (maxA+maxB+maxC)-(minA+minB+minC);
        System.out.print(pin);

}
}