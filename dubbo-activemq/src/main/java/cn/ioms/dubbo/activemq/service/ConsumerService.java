package cn.ioms.dubbo.activemq.service;

import javax.jms.Destination;
import javax.jms.TextMessage;

public interface ConsumerService {
	TextMessage receive(Destination destination);
}
