package kh.Army.vo;

import java.util.Scanner;

import kh.Army.vo.Post;
import kh.Army.vo.Associate;
import kh.Army.vo.Member;

public class ArmyMgr implements ArmyMgrInterface
{
    Scanner sc = new Scanner(System.in);
    
    Member[] m = new Member[10]; // 회원 가입 완료된 멤버
    
    int mIndex = 0;
    
    Member[] n = new Member[10]; // 회원 가입 신청을 넣은 사람들
    
    int nIndex = 0;
    
    Post [] post1 = new Post[10];
    Post [] post2 = new Post[10];
    Post [] post3 = new Post[10];
    int p1Index = 0;
    int p2Index = 0;
    int p3Index = 0;
    int [] myPost1Num = new int[10];
    int [] myPost2Num = new int[10];
    int [] myPost3Num = new int[10];
    
    int myIndex = -1; // 로그인 한 회원의 인덱스
    
   
    Member a = new Member();
    
    public ArmyMgr()
    {
        // String name, String grade, String phone, int age, string password, int point, int cheeringNum
        // int count
        // 준회원, 정회원, Army
        m[mIndex++] = new Associate("전정국", "준회원", "010-1111-1111", 23, "1234", 0, 0, 0);
        m[mIndex++] = new Regular("김태형", "정회원", "010-2222-2222", 25, "1234", 2, 6, 4);
        m[mIndex++] = new Associate("박지민", "준회원", "010-3333-3333", 25, "1234", 0, 0 ,0);
        m[mIndex++] = new Army("김석진", "Army", "010-4444-4444", 28, "1234", 5, 31, 10);
        m[mIndex++] = new Associate("김남준", "준회원", "010-5555-5555", 26, "1234", 0, 0, 0);
        
        post1[p1Index++] = new Post("안녕하세요", "반가워요!", "방시혁", 0);
        post2[p2Index++] = new Post("정회원으로 등급업했어요!", "와!", "김보아", 0);
        post3[p3Index++] = new Post("콘서트가실분!", "언제나 환영해요!", "김윤호", 0);
    }
    
    @Override
    public void start()
    {
        while (true)
        {
            System.out.println("\n===== BTS 팬카페 =====");
            System.out.println("1. 관리자");
            System.out.println("2. 회원");
            System.out.println("3. 회원가입");
            System.out.println("0. 종료");
            System.out.print("입력 : ");
            int sel = sc.nextInt();
            
            switch (sel)
            {
                case 1:
                    admin();
                    break;
                case 2:
                    member();
                    break;
                case 3:
                    apply();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    return;
                
            }
        }
        
    }
    
    @Override
    public void admin()
    {
        while (true)
        {
            System.out.println("\n===== 관리자 페이지 =====");
            System.out.println("1. 가입 승인");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 정보 삭제");
            System.out.println("0. 종료");
            System.out.print("입력 : ");
            int sel = sc.nextInt();
            
            switch (sel)
            {
                case 1:
                    memberInsert();
                    break;
                case 2:
                    System.out.println("\n===== 회원 조회 =====");
                    memberShow();
                    break;
                case 3:
                    memberUpdate();
                    break;
                case 4:
                    memberDelete();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    return;
                
            }
        }
        
    }
    
    @Override
    public void member()
    {
        
        boolean check = login();
        
        if (check)
        {
            while (true)
            {
                System.out
                        .println("\n1. 글쓰기 / 2. 전체 글 확인 / 3. 내 글 확인 / 4. 글 수정 / 5. 글 삭제 / 0. 로그아웃");
                System.out.print("번호 : ");
                int sel = sc.nextInt();
                switch (sel)
                {
                    case 1:
                        postWriting();
                        break;
                    case 2:
                        postShow();
                        break;
                    case 3:
                        showMyPost();
                        break;
                    case 4:
                        postEditng();
                        break;
                    case 5:
                        postDelete();
                        break;
                    
                    case 0:
                        logout();
                        return;
                }
            }
        }
        
    }
    
    @Override
    public void memberInsert()
    {
        
        System.out.println("\n===== 회원 가입 관리 =====");
        System.out.println("번호\t이름\t나이\t연락처");
        
        if(nIndex == 0)
        {
            return;
        }
        
        for (int i = 0; i < nIndex; i++)
        {
            System.out.println((i + 1) + "\t" + n[i].getName() + "\t"
                    + n[i].getAge() + "\t" + n[i].getPhone());
        }

        
        System.out.print("회원 번호를 입력해주세요 : ");
        int index = sc.nextInt() - 1;
        
        System.out.print(n[index].getName() + "회원의 가입을 승인하시겠습니까? (y/n): ");
        char sel = sc.next().charAt(0);
        
        if (sel == 'n')
        {
            System.out.println(n[index].getName() + "회원의 가입 신청을 거절하였습니다.");
            delete(n, index, nIndex--);
            return;
        }
        else
        {
            m[mIndex++] = n[index];
            
            delete(n, index, nIndex--);
            System.out.println("회원가입이 완료됐습니다.");
        }
    }
    
    @Override
    public void memberShow()
    {
        // String name, String grade, String phone, int age
        System.out.println("번호\t이름\t등급\t나이\t글 개수\t포인트\t응원수\t연락처");
        for (int i = 0; i < mIndex; i++)
        {
            System.out.println((i + 1) + "\t" + m[i].getName() + "\t"
                    + m[i].getGrade() + "\t" + m[i].getAge() + "\t" + m[i].getCount() + "\t" + m[i].getPoint() + "\t" + m[i].getCheeringNum() + 
                    "\t" + m[i].getPhone());
        }
    }
    
    @Override
    public void memberUpdate()
    {
        System.out.println("\n===== 회원 정보 수정 =====");
        
        memberShow();
        
        System.out.print("회원 번호를 입력해주세요 : ");
        int sel = sc.nextInt();
        
        System.out.print("수정할 이름 : ");
        String newName = sc.next();
        System.out.print("수정할 등급 : ");
        String grade = sc.next();
        System.out.print("수정할 나이 : ");
        int age = sc.nextInt();
        System.out.print("수정할 연락처 : ");
        String phone = sc.next();
        System.out.print("수정할 비밀번호 : ");
        String passwd = sc.next();
        
        switch (grade)
        {
            case "준회원":
                m[sel - 1] = new Associate(newName, grade, phone, age, passwd, m[sel - 1].getCount(), m[sel -1].getPoint(), m[sel -1].getCheeringNum());
                break;
            case "정회원":
                m[sel - 1] = new Regular(newName, grade, phone, age, passwd, m[sel - 1].getCount(), m[sel -1].getPoint(), m[sel -1].getCheeringNum());
                break;
            case "Army":
                m[sel - 1] = new Army(newName, grade, phone, age, passwd, m[sel - 1].getCount(), m[sel -1].getPoint(), m[sel -1].getCheeringNum());
                break;
            default:
                break;
        }
        
        System.out.println("회원 정보 수정이 완료되었습니다!");
        
    }
    
    public int search(String name)
    {
        for (int i = 0; i < mIndex; i++)
        {
            if (m[i].getName().equals(name)) { return i; }
        }
        return -1;
        
    }
    
    @Override
    public void memberDelete()
    {
        System.out.println("\n===== 회원 삭제 =====");
        
        memberShow();
        
        System.out.print("\n삭제할 회원의 번호를 적어주세요 : ");
        int sel = sc.nextInt();
    
        delete(m, sel-1, mIndex--);
        
        System.out.println("회원 삭제가 완료되었습니다!");
    
    
    }
    
    @Override
    public void apply()
    {
        System.out.println("\n===== 회원 가입 신청 =====");
        
        if (nIndex >= 10)
        {
            System.out.println("회원 가입 목록이 가득차서 신청이 불가능합니다.");
            return;
        }
        
        System.out.print("가입할 이름 : ");
        String name = sc.next();
        System.out.print("가입할 나이 : ");
        int age = sc.nextInt();
        System.out.print("가입할 연락처 : ");
        String phone = sc.next();
        System.out.print("가입할 비밀번호 : ");
        String passwd = sc.next();
        
        System.out.print("이대로 회원 가입 신청을 진행하시겠습니까? (y/n): ");
        char sel = sc.next().charAt(0);
        
        if (sel == 'n')
        {
            System.out.println("회원 가입 신청이 취소되었습니다.");
            return;
        }
        
        n[nIndex++] = new Associate(name, "준회원", phone, age, passwd, 0, 0, 0);
        
        System.out.println("회원 가입 신청이 완료되었습니다!");
    }
    
    public void delete(Member[] member, int searchIndex, int index)
    {
        for (int i = searchIndex; i < index - 1; i++)
        {
            member[i] = member[i + 1];
        }
        index--;
        member[index] = null;
        
    }
    
    @Override
    public boolean login()
    {
        // TODO Auto-generated method stub
        System.out.println("\n===== 로그인 =====");
        System.out.print("로그인할 이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("비밀번호를 입력하세요 : ");
        String passwd = sc.next();
        
        for (int i = 0; i < mIndex; i++)
        {
            if (name.equals(m[i].getName()) && passwd.equals(m[i].getPasswd()))
            {
                
                myIndex = i;
                
                System.out.println("로그인이 완료되었습니다.");
                return true;
            }
            
        }
        
        System.out.println("일치하는 회원 정보가 없습니다.");
        return false;
        
    }
    
    @Override
    public void logout()
    {
        // TODO Auto-generated method stub
        
        myIndex = -1;
        
        System.out.println("로그아웃 되었습니다.");
        
    }
    
    @Override
    public void postShow()
    {
        System.out.println("\n<<<<< 전체 글 조회 >>>>>");
        
        if(m[myIndex].getGrade().equals("준회원")) {
                showAssociate();
                
        }else if(((m[myIndex].getGrade().equals("정회원")))) {
                showAssociate();
                showRegular();
        }else if((m[myIndex].getGrade().equals("Army"))) {
                showAssociate();
                showRegular();
                showArmy();
        }
     
    }
    
    public void showAssociate() {
        System.out.println("준회원 게시판입니다.");
        System.out.println("----------------------");
        int postNum = 1;
        for(int i = 0; i < p1Index; i++) {
            System.out.println((postNum++)+"\t글쓴이 : "+post1[i].getName());
            System.out.println("\t제목 : "+post1[i].getTitle());
            System.out.println("\t본문 : "+post1[i].getMainText());
            System.out.println("----------------------------------------------");
        }
    }
    
    public void showRegular() {
        System.out.println("\n정회원 게시판입니다.");
        System.out.println("----------------------");
        int postNum = 1;
        for(int i = 0; i < p2Index; i++) {
            System.out.println((postNum++)+"\t글쓴이 : "+post2[i].getName());
            System.out.println("\t제목 : "+post2[i].getTitle());
            System.out.println("\t본문 : "+post2[i].getMainText());
            System.out.println("----------------------------------------------");
        }
    }
    
    public void showArmy() {
        System.out.println("\nArmy 게시판입니다.");
        System.out.println("----------------------");
        int postNum = 1;
        for(int i = 0; i < p3Index; i++) {
            System.out.println((postNum++)+"\t글쓴이 : "+post3[i].getName());
            System.out.println("\t제목 : "+post3[i].getTitle());
            System.out.println("\t본문 : "+post3[i].getMainText());
            System.out.println("----------------------------------------------");
        }
    }

    @Override
    public void postWriting()
    {
        System.out.println("\n<<<<< 글 쓰기 메뉴 >>>>>");
        String name = m[myIndex].getName();
        System.out.print("게시판을 선택하세요.(1. 준회원게시판 / 2. 정회원게시판 / 3. Army게시판) : ");
        int selPost = sc.nextInt();
        if(selPost == 1) {
                System.out.print("제목을 입력하세요 : ");
            String title = sc.next();
            System.out.print("글 내용을 입력해주세요(한 문장만 부탁드립니다^^) : ");
            String mainText = sc.next();
            post1[p1Index] = new Post(title, mainText, name, p1Index);
            p1Index++;
            System.out.println("글 작성이 완료되었습니다.");
            
            m[myIndex].countUp();
            
        }else if((selPost == 2) && ((m[myIndex].getGrade().equals("정회원")||(m[myIndex].getGrade().equals("Army"))))) {
                System.out.print("제목을 입력하세요 : ");
            String title = sc.next();
            System.out.print("글 내용을 입력해주세요(한 문장만 부탁드립니다^^) : ");
            String mainText = sc.next();
            post2[p2Index] = new Post(title, mainText, name, p2Index);
            p2Index++;
            System.out.println("글 작성이 완료되었습니다.");
            
            m[myIndex].countUp();
            
        }else if((selPost == 3) && m[myIndex].getGrade().equals("Army")) {
                System.out.print("제목을 입력하세요 : ");
            String title = sc.next();
            System.out.print("글 내용을 입력해주세요(한 문장만 부탁드립니다^^) : ");
            String mainText = sc.next();
            post3[p3Index] = new Post(title, mainText, name, p3Index);
            p3Index++;
            System.out.println("글 작성이 완료되었습니다.");
            
            m[myIndex].countUp();
        }
        
        if(m[myIndex].getCount() == 3)
        {
            m[myIndex] = new Army(m[myIndex].getName(), "Army", m[myIndex].getPhone(), m[myIndex].getAge(), m[myIndex].getPasswd(), m[myIndex].getCount(), m[myIndex].getPoint(), m[myIndex].getCheeringNum());
            System.out.println("\n축하합니다! Army 등급이 되셨습니다! d( ºㅁº )b");
        }
        else if(m[myIndex].getCount() == 2)
        {
            m[myIndex] = new Regular(m[myIndex].getName(), "정회원", m[myIndex].getPhone(), m[myIndex].getAge(), m[myIndex].getPasswd(), m[myIndex].getCount(), m[myIndex].getPoint(), m[myIndex].getCheeringNum());
            System.out.println("\n축하합니다! 정회원 등급이 되셨습니다! d( ºㅁº )b ");
        }
        

    }

    @Override
    public void showMyPost()
    {
        //회원 변수에 등급 이름 나이
        //이름으로 찾기
        System.out.println();
        String name = m[myIndex].getName();
        String mygrade = m[myIndex].getGrade();
       
        
        System.out.println(name+"님께서 작성하신 글 목록입니다.");
        
        if(mygrade.equals("준회원")) {
                showMyPost_Associate();
        }else if(mygrade.equals("정회원")) {
                showMyPost_Associate();
                showMyPost_Regular();
        }else if(mygrade.endsWith("Army")) {
                showMyPost_Associate();
                showMyPost_Regular();
                showMyPost_Army();
        }
    }
    
    public void showMyPost_Associate() {
        int post1Num = 1;
        System.out.println("준회원게시판-------------------------");
        for(int i = 0; i < p1Index; i++) {
            if(post1[i].getName().equals(m[myIndex].getName())) {
                    myPost1Num[post1Num-1] = i;
                    System.out.println((post1Num++)+".\t제목 : "+post1[i].getTitle());
                    System.out.println("\t본문 : "+post1[i].getMainText());
                    System.out.println("--------------------------------------");
            }
        }
    }
    
    public void showMyPost_Regular() {
        int post2Num = 1;
        System.out.println("정회원게시판-------------------------");
        for(int i = 0; i < p2Index; i++) {
            if(post2[i].getName().equals(m[myIndex].getName())) {
                    myPost2Num[post2Num-1] = i;
                    System.out.println((post2Num++)+".\t제목 : "+post2[i].getTitle());
                    System.out.println("\t본문 : "+post2[i].getMainText());
                    System.out.println("--------------------------------------");
            }
        }
    }
    
    public void showMyPost_Army() {
        int post3Num = 1;
        System.out.println("Army게시판-------------------------");
        for(int i = 0; i < p3Index; i++) {
            if(post3[i].getName().equals(m[myIndex].getName())) {
                    myPost3Num[post3Num-1] = i;
                    System.out.println((post3Num++)+".\t제목 : "+post3[i].getTitle());
                    System.out.println("\t본문 : "+post3[i].getMainText());
                    System.out.println("--------------------------------------");
            }
        }
    }

    @Override
    public void postEditng()
    {
        int num = 0;
        showMyPost();
        sc.nextLine();
        System.out.print("수정하실 글이 있는 게시판 명을 입력해주세요(준회원/정회원/Army) : ");
        String selPost = sc.next();
        if(selPost.equals("준회원")) {
                showMyPost_Associate();
                System.out.print("수정하실 글의 번호를 입력 : ");
            num = sc.nextInt();
            System.out.print("새로운 제목 입력 : ");
            String newTitle = sc.next();
            System.out.print("새로운 내용 입력 : ");
            String newMainText = sc.next();
            post1[myPost1Num[num-1]].setTitle(newTitle);
            post1[myPost1Num[num-1]].setMainText(newMainText);
            
            System.out.println("글 수정이 완료되었습니다.");
        }else if(selPost.equals("정회원")) {
                showMyPost_Associate();
                showMyPost_Regular();
                System.out.print("수정하실 글의 번호를 입력 : ");
            num = sc.nextInt();
            System.out.print("새로운 제목 입력 : ");
            String newTitle = sc.next();
            System.out.print("새로운 내용 입력 : ");
            String newMainText = sc.next();
            post2[myPost2Num[num-1]].setTitle(newTitle);
            post2[myPost2Num[num-1]].setMainText(newMainText);
            
            System.out.println("글 수정이 완료되었습니다.");
        }else if(selPost.equals("Army")){
                showMyPost_Associate();    
                showMyPost_Regular();
                showMyPost_Army();
                System.out.print("수정하실 글의 번호를 입력 : ");
            num = sc.nextInt();
            System.out.print("새로운 제목 입력 : ");
            String newTitle = sc.next();
            System.out.print("새로운 내용 입력 : ");
            String newMainText = sc.next();
            post3[myPost3Num[num-1]].setTitle(newTitle);
            post3[myPost3Num[num-1]].setMainText(newMainText);
            
            System.out.println("글 수정이 완료되었습니다.");
        }
      
    }

    @Override
    public void postDelete()
    {
        int num = 0;
        int tmp = 0;
        showMyPost();
        System.out.print("\n삭제할 글이 있는 게시판을 입력해주세요 (준회원/정회원/Army): ");
        String selPost = sc.next();
        if(selPost.equals("준회원")) {
                System.out.print("삭제하실 글의 번호를 입력 : ");
            num = sc.nextInt();
            tmp = myPost1Num[num-1];
                for(int i = tmp; i < p1Index-1; i++) {
                            post1[i] = post1[i+1];
                }
            post1[p1Index-1] = null;
            p1Index--;
            System.out.println("글이 삭제되었습니다.");
            
     
            
            
        }else if(selPost.equals("정회원")) {
                System.out.print("삭제하실 글의 번호를 입력 : ");
            num = sc.nextInt();
            tmp = myPost2Num[num-1];
                for(int i = tmp; i < p2Index-1; i++) {
                            post2[i] = post2[i+1];
                }
            post2[p2Index-1] = null;
            p2Index--;
            System.out.println("글이 삭제되었습니다.");
            
        }else if(selPost.equals("Army")) {
                System.out.print("삭제하실 글의 번호를 입력 : ");
            num = sc.nextInt();
            tmp = myPost3Num[num-1];
                for(int i = tmp; i < p3Index-1; i++) {
                            post3[i] = post3[i+1];
                }
            post3[p3Index-1] = null;
            p3Index--;
            System.out.println("글이 삭제되었습니다.");
        }
    }
    
}
