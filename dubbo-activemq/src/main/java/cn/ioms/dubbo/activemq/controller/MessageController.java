package cn.ioms.dubbo.activemq.controller;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ioms.dubbo.activemq.service.impl.ConsumerServiceImpl;
import cn.ioms.dubbo.activemq.service.impl.ProviderServiceImpl;

@Controller
public class MessageController {

	
    @Resource(name = "demoQueueDestination")
    private Destination destination;

    //队列消息生产者
    @Resource(name = "producerService")
    private ProviderServiceImpl producer;

    //队列消息消费者
    @Resource(name = "consumerService")
    private ConsumerServiceImpl consumer;

    @RequestMapping(value = "/SendMessage", method = RequestMethod.GET)
    @ResponseBody
    public String send(String msg) {
        System.out.println(Thread.currentThread().getName()+"------------send to jms Start");
        producer.sendMessage(msg);
        System.out.println(Thread.currentThread().getName()+"------------send to jms End");
        return msg;
    }

    @RequestMapping(value= "/ReceiveMessage",method = RequestMethod.GET)
    @ResponseBody
    public String  receive(){
        System.out.println(Thread.currentThread().getName()+"------------receive from jms Start");
        TextMessage tm = consumer.receive(destination);
        System.out.println(Thread.currentThread().getName()+"------------receive from jms End");
        try {
            return tm.getText();
        } catch (JMSException e) {
            e.printStackTrace();
        }
        return "error";
    }
}
