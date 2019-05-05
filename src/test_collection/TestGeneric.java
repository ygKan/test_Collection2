package test_collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	/**
	 * 带有泛型 -Courses，的List类型属性
	 */
	public List<Courses> course;
	public TestGeneric(){
		this.course =new ArrayList<Courses>();//实例化
	}
	
	/**
	 * 测试添加
	 * @param args
	 */
	public void testAdd(){
		Courses cr1 =new Courses("1","大学语文");
		course.add(cr1);
		Courses cr2 =new Courses("2","日文");
		course.add(cr2);
	}
	/**
	 * 测试循环遍历
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
