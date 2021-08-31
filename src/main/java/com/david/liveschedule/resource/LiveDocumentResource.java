package com.david.liveschedule.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.liveschedule.model.LiveDocument;
import com.david.liveschedule.repository.LiveDocumentRepository;

@RestController
@RequestMapping("/live_document")
public class LiveDocumentResource {
	
	@Autowired
	private LiveDocumentRepository liveDocumentRepository;
	
	
	@CrossOrigin(maxAge= 10, origins = {"*"})
	@GetMapping
	public List<LiveDocument> list(){
		return this.liveDocumentRepository.findAll();
	}

}
