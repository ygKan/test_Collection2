package test_collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 * @author YUGUO
 *
 */
public class Student {
	public String id;
	public String name;
	public Set<Courses> courses;//创建一个<Courses>泛型的Set类型的变量courses来存放选的课程
	
//	构造方法来初始化变量
	public Student(String id,String name){
		this.id =id;
		this.name =name;
		this.courses=new HashSet<Courses>();//通过hashSet对courses实例化
	}

}
