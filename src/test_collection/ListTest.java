package test_collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/**
 * ��ѡ�γ���
 * @author YUGUO
 *
 */
public class ListTest {
	//���ڴ�ű�ѡ�γ̵�list���͵ı���
	public List coursesToSelect;
	public ListTest(){
		//	List��ʵ����ArrayList()��ʵ����coursesToSelect
		this.coursesToSelect = new ArrayList();
		
	}
	/**
	 * ������coursesToSelect����ӱ�ѡ�γ�
	 */
	public void ListAdd(){
		//����һ���γ̶��󣬲�ͨ��add��������ӵ���ѡ�γ�list��
		Courses cr1 = new Courses("1","����");
		coursesToSelect.add(cr1);
		System.out.println("��ӿγ̶�");
		//ͨ��get�����������ӵ�����
//		�����ݷŵ�����ʱ���������ݵ����ͣ���object���ͷ��뼯�ϣ�ȡ��ʱҲ��object���ͣ�������Ҫǿת��
		Courses temp =(Courses) coursesToSelect.get(0);
		System.out.println("����˿γ̣�"+temp.id+":"+temp.name);
		Courses cr2 =new Courses("2","java");
		coursesToSelect.add(cr2);
		//coursesToSelect.add(0, cr2); �����Ļ�cr2�γ̷����˵�һλ
		Courses temp1 =(Courses)coursesToSelect.get(1);
		System.out.println("����˿γ̣�"+temp1.id+":"+temp1.name);
		Courses cr3 =new Courses("3","C����");
		coursesToSelect.add(cr3);
		Courses temp2 =(Courses) coursesToSelect.get(2);
		System.out.println("����˿γ̣�"+temp2.id+":"+temp2.name);
		/*Array.asList()��List���ж���Ľ�����ת��Ϊ���ϵķ������ǹ̶��ķ���
		 * ʹ��addAll������ӿγ� �����飩
		 */
		 Courses[] course ={new Courses("4","����"),new Courses("5","Ӣ��")};
		//��Course����ת��Ϊ����
		coursesToSelect.addAll(Arrays.asList(course));
		Courses temp3 =(Courses) coursesToSelect.get(3);
		Courses temp4 =(Courses) coursesToSelect.get(4);
		System.out.println("��������ſγ̣�"+temp3.id+":"+temp3.name+";"+temp4.id+":"+temp4.name);
		
	}
	/**
	 * ȡ��list�еĿγ�Ԫ�أ�ѭ���壩
	 * @param args
	 */
	public void testGet(){
		int size =coursesToSelect.size();//����һ�����ȵı���
	System.out.println("�γ����´�ѡ:");
		for(int i =0;i<size;i++){
		Courses	cr=(Courses) coursesToSelect.get(i);
		System.out.println("�γ�����:"+cr.id+cr.name);
		}
	}
	/**
	 * ͨ������������������ (Iterator ������Ǹ���ڣ�û�д洢ԭʼ��������
	 * ֻ���ڼ����±���Ԫ��
	 * ʹ��next()��ȡ�����е���һ��Ԫ��
	 * ʹ��hasNext()�ж���һ��Ԫ�غ��Ƿ���ֵ
	 * ʹ��remove()���������·��ص�Ԫ��ɾ��
	 * @param args
	 */
	public void testIterator(){
		Iterator it =coursesToSelect.iterator();
		System.out.println("�γ����´�ѡ(ͨ������������):");
		while(it.hasNext()){
//			�ж���һ��Ԫ�غ���ֵ
			Courses cr =(Courses) it.next();//ͨ��next()������������
			System.out.println("�γ�����:"+cr.id+cr.name);
		}
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
	/**
	 * �γ��޸�        set����
	 * @param args
	 */
     public void testChange(){
    	 Courses cr =(Courses) coursesToSelect.set(3, new Courses("7","����"));
    	 System.out.println("�γ�����:"+cr.id+cr.name);
    	 testForEach();
     }
     /**
      * ɾ���γ�      remove()��removeAll()
      * @param args
      */
     public void testRemove(){
        /** Courses cr =(Courses) coursesToSelect.get(3);//ɾ������Ԫ��
    	 System.out.println("����ɾ���Ŀγ�:"+cr.id+":"+cr.name);
    	 coursesToSelect.remove(cr);
//    	 coursesToSelect.remove(3);  ����ֱ�Ӵ�������λ����ɾ����λ�õ�Ԫ��
    	  * 
    	  */
    	 //removeAll����������ɾ������(��������Ҫɾ����Ԫ��)
    	 Courses[] course ={(Courses) coursesToSelect.get(2),(Courses) coursesToSelect.get(3)};
    	 coursesToSelect.removeAll(Arrays.asList(course));//Arrayas.asList() ������ת��Ϊ����
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
