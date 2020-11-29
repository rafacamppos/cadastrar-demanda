package com.example.demo.producer;

import com.example.demo.domain.Demanda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;



//@EnableBinding(Source.class)
public class Producer {
	@Autowired
	private Source mySource;
	
	public Producer(Source mySource) {
		super();
		this.mySource = mySource;
	}
	
	public void producer(Demanda obj) {
		mySource.output().send(MessageBuilder.withPayload(obj).build());
	}
	
	public void producer(Integer id) {
		mySource.output().send(MessageBuilder.withPayload(id).build());
	}
}
