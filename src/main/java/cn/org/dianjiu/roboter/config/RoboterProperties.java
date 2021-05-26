package cn.org.dianjiu.roboter.config;

import cn.org.dianjiu.roboter.common.enums.MessageType;
import cn.org.dianjiu.roboter.common.enums.RoboterType;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author dianjiu
 */
@ConfigurationProperties(prefix = "roboter")
public class RoboterProperties {
    private static final Boolean DEFAULT_ENABLE = false;
    private static final RoboterType DEFAULT_ROBOTER_TYPE = RoboterType.DINGTALK;
    private static final MessageType DEFAULT_MESSAGE_TYPE = MessageType.TEXT;

    private Boolean enable = DEFAULT_ENABLE;
    private RoboterType roboterType = DEFAULT_ROBOTER_TYPE;
    private MessageType messageType = DEFAULT_MESSAGE_TYPE;

    /**
     * 钉钉机器人的默认配置
     */
    public static class DingTalkProperties{

    }

    /**
     * 飞书机器人的默认配置
     */
    public static class FeiShuProperties{

    }

    /**
     * 企业微信机器人的默认配置
     */
    public static class WeTalkProperties{

    }
}
