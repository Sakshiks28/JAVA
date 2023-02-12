package TwoThread;
public class TwoThread {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Runnable R1=new Runnable() {

            int num=0;
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for(int i=1;i<=50;i++)
                {
                    num +=i;

                }
                double total=num/50;
                System.out.println("Average of first 50 number"+total);

            }
        };
        Runnable R2=new Runnable() {
            int[] array= {10,15,20,25,30};
            @Override
            public void run() {
                for(int i:array)
                {
                    System.out.println("Square of number"+i*i);
                }

            }
        };
        Thread T1=new Thread(R1);
        Thread T2=new Thread(R2);
        T1.start();
        T2.start();

    }

}