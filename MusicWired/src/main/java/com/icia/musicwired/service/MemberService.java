package com.icia.musicwired.service;

import java.io.IOException;

import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dto.MemberDTO;

public interface MemberService {

	ModelAndView memberJoin(MemberDTO member) throws IllegalStateException, IOException;

	ModelAndView memLogin(MemberDTO member);

	String checkId(String mId);

	ModelAndView memberView(String mId);

	ModelAndView memberModiForm(String mId);

	ModelAndView memberModify(MemberDTO member) throws IllegalStateException, IOException;

	ModelAndView memberDelete(String mId);

	ModelAndView memberList();

}
