package kh.Army.vo;

public interface ArmyMgrInterface
{
    
    // 시작
    public void start();
    public void admin();        // 관리자
    public void member();       // 회원
    
    
    // 관리자
    public void memberInsert(); // 회원 가입 승인
    public void memberShow();   // 회원 조회
    public void memberUpdate(); // 회원 정보 수정
    public void memberDelete(); // 회원 삭제
    
    // 회원가입
    public void apply();        // 회원 가입 신청
    
    // 회원
    public boolean login();        // 로그인
    public void logout();       // 로그아웃
    
    public void postShow();     // 글 전체 조회
    
    //이름, 회원 번호
    public void postWriting();  // 내 글 쓰기
    public void showMyPost();   // 내 글 조회
    public void postEditng();   // 내 글 수정
    public void postDelete();   // 내 글 삭제
    

    
}
