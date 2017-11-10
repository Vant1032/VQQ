package server;

import java.io.IOException;

/**
 * @author Vant
 * @version 2017/11/3 上午 9:37
 */
public class RunServer {
    public static void main(String[] args) {
        try {
            new Server();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
