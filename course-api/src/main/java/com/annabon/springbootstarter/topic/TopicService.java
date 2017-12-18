package com.annabon.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework description"), 
			new Topic("java", "Core Java", "Core Java description"), 
			new Topic("javascript", "JavaScript", "JavaScript description")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
}
