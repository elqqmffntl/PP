package community;

/**
 * @date   : 2016. 6. 22. 
 * @author : 한상호
 * @file   : Community1.java
 * @story  : 
*/
/**
 * back:뒤로가기
 * contents:내용
 * simbol:심볼
 * communityBack:커뮤니티화면으로 이동
 * login:로그인
 * WorkRoom:워크룸
 * people:사람수
*/
public class CommunityBean {
private String back, contents, simbol,communityBack,login,workRoom,people;
	
public String getCommunityBack() {
		return communityBack;
	}

	public void setCommunityBack(String communityBack) {
		this.communityBack = communityBack;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

public String getWorkRoom() {
		return workRoom;
	}

	public void setWorkRoom(String workRoom) {
		this.workRoom = workRoom;
	}

public String getPeople() {
	return people;
}

public void setPeople(String people) {
	this.people = people;
}

public String getBack() {
	return back;
}

public void setBack(String back) {
	this.back = back;
}

public String getContents() {
	return contents;
}

public void setContents(String contents) {
	this.contents = contents;
}

public String getSimbol() {
	return simbol;
}

public void setSimbol(String simbol) {
	this.simbol = simbol;
}
}
