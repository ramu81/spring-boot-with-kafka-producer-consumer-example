package edu.chinna.kadhira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {
	@KafkaListener(topics = "Kafka_Example")
	public void handle(String order) {
		System.out.println("     "+order);
	}
}