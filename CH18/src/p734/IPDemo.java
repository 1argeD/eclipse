package p734;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress localip = InetAddress.getLocalHost();
		System.out.println(localip.getHostName());
		System.out.println(localip.getHostAddress());
	}
}
