package zg.javacleint;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @Author ZGang
 * @Description:
 * @Date: Create in 11:36 2018/5/17
 * @Modified By:
 */
public class Broker {
    private static String host = "127.0.0.1";
    private static String userName = "ZGang";
    private static String password = "ZGang";
    private static int port = 5672;
    private static String vmhost = "/";
    static String queueName = "zg";

    public Broker(){
        try {
            createQueue();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Connection connection;
    Channel channel;

    public void createQueue() throws Exception {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost(host);
        connectionFactory.setPort(port);
        connectionFactory.setVirtualHost(vmhost);
        connectionFactory.setUsername(userName);
        connectionFactory.setPassword(password);
        connection = connectionFactory.newConnection();
        channel = connection.createChannel();
        AMQP.Queue.DeclareOk declareOk = channel.queueDeclare(queueName, false, false, false, null);
    }

    public void close() throws Exception{
        this.channel.close();
        connection.close();
    }
}
