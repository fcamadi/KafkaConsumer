package kafka.consumer.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;


/**
 * 
 * 2) In the main class:
 * 
 *    @EnableBinding: Enables the binding of targets annotated with Input and Output to a broker, 
 *    according to the list of interfaces passed as value to the annotation.
 *    
 *    
 * @author francd
 *
 */
@SpringBootApplication
@EnableBinding({ConsumerSink.class})
public class KafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

}
