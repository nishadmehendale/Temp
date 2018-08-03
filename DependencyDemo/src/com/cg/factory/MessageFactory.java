package com.cg.factory;

import java.util.ResourceBundle;

import com.cg.provider.MessageProvider;
import com.cg.renderer.MessageRenderer;

public class MessageFactory {

	public static MessageRenderer getMessageRenderer() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			ResourceBundle bundle = ResourceBundle.getBundle("context");
			
			String providerStr = bundle.getString("provider");
			MessageProvider provider = (MessageProvider) Class.forName(providerStr).newInstance();
			String rendererStr = bundle.getString("renderer");
			MessageRenderer renderer = (MessageRenderer) Class.forName(rendererStr).newInstance();
			
			renderer.setMessageProvider(provider);
			return renderer;
	}

}
