package com.oracle.oBootMybatis03.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.oracle.oBootMybatis03.handler.SocketHandler;

@Configuration		// 환경설정 세팅시 필수
@EnableWebSocket	// 소켓 용이 설정
public class WebSocketConfig implements WebSocketConfigurer {
	@Autowired		// DI insection
	SocketHandler socketHandler;
	
	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(socketHandler, "/chating");
	}

}
