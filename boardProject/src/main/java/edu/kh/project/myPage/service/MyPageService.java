package edu.kh.project.myPage.service;

import edu.kh.project.member.dto.Member;

public interface MyPageService {

	/** 회원 정보 수정
	 * @param inputMember
	 * @return result
	 */
	int updateInfo(Member inputMember);

	/** 닉네임 중복 검사
	 * @param input
	 * @return result
	 */
	int checkNickname(String input);

	/** 비밀번호 변경
	 * @param currentPw
	 * @param newPw
	 * @param loginMember
	 * @return result
	 */
	int changePw(String currentPw, String newPw, Member loginMember);

	/** 회원 탈퇴 수행
	 * @param memberPw
	 * @param loginMember
	 * @return result
	 */
	int secession(String memberPw, Member loginMember);

}
