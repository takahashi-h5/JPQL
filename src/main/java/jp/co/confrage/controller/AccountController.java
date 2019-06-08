package jp.co.confrage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import jp.co.confrage.repository.AccountRepository;

@Controller
public class AccountController{

	@Autowired
	AccountRepository accountRepository;
	
	public void select() {
		List<String> ret = accountRepository.findCustom();
		for(String e: ret) {
			System.out.println(e);
		}
		
	}
}
