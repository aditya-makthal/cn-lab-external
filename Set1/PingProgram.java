package Set1;
import java.util.*;
import java.io.*;
import java.net.*;
class PingProgram{
    public static void main(String[] args) throws IOException, UnknownHostException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Ip Address : ");
        String ip = sc.nextLine();
        sc.close();
        pingService(ip);
    }
    static void pingService(String ip) throws IOException, UnknownHostException{
        InetAddress add = InetAddress.getByName(ip);
        System.out.println("Sending request to" + ip);
        if(add.isReachable(5000)){
            System.out.println("Host is reachable");
        }
        else{
            System.out.println("Host is not reachable");
        }
    }
}