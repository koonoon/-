package com.icia.musicwired.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dto.MemberDTO;
import com.icia.musicwired.service.MemberService;

@Controller
public class MemberController {

	private ModelAndView mav = new ModelAndView();
	
	@Autowired
	private MemberService msvc;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	// memberJoinForm
	@RequestMapping(value="/memberJoinForm", method=RequestMethod.GET)
	public String memberJoinForm() {
		return "Mem_JoinForm";
	}
	
	// memberJoin
	@RequestMapping(value="/memberJoin", method=RequestMethod.POST)
	public ModelAndView memberJoin(@ModelAttribute MemberDTO member) throws IllegalStateException, IOException {
		mav = msvc.memberJoin(member);
		return mav;
	}
	
	
	
	// memberLogin 
	@RequestMapping(value="/memberLogin", method=RequestMethod.GET)
	public String memberLogin() {
		return "Mem_Login";
	}
	
	// memLogin
	@RequestMapping(value="/memLogin", method=RequestMethod.POST)
	public ModelAndView memLogin(@ModelAttribute MemberDTO member) {
		mav = msvc.memLogin(member);
		return mav;
	}
	 
	// checkId
	@RequestMapping(value = "/checkId", method = RequestMethod.POST)
	public @ResponseBody String checkId(@RequestParam("mId")String mId) {
		
		String msg = msvc.checkId(mId);
		
		return msg;
	}
	
	// memberViewMe
	@RequestMapping(value = "/memberViewMe", method=RequestMethod.GET)
	public String memberViewMe() {
		
		return "Mem_ViewMe";
	}
	
	// memberLogout
	@RequestMapping(value= "/memberLogout", method = RequestMethod.GET)
	public String memberLogout() {
		session.invalidate();
		return "index";
	}
	
	// memberModiForm
	@RequestMapping(value="/memberModiForm", method=RequestMethod.GET)
	public ModelAndView memberModiForm(@RequestParam("mId")String mId) {
		mav = msvc.memberModiForm(mId);
		return mav;
	}
	
	// memberModify
	@RequestMapping(value="/memberModify", method=RequestMethod.POST)
	public ModelAndView memberModify(@ModelAttribute MemberDTO member) throws IllegalStateException, IOException {
		mav = msvc.memberModify(member);
		return mav;
	}
	
	// memberDelete
	@RequestMapping(value="/memberDelete", method=RequestMethod.GET)
	public ModelAndView memberDelete(@RequestParam("mId") String mId) {
		System.out.println(mId);
		mav = msvc.memberDelete(mId);
		return mav;
	}
	
	// memberList
	@RequestMapping(value="/memberList", method=RequestMethod.GET)
	public ModelAndView memberList() {
		mav = msvc.memberList();
		return mav;
	}
	
	// memberView
	@RequestMapping(value="/memberView", method=RequestMethod.GET)
	public ModelAndView memberView(@RequestParam("mId") String mId) {
		mav = msvc.memberView(mId);
		return mav;
	}
}
