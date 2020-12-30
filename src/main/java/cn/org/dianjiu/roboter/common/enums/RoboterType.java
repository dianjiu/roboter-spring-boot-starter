package cn.org.dianjiu.roboter.common.enums;

public enum RoboterType {
    DINGTALK("钉钉", "https://oapi.dingtalk.com/robot/send?access_token", true),
    WETALK("企业微信", "https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key", true);

    private String type;
    private String robotUrl;
    /**
     * 是否开启
     */
    private boolean enabled;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRobotUrl() {
        return robotUrl;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setRobotUrl(String robotUrl) {
        this.robotUrl = robotUrl;
    }

    RoboterType() {
    }

    RoboterType(String type, String robotUrl, boolean enabled) {
        this.type = type;
        this.robotUrl = robotUrl;
        this.enabled = enabled;
    }
}