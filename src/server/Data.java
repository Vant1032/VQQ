package server;

import java.io.Serializable;

/**
 * 用于对象序列化的类
 * @author Vant
 * @version 2017/11/10 上午 11:53
 */
public class Data implements Serializable{
    String content;
    String name;
    String toName;
    boolean isPublic;

    public Data(String content, String name, String toName, boolean isPublic) {
        this.content = content;
        this.name = name;
        this.toName = toName;
        this.isPublic = isPublic;
    }
}
