package test_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * ͨ��Map����ѧ����Ϣ����key��ѧ��id��value��ѧ������
 * �Լ����е�ѧ����������ɾ���ġ���
 * @author YUGUO
 *
 */
public class MapTest {
	
	/**
	 * ����һ��Map���͵�������װѧ�����͵Ķ���
	 * @param args
	 */
  public Map<String,Student>students;
  /**
   * �ڹ������г�ʼ��student����
   */
  public MapTest(){
	  this.students=new HashMap<String,Student>();
	  
  }
  /**
   * ������ӣ�����ѧ��id���ж��Ƿ�ռ��
   * ��û�У������������������µ�ѧ����������ӵ�students��
   * Map��put�������
   * @param args
   */
  public void testPut(){
	  //����һ��Scanner���������������id������
	  Scanner input =new Scanner(System.in);
	  int i =0;
	  while(i <3){//����������ѧ��id
		  System.out.println("������ѧ��ID��");
		  String ID =input.next();
		  //�ж�id�Ƿ�ռ��
		  Student st =students.get(ID);//Ԫ�ص�Get�������Եõ���Ӧ�Ķ���
		  if(st==null){
			  //��ʾ����ѧ������
			  System.out.println("������ѧ��������");
			  String name =input.next();
			  //�����µ�ѧ���Ķ���
			  Student newstudent =new Student(ID,name);
			  //ͨ������students��put�������ID-ѧ��ӳ��
			  students.put(ID, newstudent);
			  System.out.println("�ɹ����ѧ����"+students.get(ID).name);
		      i++;
		  }else{
			  System.out.println("��ID�ѱ�ռ��");
			  continue;
		  }
	  }
	  
  }
  /**
   * ����keySet����
   */
  public void testKeySet(){
	  //ͨ��keyset��������Map�����е�key��set����
	 Set<String> keySet =students.keySet();
	 //���ѧ������
	 System.out.println("������ˣ�"+students.size()+"λѧ��");
	 //����keyset��ȡ��ÿһ�������ڵ���get����ȡ��ÿһ��key��Ӧ��value
	 for(String stuId: keySet ){
		 Student st =students.get(stuId);
		 if(st!= null){
			 System.out.println("ѧ����"+st.name);
			 
		 }
	 }
  }
  /**
   * ����ɾ��      remove��������
   * @param args
   */
  public void testRemove(){
	
	 //��ȡID
	  Scanner input=new Scanner(System.in);
	  while(true){//��ѭ��
		//ͨ��idɾ������Ӧ��vulaeֵ����ʾ����id
	      System.out.println("�������ɾ����ѧ��ID��");  
	      String ID =input.next();
	  //�жϸ�ID�Ƿ��ж�Ӧ��ѧ������
	      Student st =students.get(ID);
	      if(st==null){
		  System.out.println("����ID�������������룺");
          continue;		  
	     }
	      students.remove(ID);
	      System.out.println("�ɹ�ɾ��ѧ����"+st.name);
	      break;
	}
	 
  }
  /**
   * entrySet��������Map
   * @param args
   */
  public void testEntrySet(){
	  //ͨ��entrySet����������Map�е����м�ֵ��
	  Set<Entry<String,Student>> entrySet =students.entrySet();
      for (Entry<String, Student> entry : entrySet) {
   	  System.out.println("ȡ�ü���"+entry.getKey());
    	  System.out.println("��Ӧ��ֵΪ��"+entry.getValue().name);
		
	}
  }
  
  /**
   * ʹ��Map��put()���ж�����޸�
   * @param args
   */
  public void testModify(){
	  //��ʾ�������޸ĵĶ�������Ӧ��ID
	  System.out.println("��������޸ĵĶ���ID��");
	  //����һ��scanner����������
	  Scanner input =new Scanner(System.in);
	  //
	  while(true){
	  //ȡ�ôӼ��������ѧ��id
	     String stuID= input.next();
	  //��students�в��Ҹ�ѧ����id��Ӧ��ѧ������
	     Student stu =students.get(stuID);
	     if(stu == null){
		     System.out.println("�����ID�����ڣ����������룺");
		     continue;
	  }
	  //��ʾ��ǰ����Ӧ��ѧ����Ӧ������
	     System.out.println("��ǰ����Ӧ��ѧ����Ӧ������:"+stu.name);
	  //��ʾ�����µ�ѧ�����������޸�ԭ�е�ӳ��
	     System.out.println("�������µ�ѧ��������");
	     String name = input.next();
	     //����һ���µ�ѧ�������������޸�ԭ���Ķ���ֵ
	      Student newStudent =new Student(stuID,name);//ID���䣬�����޸�
	      students.put(stuID, newStudent);
	      System.out.println("�޸ĳɹ���");
	      break;
	  }  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt =new MapTest();
		mt.testPut();
		mt.testKeySet();
//        mt.testRemove();
//        mt.testEntrySet();
		mt.testModify();
		mt.testEntrySet(); 
	}

}
