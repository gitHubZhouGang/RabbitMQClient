package zg.javacleint;

import com.rabbitmq.client.AMQP;

import java.util.Map;

/**
 * @Author ZGang
 * @Description:
 * @Date: Create in 11:35 2018/5/17
 * @Modified By:
 */
public class JavaConsumer extends Broker implements AMQP.Basic.Consume {
    public int getTicket() {
        return 0;
    }

    public String getQueue() {
        return null;
    }

    public String getConsumerTag() {
        return null;
    }

    public boolean getNoLocal() {
        return false;
    }

    public boolean getNoAck() {
        return false;
    }

    public boolean getExclusive() {
        return false;
    }

    public boolean getNowait() {
        return false;
    }

    public Map<String, Object> getArguments() {
        return null;
    }

    public int protocolClassId() {
        return 0;
    }

    public int protocolMethodId() {
        return 0;
    }

    public String protocolMethodName() {
        return null;
    }
}
