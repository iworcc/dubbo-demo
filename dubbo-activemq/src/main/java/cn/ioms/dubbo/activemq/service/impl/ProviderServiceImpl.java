package cn.ioms.dubbo.activemq.service.impl;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import cn.ioms.dubbo.activemq.service.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService{

	@Resource(name="jmsTemplate")
    private JmsTemplate jmsTemplate;

    public void sendMessage(Destination destination, final String msg){
        System.out.println(Thread.currentThread().getName()+" 向队列"+destination.toString()+"发送消息---------------------->"+msg);
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }
    
    @Override
    public void sendMessage(final String msg){
        System.out.println(Thread.currentThread().getName()+" 向队列"+jmsTemplate.getDefaultDestination()+"发送消息---------------------->"+msg);
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }

	@Override
	public void sendMessage(javax.print.attribute.standard.Destination destination, String msg) {
		// TODO Auto-generated method stub
		
	}
}
