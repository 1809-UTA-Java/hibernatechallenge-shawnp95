package com.revature.model;

public class People {
	int userId;
	int accountId;
	String firstName;
	String lasName;
	String eMail;
	String userName;
	String passWord;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasName() {
		return lasName;
	}

	public void setLasName(String lasName) {
		this.lasName = lasName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public People(int userId, int accountId, String firstName, String lasName, String eMail, String userName,
			String passWord) {
		super();
		this.userId = userId;
		this.accountId = accountId;
		this.firstName = firstName;
		this.lasName = lasName;
		this.eMail = eMail;
		this.userName = userName;
		this.passWord = passWord;
	}

	public People() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "People [userId=" + userId + ", accountId=" + accountId + ", firstName=" + firstName + ", lasName="
				+ lasName + ", eMail=" + eMail + ", userName=" + userName + ", passWord=" + passWord + "]";
	}

}
