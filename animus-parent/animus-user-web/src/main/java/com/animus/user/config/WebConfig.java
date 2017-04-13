package com.animus.user.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class WebConfig {
	
	@Autowired
	private LocalServerProperties serverProperties;
	
	/**
	 * dev环境下，配置Server
	 */
	@Bean
	@Profile(value="dev")
	public EmbeddedServletContainerCustomizer devEmbeddedServletContainerCustomizer() {
		return new EmbeddedServletContainerCustomizer() {
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				container.setPort(Integer.valueOf(serverProperties.getPort()).intValue());
			}
		};
	}
	/**
	 * pro环境下，配置Server
	 */
	@Bean
	@Profile(value="pro")
	public EmbeddedServletContainerCustomizer proEmbeddedServletContainerCustomizer() {
		return new EmbeddedServletContainerCustomizer() {
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				//container.setPort(Integer.valueOf(serverProperties.getPort()).intValue());
			}
		};
	}
}
