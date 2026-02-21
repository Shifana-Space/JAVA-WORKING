public class SecretPin4 {
    public static void main(String args[]){
        int A = 3521;
        int B = 2452;
        int C = 1352;
        
        int tho = A/1000;
        int hun = (B/100)%10;
        int minC = Math.min(Math.min(C/1000,(C/100)%10),
                            Math.min((C/10)%10,C%10));

        int pin = (tho*hun) + minC; 
        System.out.print(pin);
    }
}