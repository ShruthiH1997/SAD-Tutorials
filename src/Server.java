// A Java program for a Server
import java.net.*;
import java.io.*;


//Server

public class Server
{
    //initialize socket and input stream
    private Socket          socket   = null;
    private ServerSocket    server   = null;
    private DataInputStream in       = null;
    private DataOutputStream output  = null;
    // constructor with port
    public Server(int port)
    {
        
        Calculator calc=new Calculator();
        // starts server and waits for a connection
        try
        {
            server = new ServerSocket(port);

            System.out.println("Server started");
 
            System.out.println("Waiting for a client ...");
 
            socket = server.accept();
            System.out.println("Client accepted");
 
            // takes input from the client socket
            in = new DataInputStream(
                new BufferedInputStream(socket.getInputStream()));
            output= new DataOutputStream(socket.getOutputStream());
            String line = "";
            Input getInp;
            Calc c;
 
            // reads message from client until "Over" is sent
           
                try
                {
                    line = in.readUTF();
                   
                  /*  if(line.equals("2"))
                   {
                    getInp=new Statistic();
                    c=new Statistic();
                }               
                 else 
                    if(line.equals("3"))
                 {
                    getInp=new Geometric();
                    c=new Geometric();
                 }
                 else
                    {
                        getInp=new Calculator();
                        c=new Calculator();
                   }
                   
                    String[] exp=getInp.getInput();*/
                   // output.writeUTF(""+c.calculate(exp));
 
                }
                catch(IOException i)
                {
                    System.out.println(i);
                }
            
            System.out.println("Closing connection");
 
            // close connection
            socket.close();
            in.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
 
    public static void main(String args[])
    {
        Server server = new Server(5000);
    }
}

