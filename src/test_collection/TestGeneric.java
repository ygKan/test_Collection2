package test_collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	/**
	 * ���з��� -Courses����List��������
	 */
	public List<Courses> course;
	public TestGeneric(){
		this.course =new ArrayList<Courses>();//ʵ����
	}
	
	/**
	 * �������
	 * @param args
	 */
	public void testAdd(){
		Courses cr1 =new Courses("1","��ѧ����");
		course.add(cr1);
		Courses cr2 =new Courses("2","����");
		course.add(cr2);
	}
	/**
	 * ����ѭ������
	 * @param args
	 */
	public void TestForEach(){
		for(Courses cr:course){
			System.out.println(cr.id+":"+cr.name);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric tg =new TestGeneric();
		tg.testAdd();
		tg.TestForEach();

	}

}
