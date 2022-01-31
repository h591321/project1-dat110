package no.hvl.dat110.messaging;

import java.nio.ByteBuffer;
import java.util.Arrays;


import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static final int MESSAGINGPORT = 8080;
	public static final String MESSAGINGHOST = "localhost";
	

	public static byte[] encapsulate(Message message) {
		
		Integer messLenInt = message.getData().length;
		byte messLenByte = messLenInt.byteValue();
		ByteBuffer byteBuffer= ByteBuffer.allocate(SEGMENTSIZE);

		byte[] segment = byteBuffer.put(messLenByte).put(message.getData()).array();	
		
		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {

		int dataLen=segment[0];
		Message message = new Message();
		byte[] data= new byte[dataLen];
		
		for(int i=0;i<dataLen;i++) {
			data[i]=segment[i+1];
		}
		
		
		message.setData(data);
		
		return message;
		
	}
	
}
