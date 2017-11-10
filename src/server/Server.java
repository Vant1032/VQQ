package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Vant
 * @version 2017/11/8 下午 12:04
 */
public class Server {
    public static void main(String[] args) {

    }

    int port = 5566;

    public Server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            Socket accept = serverSocket.accept();
            OutputStream outputStream = accept.getOutputStream();
            System.out.println(outputStream.getClass());
            System.out.println("Server.Server 已获得输出流");
            outputStream.write("你连上了服务器".getBytes("UTF-8"));
            outputStream.flush();
        }
    }
}
