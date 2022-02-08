package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

public class Message {

	private byte[] data;

	public Message(byte[] data) {
		this.data=data;
	}
	public Message() {
		this.data=null;
	}
	
	public byte[] getData() {
		return this.data; 
	}
	public void setData(byte[] data) {
		this.data=data;
	}

}
