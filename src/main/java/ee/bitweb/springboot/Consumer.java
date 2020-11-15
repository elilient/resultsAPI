package ee.bitweb.springboot;

import com.rabbitmq.client.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Component
public class Consumer implements CommandLineRunner {
    public void run(String... args) throws Exception {
        main(args);
    }

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();

        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("votes", false, false, false, null);

        channel.basicConsume("votes", true, (consumerTag, message) -> {
            String payload = new String (message.getBody(), "UTF-8");
            System.out.println("Vote received: " + payload);
        }, consumerTag -> {});
    }

}
