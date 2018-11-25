import java.util.TimerTask;
import java.util.Timer;

public class Main {


    public static void main(String[] args) {
        final int[] orderNum = {1};
        Timer timer = new Timer();

       Form form1=new Form();
             form1.setVisible(true);


        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                int size2 = form1.v.size();
                if ((form1.order==1)&&(size2 != 0)) {

                    Form2 form2 = new Form2(form1.v, orderNum[0]);
                    form2.setVisible(true);
                    form1.order=0;
                    form1.sum=0;
                    form1.v.clear();
                    orderNum[0]++;
                }
            }
        }, 2 * 60*10 , 2 * 60*10 );


    }
}