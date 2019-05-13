package test_collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 1.ͨ��Collenctions.sort()��������Integer���͵�list��������
 * 2.��String���͵�list����
 * @author YUGUO
 *
 */
public class CollectionTest {
	//ͨ��Collenctions.sort()��������Integer���͵�list����
  public void testSort1(){
     	List<Integer> integerList=new ArrayList<Integer>();
     	//����10��100���ڵĲ��ظ����������
     	Random random =new Random();
     	Integer k;
     	for(int i =0;i<10;i++){
     		do{
     			k=random.nextInt(100);
     		}while(integerList.contains(k));
     	    integerList.add(k) ;
     	    System.out.println("�ɹ��������"+k);
     	}
     	System.out.println("------����ǰ-------");
     	for (Integer integer : integerList) {
			System.out.println(integer);
		}
     	Collections.sort(integerList);
        System.out.println("-------�����----------");   	
        for (Integer integer : integerList) {
			System.out.println(integer);
		}
  }
//  ��String���͵�list���� 
    public void testSort2(){
    	List<String> stringList = new ArrayList<String>();
    	stringList.add("����");
    	stringList.add("����");
    	stringList.add("����");
    	System.out.println("----------����ǰ--------");
    	for (String string : stringList) {
			System.out.println(string);
		}
        System.out.println("----------�����------------");
        Collections.shuffle(stringList);
        for (String string : stringList) {
			System.out.println(string);
		}
    }
    
    /*����Collections.sort()�����Է���ΪString��list��������
     * 1.����list<String>�����������ʮ��������ַ���
     * 2.ÿ���ַ�������Ϊ10���ڵ��������
     * ÿ���ַ�����ÿ���ַ�Ϊ������ɵ��ַ������ظ�
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
    			//ÿ���ַ�����ÿ���ַ�Ϊ����������ַ�
    			int k =random.nextInt(se.length());
    			st.append(se.charAt(k));
    		}	
    		
    	  }while(stringList.contains(st));
    		
    	}
    	stringList.add(st.toString());
    	st.delete(0, st.length());
    	System.out.println("--------����ǰ------");
 	    for (String string : stringList) {
 	    	System.out.println("Ԫ�أ�"+string+" ");
		}
  	    System.out.println("--------�����------");
  	    //����sour��������
  	    Collections.sort(stringList);
  	    for (String string : stringList) {
			System.out.print("Ԫ�أ�"+string+" ");
		}
    }
    
   
    public void testSort4(){
    	List<Student>studentList= new ArrayList<Student>();
    	Random random =new Random();
    	studentList.add(new Student(random.nextInt(1000)+"","tanaka"));
    	studentList.add(new Student(random.nextInt(1000)+"","hanako"));
    	studentList.add(new Student(random.nextInt(1000)+"","ryouko"));
        for (Student student : studentList) {
			System.out.println("ѧ����"+student.id+":"+student.name);
		}
        Collections.sort(studentList);
        System.out.println("=====�����========");
        for (Student student : studentList) {
			System.out.println("ѧ����"+student.id+":"+student.name);
		}
        System.out.println("------��������-----------");
        Collections.sort(studentList, new StudentComparator() );
        for (Student student : studentList) {
			System.out.println("ѧ����"+student.id+":"+student.name);
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
