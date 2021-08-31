package com.david.liveschedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.liveschedule.model.LiveDocument;

public interface LiveDocumentRepository  extends JpaRepository<LiveDocument, Long>{

}
