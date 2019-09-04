package com.biz.list.addr;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.AddrVO;

public class AddrEx01 {

	public static void main(String[] args) {
		List<AddrVO> addrList=new ArrayList<AddrVO>();
		
		AddrVO aVO=new AddrVO();
		
		aVO.setStrAddr("11aaa11 adw2");
		aVO.setStrEmail("gdgesg@ggg.vom");
		aVO.setStrName("aaa");
		aVO.setStrTel("111-1111-1111");
		
		addrList.add(aVO);
		
		aVO=new AddrVO();
		aVO.setStrAddr("22aaa11 adw2");
		aVO.setStrEmail("g111sg@bbbb.vom");
		aVO.setStrName("bbb");
		aVO.setStrTel("222-2222-2222");
		addrList.add(aVO);
		
		//aVO=new AddrVO();
		aVO.setStrAddr("33aaa11 adw333");
		aVO.setStrEmail("g222sg@ccc.vom");
		aVO.setStrName("ccc");
		aVO.setStrTel("333-3333-3333");
		addrList.add(aVO);
		
		System.out.println("--------------------------------");
		System.out.println("주소록");
		System.out.println("---------------------------------");
		System.out.println("이름\t전화\t\t주소\t\t이메일");
		System.out.println("----------------------------------");
		int nSize=addrList.size();
		for(int i=0; i<nSize; i++) {
			System.out.printf("%s\t%10s\t%10s\t%10s\n",addrList.get(i).getStrName(),addrList.get(i).getStrTel(),
					addrList.get(i).getStrAddr(),addrList.get(i).getStrEmail());
		}
		
		for(AddrVO vo:addrList) {
			System.out.printf("%s\t",vo.getStrName());
			System.out.printf("%s\t",vo.getStrTel());
			System.out.printf("%s\t",vo.getStrAddr());
			System.out.printf("%s\n",vo.getStrEmail());
		}
		System.out.println("---------------------------------------");
	}

}
