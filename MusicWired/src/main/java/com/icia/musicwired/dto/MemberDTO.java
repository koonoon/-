package com.icia.musicwired.dto;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;




@Alias("member")
public class MemberDTO {

	private String mId;
	private String mPw;
	private String mName;
	private String mGender;
	private String mEmail;
	private int mSub;
	private int mSuber;
	private String message;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private MultipartFile mProfile;
	private String mProfileName;
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPw() {
		return mPw;
	}
	public void setmPw(String mPw) {
		this.mPw = mPw;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmGender() {
		return mGender;
	}
	public void setmGender(String mGender) {
		this.mGender = mGender;
	}
	public String getmEmail() {
		return mEmail;
	}
	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}
	public int getmSub() {
		return mSub;
	}
	public void setmSub(int mSub) {
		this.mSub = mSub;
	}
	public int getmSuber() {
		return mSuber;
	}
	public void setmSuber(int mSuber) {
		this.mSuber = mSuber;
	}
	public MultipartFile getmProfile() {
		return mProfile;
	}
	public void setmProfile(MultipartFile mProfile) {
		this.mProfile = mProfile;
	}
	public String getmProfileName() {
		return mProfileName;
	}
	public void setmProfileName(String mProfileName) {
		this.mProfileName = mProfileName;
	}
	@Override
	public String toString() {
		return "MemberDTO [mId=" + mId + ", mPw=" + mPw + ", mName=" + mName + ", mGender=" + mGender + ", mEmail="
				+ mEmail + ", mSub=" + mSub + ", mSuber=" + mSuber + ", mProfile=" + mProfile + ", mProfileName="
				+ mProfileName + "]";
	}
	
	
}
