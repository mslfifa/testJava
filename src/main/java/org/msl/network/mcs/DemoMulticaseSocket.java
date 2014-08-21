package org.msl.network.mcs;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketAddress;

/**
 * @author 蒙少立  作者 E-mail:mslfifa@163.com
 * @version 创建时间：2014年8月21日 上午11:10:14
 * 
 */

public class DemoMulticaseSocket {
	
	public void buildMcsInstance() throws IOException{
		SocketAddress address = new InetSocketAddress(4002);
		MulticastSocket ms = new MulticastSocket(address);
		System.out.println("^^^^^:"+ms.getBroadcast());
	}
	
	public void buildMcsBing() throws IOException{
		
		MulticastSocket ms = new MulticastSocket(null);
		ms.setReuseAddress(true);
		SocketAddress address = new InetSocketAddress(4002);
		ms.bind(address);
		System.out.println("####:"+ms.getReuseAddress());
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new DemoMulticaseSocket().buildMcsInstance();
		
		new DemoMulticaseSocket().buildMcsBing();
	}

}
