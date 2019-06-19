package org.zerock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Log4j
@ToString
@Service
@AllArgsConstructor
public class Restaurant {
	
	//@Setter( onMethod_ = @Autowired ) // setter 만드는 것과 같음
	private Chef chef;

//	public Restaurant(Chef chef) {
//		
//		this.chef = chef;
//	}

	public void order() {
		log.info(chef.cook());
	}

}
