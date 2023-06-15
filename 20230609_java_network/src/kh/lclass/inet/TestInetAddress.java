package kh.lclass.inet;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class TestInetAddress {
	public void testInetAddressEx() {
		
		// the constructor InetAddress() is not visible
		//원인 생성자 없음.
		// 조치내용: 1. singleton 확인 (주로 getInstance(), create() 메소드 지원 확인) 
		// 		   2. static method 지원 확인
		// 				생성자 없이 static method 즉 클래스메소드의 지원이 됨
		String host1 = "www.naver.com";
		String host2 = "www.google.com";
		String host3 = "www.oracle.com";
		try{
			InetAddress loopbackAddr = InetAddress.getLoopbackAddress();
			System.out.println(loopbackAddr);

			
			InetAddress localIP = InetAddress.getLocalHost();
			System.out.println(localIP);
			boolean isLoopback = localIP.isLoopbackAddress();
			System.out.println(isLoopback);
			
			System.out.println("==localhost++");
			
			InetAddress lb = InetAddress.getByName("localhost");
			System.out.println(Arrays.toString(lb.getAddress()));
			boolean lbisLoopback = lb.isLoopbackAddress();
			System.out.println(lbisLoopback);
			
			
			
			
			InetAddress[] ipAll = InetAddress.getAllByName(host1);
			System.out.println(Arrays.toString(ipAll));
			for(InetAddress ip : ipAll) {
				System.out.print(ip);
				byte[] ipAddr = ip.getAddress();
				System.out.print("ip : ");
				for(int i= 0; i<ipAddr.length; i++) {
					if (ipAddr[i]<0) {
						System.out.print(ipAddr[i]+256);
					}else {
						System.out.print(ipAddr[i]);
					}
					if(i!= ipAddr.length-1) {
						System.out.print(".");
					}
				}
				System.out.println();
				byte[] byteArr = new byte[] {(byte)223,(byte)130,(byte)195,11};
				System.out.println(Arrays.toString(byteArr));
				InetAddress byte2Arr = InetAddress.getByAddress(byteArr);
				System.out.println(byte2Arr);
				String byte2Arr2HostName =  byte2Arr.getHostName();
				System.out.println(byte2Arr2HostName);
				System.out.println("++++++++");
				
				
				
				
				
				
				
				
				
				
				System.out.println();
				System.out.print("ip: ");
				int cnt = 0;
				for (int item : ipAddr) {
					if (item < 0) {
						System.out.print(item+256);
					} else {
						System.out.print(item);
					} 
					if(cnt != ipAddr.length-1) {
						System.out.print(".");
					}
					cnt++;
				}
//				System.out.println(ip.getAddress());
			}
//			InetAddress ip = InetAddress.getByName(host1);
//			System.out.println(ip);
//			System.out.println(ip.toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
