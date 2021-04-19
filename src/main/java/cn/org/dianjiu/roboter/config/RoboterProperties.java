package cn.org.dianjiu.roboter.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "encrypt")
public class RoboterProperties {
    private static final String DEFAULT_VERSION = "1.0-SNAPSHOT";
    private static final String DEFAULT_GROUPID = "cn.org.dianjiu";
    private static final String DEFAULT_ARTIFACTID = "roboter-spring-boot-starter";

    private String version = DEFAULT_VERSION;
    private String groupId = DEFAULT_GROUPID;
    private String artifactId = DEFAULT_ARTIFACTID;
    private DingTalkProperties dingtalk;
    private WeTalkProperties wetalk;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }


    public static class DingTalkProperties{
        private String appId;

        public String getAppId() {
            return appId;
        }

        public void setAppId(String appId) {
            this.appId = appId;
        }
    }

    public static class WeTalkProperties{
        private String appId;

        public String getAppId() {
            return appId;
        }

        public void setAppId(String appId) {
            this.appId = appId;
        }
    }

    public static class FeiShuProperties{
        private String appId;

        public String getAppId() {
            return appId;
        }

        public void setAppId(String appId) {
            this.appId = appId;
        }
    }

}
