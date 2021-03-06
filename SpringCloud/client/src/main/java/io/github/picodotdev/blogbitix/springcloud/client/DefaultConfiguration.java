package io.github.picodotdev.blogbitix.springcloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultConfiguration {

    @Value("${config.key}")
    String key;

    @Value("${config.password}")
    String password;

    @Value("${config.service}")
    String service;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
