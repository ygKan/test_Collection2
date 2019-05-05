package test_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	//List���Ͳ�����Courses�ķ���
	public List<Courses> coursesToSelect;
	
	public SetTest(){
//		��ʼ��
		coursesToSelect = new ArrayList<Courses> ();
	}
	public void ListAdd(){
		//����һ���γ̶��󣬲�ͨ��add��������ӵ���ѡ�γ�list��
		Courses cr1 = new Courses("1","����");
		coursesToSelect.add(cr1);
//		System.out.println("��ӿγ̶�");
		//ͨ��get�����������ӵ�����
		Courses temp =(Courses) coursesToSelect.get(0);
//		System.out.println("����˿γ̣�"+temp.id+":"+temp.name);
		Courses cr2 =new Courses("2","java");
		coursesToSelect.add(cr2);
		//coursesToSelect.add(0, cr2); �����Ļ�cr2�γ̷����˵�һλ
		Courses temp1 =(Courses)coursesToSelect.get(1);
//		System.out.println("����˿γ̣�"+temp1.id+":"+temp1.name);
		Courses cr3 =new Courses("3","C����");
		coursesToSelect.add(cr3);
		Courses temp2 =(Courses) coursesToSelect.get(2);
//		System.out.println("����˿γ̣�"+temp2.id+":"+temp2.name);
		/*Array.asList()��List���ж���Ľ�����ת��Ϊ���ϵķ������ǹ̶��ķ���
		 * ʹ��addAll������ӿγ� �����飩
		 */
		 Courses[] course ={new Courses("4","����"),new Courses("5","Ӣ��")};
		//��Course����ת��Ϊ����
		coursesToSelect.addAll(Arrays.asList(course));
		Courses temp3 =(Courses) coursesToSelect.get(3);
		Courses temp4 =(Courses) coursesToSelect.get(4);
//		System.out.println("��������ſγ̣�"+temp3.id+":"+temp3.name+";"+temp4.id+":"+temp4.name);
		
	}
	/**
	 * for each ����������Ԫ�� 
	 */
	public void testForEach(){//�����е�Ԫ�غ���ԭ�������ͣ�ֻ��Ϊobject
		System.out.println("�γ����´�ѡ(ͨ��for each����):");
		for(Object obj:coursesToSelect){
			Courses cr =(Courses)obj;
			System.out.println("�γ�����:"+cr.id+cr.name);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SetTest st = new SetTest();
        st.ListAdd();
        st.testForEach();
        //����һ��ѧ������
        Student student= new Student("1","С��");
        System.out.println("��ӭѧ��:"+student.name+"ѡ�Σ�");
        //����һ��Scanner��������������Ŀγ�Id
        Scanner console = new Scanner(System.in);
        
        for(int i =0; i<3;i++){
        	System.out.println("������γ�id:");
        	String courseId = console.next();
        	for(Courses cr :st.coursesToSelect){
        		if(cr.id.equals(courseId)){
        			student.courses.add(cr);
        			
        		}
        	}
        }
       
        st.testForEachForSet(student);
	}
	public void testForEachForSet(Student student){
//��ӡ�������ѡ�Ŀγ�       ѭ��Set�е�Ԫ�أ�ֻ���� foreach �� Iterator
        System.out.println("��ѡ���ˣ�"+student.courses.size()+"�ſγ̣�");
//       Set�У����ĳ������������Ӽ��Σ�����ֻ�ᱣ��һ���ö��󣨵����ã�
        for(Courses cr :student.courses){
        	System.out.println("ѡ����:"+cr.id+":"+cr.name);
        	
        }
	}

}
