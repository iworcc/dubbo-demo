package cn.ioms.dubbo.activemq.service;

import javax.print.attribute.standard.Destination;

public interface ProviderService {
	
	void sendMessage(Destination destination, final String msg);
	
	void sendMessage(final String msg);
}
