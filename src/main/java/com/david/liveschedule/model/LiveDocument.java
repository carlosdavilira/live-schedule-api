package com.david.liveschedule.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="live_document")
public class LiveDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull
    @Column(name="live_name")
    private String liveName;
    
    @NotNull
    @Column(name="channel_name")
    private String channelName;

    private LocalDateTime liveDate;
    private String liveLink;
    private LocalDateTime registrationDate;
    
    
    
    
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getLiveName() {
		return liveName;
	}
	
	public void setLiveName(String liveName) {
		this.liveName = liveName;
	}
	
	public String getChannelName() {
		return channelName;
	}
	
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	public LocalDateTime getLiveDate() {
		return liveDate;
	}
	
	public void setLiveDate(LocalDateTime liveDate) {
		this.liveDate = liveDate;
	}
	
	public String getLiveLink() {
		return liveLink;
	}
	
	public void setLiveLink(String liveLink) {
		this.liveLink = liveLink;
	}
	
	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}
	
	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LiveDocument other = (LiveDocument) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	



}
