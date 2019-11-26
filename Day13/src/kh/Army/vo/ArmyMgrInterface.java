package kh.Army.vo;

public interface ArmyMgrInterface
{
    
    // ����
    public void start();
    public void admin();        // ������
    public void member();       // ȸ��
    
    
    // ������
    public void memberInsert(); // ȸ�� ���� ����
    public void memberShow();   // ȸ�� ��ȸ
    public void memberUpdate(); // ȸ�� ���� ����
    public void memberDelete(); // ȸ�� ����
    
    // ȸ������
    public void apply();        // ȸ�� ���� ��û
    
    // ȸ��
    public boolean login();        // �α���
    public void logout();       // �α׾ƿ�
    
    public void postShow();     // �� ��ü ��ȸ
    
    //�̸�, ȸ�� ��ȣ
    public void postWriting();  // �� �� ����
    public void showMyPost();   // �� �� ��ȸ
    public void postEditng();   // �� �� ����
    public void postDelete();   // �� �� ����
    

    
}
