package no.hvl.dat110.rpc;

import no.hvl.dat110.TODO;
import no.hvl.dat110.messaging.*;

public class RPCClient {

	private MessagingClient msgclient;
	private Connection connection;
	
	public RPCClient(String server, int port) {
	
		msgclient = new MessagingClient(server,port);
	}
	
	public void connect() {
		
		connection = msgclient.connect();
		
		// TODO - START
		// connect using the underlying messaging layer connection
		
		if (true)
			throw new UnsupportedOperationException(TODO.method());
		
		// TODO - END
	}
	
	public void disconnect() {
		
		connection.close();
		// TODO - START
		// disconnect/close the underlying messaging connection
		
		if (true)
			throw new UnsupportedOperationException(TODO.method());
		
		// TODO - END
	}
	
	public byte[] call(byte rpcid, byte[] params) {
		
		byte[] returnval = null;
		Message sendMSG = new Message(RPCUtils.encapsulate(rpcid, params));
		connection.send(sendMSG);
		
		Message replyMSG = connection.receive();
		
		returnval = replyMSG.getData();
		
		// TODO - START 
		
		/* 
		 * 
		Make a remote call on the RPC server by sending an RPC request message
		and receive an RPC reply message
		
		params is the marshalled parameters from the client-stub
				
		The rpcid, params, and return value must be encapsulated/decapsulated
		according to the RPC message format
			
		*/
				
		if (true)
			throw new UnsupportedOperationException(TODO.method());
		
		// TODO - END
		return returnval;
		
	}

}
