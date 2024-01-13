package com.wcz0.asb.config;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wcz0
 */
@Configuration
@ConfigurationProperties(prefix = "asb")
public class AsbConfig {

        @Getter
        private String version;
        @Getter
        private String domain;
        @Getter
        private String wechatApiUrl;
        private boolean wechatJsApiDebug;
        private boolean wechatJsApiBeta;
        private boolean asyncConfig;
        private boolean asyncWeChatProgramTempList;
        @Getter
        private String imagePath;

    public void setVersion(String version) {
            this.version = version;
        }

    public void setDomain(String domain) {
            this.domain = domain;
        }

    public void setWechatApiUrl(String wechatApiUrl) {
            this.wechatApiUrl = wechatApiUrl;
        }

        public boolean getWechatJsApiDebug() {
            return wechatJsApiDebug;
        }

        public void setWechatJsApiDebug(boolean wechatJsApiDebug) {
            this.wechatJsApiDebug = wechatJsApiDebug;
        }

        public boolean getWechatJsApiBeta() {
            return wechatJsApiBeta;
        }

        public void setWechatJsApiBeta(boolean wechatJsApiBeta) {
            this.wechatJsApiBeta = wechatJsApiBeta;
        }

        public boolean getAsyncConfig() {
            return asyncConfig;
        }

        public void setAsyncConfig(boolean asyncConfig) {
            this.asyncConfig = asyncConfig;
        }

        public boolean getAsyncWeChatProgramTempList() {
            return asyncWeChatProgramTempList;
        }

        public void setAsyncWeChatProgramTempList(boolean asyncWeChatProgramTempList) {
            this.asyncWeChatProgramTempList = asyncWeChatProgramTempList;
        }

    public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }
}
