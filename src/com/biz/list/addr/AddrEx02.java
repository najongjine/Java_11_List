package com.biz.list.addr;

import com.biz.list.service.AddrService;
import com.biz.list.service.AddrServiceImpV2;

public class AddrEx02 {

	public static void main(String[] args) {
		AddrService addr1=new AddrServiceImpV2();
		
		addr1.input();
		addr1.view(0);
		addr1.list();
	}

}
