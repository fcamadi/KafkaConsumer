package kafka.consumer.org;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;


/**
 * 
 * 0) Consumer interface
 * 
 * @author francd
 *
 */
public interface ConsumerSink {
	
	/**
	 * 1)
	 * 
	 * Indicates that an output binding target will be created by the framework.
	 * The value (here "consumerInput"), must be the value of  [cloud -> stream -> bindings]
	 * in the properties file
	 * 
	 * @return
	 */
    @Input("consumerInput")
    SubscribableChannel input();
    
}