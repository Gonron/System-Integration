package udp;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author Dora Di
 */
public class UDPClient
{
    // Client needs to know server identification, <IP:port>
    private static final int serverPort = 7777;

    // buffers for the messages
    public static String message;
    private static byte[] dataIn = new byte[256];
    private static byte[] dataOut = new byte[256];

    // In UDP messages are encapsulated in packages and sent over sockets
    private static DatagramPacket requestPacket;
    private static DatagramPacket responsePacket;
    private static DatagramSocket clientSocket;

    private static String filePath;

    public static void main(String[] args) throws IOException
    {
        clientSocket = new DatagramSocket();
        InetAddress serverIP = InetAddress.getByName(args[0]);
        filePath = args[1];

        sendRequest(serverIP);
        receiveResponse();
        clientSocket.close();
    }

    public static void sendRequest(InetAddress serverIP) throws IOException
    {
        // Læs billed
        BufferedImage bImage = ImageIO.read(new File(filePath));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        // Konverter til byteArray
        ImageIO.write(bImage, "jpg", bos);
        dataOut = bos.toByteArray();

        // Send pakke
        requestPacket = new DatagramPacket(dataOut, dataOut.length, serverIP, serverPort);
        System.out.println(dataOut.length);
        clientSocket.send(requestPacket);
    }

    public static void receiveResponse() throws IOException
    {
        //clientSocket = new DatagramSocket();
        responsePacket = new DatagramPacket(dataIn, dataIn.length);
        clientSocket.receive(responsePacket);
        String message = new String(responsePacket.getData(), 0, responsePacket.getLength());
        System.out.println("Response from Server: " + message);
    }
}