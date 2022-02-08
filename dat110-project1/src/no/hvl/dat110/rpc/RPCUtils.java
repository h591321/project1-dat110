package no.hvl.dat110.rpc;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import no.hvl.dat110.TODO;

public class RPCUtils {
	
	public static byte[] encapsulate(byte rpcid, byte[] payload) {
		
		return ByteBuffer.allocate(payload.length+1).put(rpcid).put(payload).array();
		
	}
	
	public static byte[] decapsulate(byte[] rpcmsg) {
		
		byte[] payload = new byte[rpcmsg.length-1];
		
		for(int i=0;i<rpcmsg.length-1;i++){
			payload[i]=rpcmsg[i+1];
			
		}
		
		return payload;
		
	}
	
	public static byte[] marshallString(String str) {

		return str.getBytes();
	}
	
	public static String unmarshallString(byte[] data) {
		
		return new String(data);

	}
	
	public static byte[] marshallVoid() {
		

		byte[] encoded = new byte[0];
		
		return encoded;
		
	}
	
	public static void unmarshallVoid(byte[] data) {
		
		
	}
	
	public static byte[] marshallBoolean(boolean b) {
		
		byte[] encoded = new byte[1];
				
		if (b) {
			encoded[0] = 1;
		} else
		{
			encoded[0] = 0;
		}
		
		return encoded;
	}
	
	public static boolean unmarshallBoolean(byte[] data) {
		
		return (data[0] > 0);
		
	}
	
	public static byte[] marshallInteger(int x) {
		
		byte[] encoded = ByteBuffer.allocate(4).putInt(x).array();
	
		
		return encoded;
	}
	
	
	public static int unmarshallInteger(byte[] data) {
		
		
		int decoded = ByteBuffer.wrap(data).getInt();
		
		return decoded;
		
	}
}
