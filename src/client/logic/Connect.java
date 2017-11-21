package client.logic;


import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * 从socket获得的流是没有缓冲效果的
 *
 * @author Vant
 * @version 2017/11/8 上午 9:40
 */
public class Connect {
    public static void main(String[] args) {
        try {
            Connect connect = new Connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    String address = "127.0.0.1";
    int port = 5566;

    public Connect() throws IOException {
        Socket socket = new Socket(address, port);//此时还未连接
        socket.setSoTimeout(10000);//10s超时
        InputStream inputStream = socket.getInputStream();
        System.out.println(inputStream.getClass());
        System.out.println("Connect.Connect 正在读取来之服务器的数据");
        byte[] bytes = inputStream.readAllBytes();

        System.out.println(new String(bytes, "UTF-8"));

    }
}
