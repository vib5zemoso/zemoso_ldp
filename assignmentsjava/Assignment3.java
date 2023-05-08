package assignmentsjava;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Assignment3 {
    public static void sendPingRequest(String ip)
            throws UnknownHostException, IOException
    {
        InetAddress geek = InetAddress.getByName(ip);
        System.out.println("Sending Ping Request to " + ip);

        long finishTime;
        long startTime = System.currentTimeMillis();

        if (geek.isReachable(5000)) {
            finishTime = System.currentTimeMillis();

            System.out.println("Median of ping is " + ((finishTime - startTime)/2));
        }else{
            System.out.println("Sorry ! We can't reach to this host");
        }
    }

    public static void main(String[] args) throws UnknownHostException, IOException{

        String ipAddress = "www.youtube.com";
        sendPingRequest(ipAddress);
    }
}
