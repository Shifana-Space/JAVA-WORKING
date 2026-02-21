public class SecretPin1 {
     public static void main(String args[]){
        int a = 3521;
        int b = 2452;
        int c = 1352;
        int d=37;
           int a1=a/1000;
           int a2=(a/100)%10;
           int a3=(a/10)%10;
           int a4=a%10;
           int b1=b/1000;
           int b2=(b/100)%10;
           int b3=(b/10)%10;
           int b4=b%10;
           int c1=c/1000;
           int c2=(c/100)%10;
           int c3=(c/10)%10;
           int c4=c%10;
           int sum =0;
           
           if(0<=d && d%2==0){
             if(a1%2==0) sum=sum+a1;
             if(a2%2==0) sum=sum+a2;
             if(a3%2==0) sum=sum+a3;
             if(a4%2==0) sum=sum+a4;

             if(b1%2==0) sum=sum+b1;
             if(b2%2==0) sum=sum+b2;
             if(b3%2==0) sum=sum+b3;
             if(b4%2==0) sum=sum+b4;
          
              if(c1%2==0) sum=sum+c1;
             if(c2%2==0) sum=sum+c2;
             if(c3%2==0) sum=sum+c3;
             if(c4%2==0) sum=sum+c4;
             
            System.out.print(sum);
           }

            else{
             if(a1%2!=0) sum=sum+a1;
             if(a2%2!=0) sum=sum+a2;
             if(a3%2!=0) sum=sum+a3;
             if(a4%2!=0) sum=sum+a4;

             if(b1%2!=0) sum=sum+b1;
             if(b2%2!=0) sum=sum+b2;
             if(b3%2!=0) sum=sum+b3;
             if(b4%2!=0) sum=sum+b4;
          
              if(c1%2!=0) sum=sum+c1;
             if(c2%2!=0) sum=sum+c2;
             if(c3%2!=0) sum=sum+c3;
             if(c4%2!=0) sum=sum+c4;
             
            System.out.print(sum);
           }

    }
}
