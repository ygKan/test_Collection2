package test_collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/**
 * 备选课程类
 * @author YUGUO
 *
 */
public class ListTest {
	//用于存放备选课程的list类型的变量
	public List coursesToSelect;
	public ListTest(){
		//	List的实现类ArrayList()来实例化coursesToSelect
		this.coursesToSelect = new ArrayList();
		
	}
	/**
	 * 用于往coursesToSelect中添加备选课程
	 */
	public void ListAdd(){
		//创建一个课程对象，并通过add方法，添加到备选课程list中
		Courses cr1 = new Courses("1","日语");
		coursesToSelect.add(cr1);
		System.out.println("添加课程额");
		//通过get方法来提出添加的数据
//		当数据放到集合时，忽略数据的类型，以object类型放入集合，取出时也是object类型，所以需要强转型
		Courses temp =(Courses) coursesToSelect.get(0);
		System.out.println("添加了课程："+temp.id+":"+temp.name);
		Courses cr2 =new Courses("2","java");
		coursesToSelect.add(cr2);
		//coursesToSelect.add(0, cr2); 这样的话cr2课程放在了第一位
		Courses temp1 =(Courses)coursesToSelect.get(1);
		System.out.println("添加了课程："+temp1.id+":"+temp1.name);
		Courses cr3 =new Courses("3","C语言");
		coursesToSelect.add(cr3);
		Courses temp2 =(Courses) coursesToSelect.get(2);
		System.out.println("添加了课程："+temp2.id+":"+temp2.name);
		/*Array.asList()是List类中定义的将数组转化为集合的方法，是固定的方法
		 * 使用addAll方法添加课程 （数组）
		 */
		 Courses[] course ={new Courses("4","高数"),new Courses("5","英语")};
		//将Course数组转化为集合
		coursesToSelect.addAll(Arrays.asList(course));
		Courses temp3 =(Courses) coursesToSelect.get(3);
		Courses temp4 =(Courses) coursesToSelect.get(4);
		System.out.println("添加了两门课程："+temp3.id+":"+temp3.name+";"+temp4.id+":"+temp4.name);
		
	}
	/**
	 * 取出list中的课程元素（循环体）
	 * @param args
	 */
	public void testGet(){
		int size =coursesToSelect.size();//定义一个长度的变量
	System.out.println("课程如下待选:");
		for(int i =0;i<size;i++){
		Courses	cr=(Courses) coursesToSelect.get(i);
		System.out.println("课程如下:"+cr.id+cr.name);
		}
	}
	/**
	 * 通过迭代器来遍历集合 (Iterator 本身就是个结口，没有存储原始的能力，
	 * 只有在集合下遍历元素
	 * 使用next()获取序列中德下一个元素
	 * 使用hasNext()判断下一个元素后是否有值
	 * 使用remove()将迭代器新返回的元素删除
	 * @param args
	 */
	public void testIterator(){
		Iterator it =coursesToSelect.iterator();
		System.out.println("课程如下待选(通过迭代器遍历):");
		while(it.hasNext()){
//			判断下一个元素后有值
			Courses cr =(Courses) it.next();//通过next()遍历整个序列
			System.out.println("课程如下:"+cr.id+cr.name);
		}
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
	/**
	 * 课程修改        set方法
	 * @param args
	 */
     public void testChange(){
    	 Courses cr =(Courses) coursesToSelect.set(3, new Courses("7","韩语"));
    	 System.out.println("课程如下:"+cr.id+cr.name);
    	 testForEach();
     }
     /**
      * 删除课程      remove()；removeAll()
      * @param args
      */
     public void testRemove(){
        /** Courses cr =(Courses) coursesToSelect.get(3);//删除单个元素
    	 System.out.println("即将删除的课程:"+cr.id+":"+cr.name);
    	 coursesToSelect.remove(cr);
//    	 coursesToSelect.remove(3);  可以直接传入索引位置来删除该位置的元素
    	  * 
    	  */
    	 //removeAll（）方法来删除数组(来储存需要删除的元素)
    	 Courses[] course ={(Courses) coursesToSelect.get(2),(Courses) coursesToSelect.get(3)};
    	 coursesToSelect.removeAll(Arrays.asList(course));//Arrayas.asList() 将数组转化为集合
    	 testForEach();
     }
     
	public static void main(String[] args){
		ListTest  lt =new ListTest();
		lt.ListAdd();
		lt.testGet();
		lt.testIterator();
		lt.testForEach();
		lt.testChange();
		lt.testRemove();
		
	}
	
}
