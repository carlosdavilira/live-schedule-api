package com.david.liveschedule.resource;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Sort;

import com.david.liveschedule.model.LiveDocument;
import com.david.liveschedule.repository.LiveDocumentRepository;


@RestController
@RequestMapping("/live_document")
@CrossOrigin(origins = "*")
public class LiveDocumentResource {
	
	@Autowired
	private LiveDocumentRepository liveDocumentRepository;
	
	
	@CrossOrigin(maxAge= 10, origins = {"*"})
	@GetMapping
	public ResponseEntity<Page<LiveDocument>> getLives(
			@PageableDefault(page = 0, size = 15, sort = "id", direction = Sort.Direction.DESC) 
			Pageable pagebale, 
			@RequestParam(required = false) String flag){
		
		Page<LiveDocument> livePage =  this.liveDocumentRepository.findAll(pagebale);
		
		if(livePage.isEmpty()) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<Page<LiveDocument>>(livePage, HttpStatus.OK);
		}
	}
	
	@CrossOrigin(maxAge= 10, origins = {"*"})
	@PostMapping
	public ResponseEntity<LiveDocument> saveLive(@RequestBody @Valid LiveDocument live){
		live.setRegistrationDate(LocalDateTime.now());
		return new ResponseEntity<LiveDocument>(this.liveDocumentRepository.save(live), HttpStatus.CREATED);
	}

}
