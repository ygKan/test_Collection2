package test_collection;

import java.util.HashSet;
import java.util.Set;

/**
 * ѧ����
 * @author YUGUO
 *
 */
public class Student {
	public String id;
	public String name;
	public Set<Courses> courses;//����һ��<Courses>���͵�Set���͵ı���courses�����ѡ�Ŀγ�
	
//	���췽������ʼ������
	public Student(String id,String name){
		this.id =id;
		this.name =name;
		this.courses=new HashSet<Courses>();//ͨ��hashSet��coursesʵ����
	}

}
