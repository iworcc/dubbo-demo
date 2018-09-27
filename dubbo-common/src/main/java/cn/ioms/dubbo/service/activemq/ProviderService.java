package cn.ioms.dubbo.service.activemq;

import javax.print.attribute.standard.Destination;

public interface ProviderService {
	
	void sendMessage(Destination destination, final String msg);
	
	void sendMessage(final String msg);
}
