package test_collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 1.通过Collenctions.sort()方法，对Integer泛型的list进行排序
 * 2.对String泛型的list排序
 * @author YUGUO
 *
 */
public class CollectionTest {
	//通过Collenctions.sort()方法，对Integer泛型的list排序
  public void testSort1(){
     	List<Integer> integerList=new ArrayList<Integer>();
     	//插入10个100以内的不重复的随机整数
     	Random random =new Random();
     	Integer k;
     	for(int i =0;i<10;i++){
     		do{
     			k=random.nextInt(100);
     		}while(integerList.contains(k));
     	    integerList.add(k) ;
     	    System.out.println("成功添加整数"+k);
     	}
     	System.out.println("------排序前-------");
     	for (Integer integer : integerList) {
			System.out.println(integer);
		}
     	Collections.sort(integerList);
        System.out.println("-------排序后----------");   	
        for (Integer integer : integerList) {
			System.out.println(integer);
		}
  }
//  对String泛型的list排序 
    public void testSort2(){
    	List<String> stringList = new ArrayList<String>();
    	stringList.add("四月");
    	stringList.add("七月");
    	stringList.add("三月");
    	System.out.println("----------排序前--------");
    	for (String string : stringList) {
			System.out.println(string);
		}
        System.out.println("----------排序后------------");
        Collections.shuffle(stringList);
        for (String string : stringList) {
			System.out.println(string);
		}
    }
    
    /*利用Collections.sort()方法对泛型为String的list进行排序：
     * 1.创建list<String>后，往其中添加十条随机的字符串
     * 2.每条字符串长度为10以内的随机整数
     * 每条字符串的每个字符为随机生成的字符，可重复
     * 
     */
    public void testSort3(){
    	List<String> stringList =new ArrayList<String>();
    	String se ="zxcvbnmasdfghjklqwertyuiop1234567890QWERTYUIOPASDFGHJKLZXCVBNM";
    	StringBuilder st =new StringBuilder();
    	Random random =new Random();
    	for(int i =0;i<10;i++){
    		do{
        	int b=random.nextInt(10)+1;
    		for(int j =0;j<b;j++){
    			//每条字符串的每个字符为随机生产的字符
    			int k =random.nextInt(se.length());
    			st.append(se.charAt(k));
    		}	
    		
    	  }while(stringList.contains(st));
    		
    	}
    	stringList.add(st.toString());
    	st.delete(0, st.length());
    	System.out.println("--------排序前------");
 	    for (String string : stringList) {
 	    	System.out.println("元素："+string+" ");
		}
  	    System.out.println("--------排序后------");
  	    //调用sour方法排序
  	    Collections.sort(stringList);
  	    for (String string : stringList) {
			System.out.print("元素："+string+" ");
		}
    }
    
   
    public void testSort4(){
    	List<Student>studentList= new ArrayList<Student>();
    	Random random =new Random();
    	studentList.add(new Student(random.nextInt(1000)+"","tanaka"));
    	studentList.add(new Student(random.nextInt(1000)+"","hanako"));
    	studentList.add(new Student(random.nextInt(1000)+"","ryouko"));
        for (Student student : studentList) {
			System.out.println("学生："+student.id+":"+student.name);
		}
        Collections.sort(studentList);
        System.out.println("=====排序后========");
        for (Student student : studentList) {
			System.out.println("学生："+student.id+":"+student.name);
		}
        System.out.println("------姓名排序-----------");
        Collections.sort(studentList, new StudentComparator() );
        for (Student student : studentList) {
			System.out.println("学生："+student.id+":"+student.name);
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionTest ct =new CollectionTest();
//		ct.testSort1();
//		ct.testSort2();
//		ct.testSort4();
		ct.testSort3();
    
	}

}
