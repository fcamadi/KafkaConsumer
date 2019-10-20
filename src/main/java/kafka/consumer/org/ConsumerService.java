package kafka.consumer.org;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;


@Component
public class ConsumerService {

	
	/**
	 * 3) In a service class a stream listener must be configured to catch the messages in the stream
	 * 
	 * @param input
	 */
    @StreamListener("consumerInput")
    public void handleConsumerInput(String input) {
    	
    	System.out.println("***********************************************");
        System.out.println(" Received Message: " + input);
        System.out.println("***********************************************");
    }
}