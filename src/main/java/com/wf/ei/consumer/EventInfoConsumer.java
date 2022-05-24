package com.wf.ei.consumer;

import static org.springframework.kafka.support.KafkaHeaders.RECEIVED_PARTITION_ID;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import com.wf.avro.model.TennisScore;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class EventInfoConsumer {

	private static Logger logger = LoggerFactory.getLogger(EventInfoConsumer.class);
	
	@KafkaListener(topics = "${avro.topic.name}", containerFactory = "kafkaListenerContainerFactory")
	public void listen(ConsumerRecord<String, TennisScore> record){
		logger.info("******* Avro Message Consumed for Key: {} for Value: {}", record.key(), record.value());
	}

}
