package cn.ioms.dubbo.service.activemq;

import javax.jms.Destination;
import javax.jms.TextMessage;

public interface ConsumerService {
	
	TextMessage receive(Destination destination);
	
}
