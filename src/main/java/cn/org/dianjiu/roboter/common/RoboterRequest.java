package cn.org.dianjiu.roboter.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RoboterRequest implements Serializable {
    private static final long serialVersionUID = 2914853172898904181L;

    /**
     * 消息内容
     */
    private String content;
    /**
     * 标题
     */
    private String title;
    /**
     * 艾特成员信息
     */
    private List<String> users = new ArrayList<>();
    /**
     * 艾特成员
     */
    private Boolean atAll = false;

    // 提供一个静态builder方法
    public static RoboterRequest.Builder builder() {
        return new RoboterRequest.Builder();
    }

    // 外部调用builder类的属性接口进行设值。
    public static class Builder{
        private String content;
        private String title;
        private List<String> users = new ArrayList<>();
        private Boolean atAll = false;

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder users(List<String> users) {
            this.users = users;
            return this;
        }

        public Builder atAll(Boolean atAll) {
            this.atAll = atAll;
            return this;
        }

        public RoboterRequest build() {
            // 将builder对象传入到学生构造函数
            return new RoboterRequest(this);
        }
    }

    // 私有化构造器
    private RoboterRequest(Builder builder) {
        content = builder.content;
        title = builder.title;
        users = builder.users;
        atAll = builder.atAll;
    }
}
