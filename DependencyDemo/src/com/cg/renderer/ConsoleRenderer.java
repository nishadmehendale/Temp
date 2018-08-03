package com.cg.renderer;

import com.cg.provider.MessageProvider;

public class ConsoleRenderer implements MessageRenderer {
	
	private MessageProvider provider; 
	
	@Override
	public void render() {
		System.out.println(provider.getMessage());
	}

	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;
	}
	
	

}
