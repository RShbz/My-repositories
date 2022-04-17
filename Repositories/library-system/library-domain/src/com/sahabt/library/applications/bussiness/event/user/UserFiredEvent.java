package com.sahabt.library.applications.bussiness.event.user;

import com.sahabt.library.domain.user.IdentityNo;
import com.sahabt.library.domain.user.User;

public class UserFiredEvent extends UserEvent {
	private final User user ;
	
	public UserFiredEvent(User user) {
		super(user.getIdentityNo());
		this.user=user;
		
	}


	public User getUser() {
		
		return this.user;
	}	
}
