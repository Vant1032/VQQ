package server;

import com.sun.xml.internal.rngom.parse.host.Base;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 连接上一个客户端之后,开启两个线程,一个负责发送,一个用于接收
 * 本服务器定位是可以服务100人同时在线聊天
 * 服务器接收到消息:
 * 1.如果非公开,选择相应的私聊人发送消息
 * 2.如果公开,直接广播给除了他自己以外的所有人
 * 发送的消息附带昵称
 *
 * @author Vant
 * @version 2017/11/8 下午 12:04
 */
public class Server {
    public static void main(String[] args) {

    }

    static final int port = 5566;
    private ServerSocket serverSocket;

    /**
     * 用于提供服务器的线程管理
     */
    private ExecutorService executorService = new ThreadPoolExecutor(15, Integer.MAX_VALUE, 90, TimeUnit.SECONDS, new SynchronousQueue<>());
    private List<BufferedOutputStream> outputStreamList;

    Server() throws IOException {
        serverSocket = new ServerSocket(port);
        outputStreamList = Collections.synchronizedList(new ArrayList<BufferedOutputStream>());
    }

    public void start() throws IOException {
        while (true) {
            Socket accept = serverSocket.accept();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(accept.getInputStream());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(accept.getOutputStream());
            //采用对象序列化机制来传输数据

            outputStreamList.add(bufferedOutputStream);
            executorService.submit(() -> {
                while (true) {
                    //TODO:似乎这里实现必须要规定一个接受聊天消息的最大字节数, 不必了,自建数据类型,先用序列化,后期优化再用自建数据类型


                }
            });
        }
    }

    public void notifyAllClient(String content){
        for (BufferedOutputStream bufferedOutputStream : outputStreamList) {
            try {
                bufferedOutputStream.write(content.getBytes("UTF-8"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
