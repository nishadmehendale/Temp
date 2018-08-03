package com.cg.renderer;

import com.cg.provider.MessageProvider;

public class PDFRenderer implements MessageRenderer {

	
	private MessageProvider provider; 
	
	@Override
	public void render() {
		System.out.println(provider.getMessage()+ "In PDF :-D");
	}

	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;
	}
	
	
}
