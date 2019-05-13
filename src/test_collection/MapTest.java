package test_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * 通过Map进行学生信息管理，key是学生id，value是学生对象
 * 对集合中的学生进行增、删、改、查
 * @author YUGUO
 *
 */
public class MapTest {
	
	/**
	 * 创建一个Map类型的用来承装学生类型的对象
	 * @param args
	 */
  public Map<String,Student>students;
  /**
   * 在构造器中初始化student属性
   */
  public MapTest(){
	  this.students=new HashMap<String,Student>();
	  
  }
  /**
   * 测试添加：输入学生id，判断是否被占用
   * 若没有，则输入姓名，创建新的学生对象并且添加到students中
   * Map用put方法添加
   * @param args
   */
  public void testPut(){
	  //创建一个Scanner对象，来接收输入的id和姓名
	  Scanner input =new Scanner(System.in);
	  int i =0;
	  while(i <3){//可输入三名学生id
		  System.out.println("请输入学生ID：");
		  String ID =input.next();
		  //判断id是否被占用
		  Student st =students.get(ID);//元素的Get方法可以得到对应的对象
		  if(st==null){
			  //提示输入学生姓名
			  System.out.println("请输入学生姓名：");
			  String name =input.next();
			  //创建新的学生的对象
			  Student newstudent =new Student(ID,name);
			  //通过调用students的put方法添加ID-学生映射
			  students.put(ID, newstudent);
			  System.out.println("成功添加学生："+students.get(ID).name);
		      i++;
		  }else{
			  System.out.println("该ID已被占用");
			  continue;
		  }
	  }
	  
  }
  /**
   * 测试keySet方法
   */
  public void testKeySet(){
	  //通过keyset方法返回Map中所有的key的set集合
	 Set<String> keySet =students.keySet();
	 //输出学生的量
	 System.out.println("共添加了："+students.size()+"位学生");
	 //遍历keyset，取得每一个键，在调用get方法取得每一个key对应的value
	 for(String stuId: keySet ){
		 Student st =students.get(stuId);
		 if(st!= null){
			 System.out.println("学生："+st.name);
			 
		 }
	 }
  }
  /**
   * 测试删除      remove（）方法
   * @param args
   */
  public void testRemove(){
	
	 //获取ID
	  Scanner input=new Scanner(System.in);
	  while(true){//死循环
		//通过id删除所对应的vulae值，提示输入id
	      System.out.println("请输入待删除的学生ID：");  
	      String ID =input.next();
	  //判断该ID是否有对应的学生对象
	      Student st =students.get(ID);
	      if(st==null){
		  System.out.println("输入ID有误，请重新输入：");
          continue;		  
	     }
	      students.remove(ID);
	      System.out.println("成功删除学生："+st.name);
	      break;
	}
	 
  }
  /**
   * entrySet方法遍历Map
   * @param args
   */
  public void testEntrySet(){
	  //通过entrySet方法，返回Map中的所有键值对
	  Set<Entry<String,Student>> entrySet =students.entrySet();
      for (Entry<String, Student> entry : entrySet) {
   	  System.out.println("取得键："+entry.getKey());
    	  System.out.println("对应的值为："+entry.getValue().name);
		
	}
  }
  
  /**
   * 使用Map的put()进行对象的修改
   * @param args
   */
  public void testModify(){
	  //提示输入想修改的对象所对应的ID
	  System.out.println("请输入待修改的对象ID：");
	  //创建一个scanner对象来接受
	  Scanner input =new Scanner(System.in);
	  //
	  while(true){
	  //取得从键盘输入的学生id
	     String stuID= input.next();
	  //从students中查找该学生的id对应的学生对象
	     Student stu =students.get(stuID);
	     if(stu == null){
		     System.out.println("输入的ID不存在，请重新输入：");
		     continue;
	  }
	  //提示当前所对应的学生对应的姓名
	     System.out.println("当前所对应的学生对应的姓名:"+stu.name);
	  //提示输入新的学生姓名，来修改原有的映射
	     System.out.println("请输入新的学生姓名：");
	     String name = input.next();
	     //创建一个新的学生对象，来用于修改原来的对象值
	      Student newStudent =new Student(stuID,name);//ID不变，姓名修改
	      students.put(stuID, newStudent);
	      System.out.println("修改成功！");
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
