/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import java.net.InetAddress;
import java.util.GregorianCalendar;
import java.util.*;

import javax.swing.JProgressBar;
/**
 *
 * @author User
 */
public  class App{

    
    public static  void sendPingRequest2(String ipAddress, javax.swing.JTextPane jTextPane1,javax.swing.JTextPane jTextPane2,javax.swing.JTextField jTextField1) {

        try {
            for (int i=0; i<10; i++){
            InetAddress inet = InetAddress.getByName(ipAddress);
             long finish = 0;
            long start = new GregorianCalendar().getTimeInMillis();
            System.out.println("Sending Ping Request to " + ipAddress);
            long sum =0;
           
          List<Long> list = new ArrayList<>();
              
          
            
            if (inet.isReachable(5000)) {

                finish = new GregorianCalendar().getTimeInMillis();
                long value= finish-start;
                
                list.add(value);
                long lowest = Collections.min(list);
                  System.out.println("value" + lowest);
               sum = value+value/10;
                jTextPane1.setText("Ping RTT: " + (value + "ms"));
               jTextPane2.setText("average ping: " + sum + "ms");
               jTextField1.setText("" + lowest + "ms");
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
        
       

    }

    void sendPingRequest(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
