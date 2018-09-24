/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;
import java.io.*; 
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
        ; 
/**import java.net.*; 
 *
 * @author User
 */
public class main {
    static Constants a;

 public static void sendPingRequest(String ipAddress) 
              throws UnknownHostException, IOException 
  { 
    InetAddress geek = InetAddress.getByName(ipAddress); 
    System.out.println("Sending Ping Request to " + ipAddress); 
    if (geek.isReachable(5000)) 
      System.out.println("Host is reachable"); 
    else
      System.out.println("Sorry ! We can't reach to this host"); 
  } 
 
 
       public static void main(String[] args) {
           
        
           
           
        try {
            sendPingRequest("104.160.142.3");
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       }
}
