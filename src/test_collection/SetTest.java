package test_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	//List类型并带有Courses的泛型
	public List<Courses> coursesToSelect;
	
	public SetTest(){
//		初始化
		coursesToSelect = new ArrayList<Courses> ();
	}
	public void ListAdd(){
		//创建一个课程对象，并通过add方法，添加到备选课程list中
		Courses cr1 = new Courses("1","日语");
		coursesToSelect.add(cr1);
//		System.out.println("添加课程额");
		//通过get方法来提出添加的数据
		Courses temp =(Courses) coursesToSelect.get(0);
//		System.out.println("添加了课程："+temp.id+":"+temp.name);
		Courses cr2 =new Courses("2","java");
		coursesToSelect.add(cr2);
		//coursesToSelect.add(0, cr2); 这样的话cr2课程放在了第一位
		Courses temp1 =(Courses)coursesToSelect.get(1);
//		System.out.println("添加了课程："+temp1.id+":"+temp1.name);
		Courses cr3 =new Courses("3","C语言");
		coursesToSelect.add(cr3);
		Courses temp2 =(Courses) coursesToSelect.get(2);
//		System.out.println("添加了课程："+temp2.id+":"+temp2.name);
		/*Array.asList()是List类中定义的将数组转化为集合的方法，是固定的方法
		 * 使用addAll方法添加课程 （数组）
		 */
		 Courses[] course ={new Courses("4","高数"),new Courses("5","英语")};
		//将Course数组转化为集合
		coursesToSelect.addAll(Arrays.asList(course));
		Courses temp3 =(Courses) coursesToSelect.get(3);
		Courses temp4 =(Courses) coursesToSelect.get(4);
//		System.out.println("添加了两门课程："+temp3.id+":"+temp3.name+";"+temp4.id+":"+temp4.name);
		
	}
	/**
	 * for each 来遍历集合元素 
	 */
	public void testForEach(){//集合中的元素忽略原来的类型，只作为object
		System.out.println("课程如下待选(通过for each遍历):");
		for(Object obj:coursesToSelect){
			Courses cr =(Courses)obj;
			System.out.println("课程如下:"+cr.id+cr.name);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SetTest st = new SetTest();
        st.ListAdd();
        st.testForEach();
        //创建一个学生对象
        Student student= new Student("1","小明");
        System.out.println("欢迎学生:"+student.name+"选课！");
        //创建一个Scanner对象，来接受输入的课程Id
        Scanner console = new Scanner(System.in);
        
        for(int i =0; i<3;i++){
        	System.out.println("请输入课程id:");
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
//打印输出，所选的课程       循环Set中的元素，只能用 foreach 或 Iterator
        System.out.println("共选择了："+student.courses.size()+"门课程！");
//       Set中，添加某个对象，无论添加几次，最终只会保留一个该对象（的引用）
        for(Courses cr :student.courses){
        	System.out.println("选择了:"+cr.id+":"+cr.name);
        	
        }
	}

}
