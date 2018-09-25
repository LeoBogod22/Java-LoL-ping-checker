/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import java.net.InetAddress;
import java.util.GregorianCalendar;

/**
 *
 * @author User
 */
public  class App{

    
    public static  void sendPingRequest2(String ipAddress, javax.swing.JTextPane jTextPane1,javax.swing.JTextPane jTextPane2) {

        try {
            for (int i=0; i<10; i++){
            InetAddress inet = InetAddress.getByName(ipAddress);
             long finish = 0;
            long start = new GregorianCalendar().getTimeInMillis();
            System.out.println("Sending Ping Request to " + ipAddress);
            long sum =0;
              
          
            
            if (inet.isReachable(5000)) {

                finish = new GregorianCalendar().getTimeInMillis();
                long value= finish-start;
               sum = value+value/10;
                jTextPane1.setText("Ping RTT: " + (value + "ms"));
               jTextPane2.setText("average ping: " + sum + "ms");
            } else {
                System.out.println(ipAddress + " NOT reachable.");
            }
        } 
        }catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        App m = new App();
        NewJFrame jf = new NewJFrame();
        m.sendPingRequest2("104.160.142.3", jf.jTextPane1, jf.jTextPane2);

    }

    void sendPingRequest(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
