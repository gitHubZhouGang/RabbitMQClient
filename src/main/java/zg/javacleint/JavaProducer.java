package zg.javacleint;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @Author ZGang
 * @Description:
 * @Date: Create in 10:31 2018/5/17
 * @Modified By:
 */
public class JavaProducer extends Broker{

    public JavaProducer(){
        super();
    }
    public static void main(String[] args) {
        JavaProducer javaProducer = new JavaProducer();
        try {
            javaProducer.sendMasg("第一次RabbitMQ消息");
            javaProducer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void sendMasg(String msg) throws Exception{
        channel.basicPublish("",queueName, null, msg.getBytes());
    }


}
