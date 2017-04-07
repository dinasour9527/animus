package com.animus.user.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
 * #1	在注入配置类处使用@EnableConfigurationProperties({DemoConfig.class})
 * 		可以有相同作用
 */
@Component
/*
 * #1	locations在缺省情况下，会查找类路径下名为../application.properties的资源文件
 */
@ConfigurationProperties(prefix = "pre", locations = {"classpath:config/demo.properties"})
public class DemoConfig {
	private String prop1;
	private String prop2;
	public String getProp1() {
		return prop1;
	}
	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}
	public String getProp2() {
		return prop2;
	}
	public void setProp2(String prop2) {
		this.prop2 = prop2;
	}
}
