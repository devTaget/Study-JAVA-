package dateAppTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DateApp {

	public ArrayList<Love> loves = DB.love;

	// ����ڰ� ���ϴ� ������ �̻��� ��� ��ȸ
	public ArrayList<Love> loveTypeSelect(int age) {
		ArrayList<Love> loveAge = new ArrayList<Love>();
		for (int i = 0; i < loves.size(); i++) {
			if (loves.get(i).getAge() == age) {
				loveAge.add(loves.get(i));
			}
		}
		return loveAge;
	}
	
	//�̻����� ���� ����
	public void loveAgeModify(Love love) {
		love.setAge(love.getAge());
	}
	
	//�̻��� ���� �� ����
//	public ArrayList<Love> age() {
//		ArrayList<Integer> loveAge = new ArrayList<Integer>();
//		ArrayList<Love> age = new ArrayList<Love>();
//		for (int i = 0; i < loves.size(); i++) {
//			loveAge.add(loves.get(i).getAge());
//		}
//		Collections.sort(loveAge);
//		for (int ages : loveAge) {
//			for (int i = 0; i < loves.size(); i++) {
//				if(loves.get(i).getAge() == loveAge) {
//					age.add(loves.get(i));
//					loves.remove(loves.get(i));
//					
//				}
//			}
//		}
		
//		return age;
//	}
	
	
	 public void sort() {
//	      DB�� �ִ� �̻������� ���� ������ ������ ���
	      ArrayList<Love> results = new ArrayList<Love>();
	      
//	      �̻������� ���̸� ���� �ڷᱸ��
	      ArrayList<Integer> ages = new ArrayList<Integer>();
	      
//	      loves���� ���̸� �����ͼ� ages�� �߰�
	      for (Love love : loves) {
	         ages.add(love.getAge());
	      }
	      
//	      ������������ ����
	      Collections.sort(ages);
	      
	      for (int age : ages) {
	         for (int i=0; i<loves.size(); i++) {
	            if(loves.get(i).getAge() == age) {
	               results.add(loves.get(i));
	               loves.remove(loves.get(i));
	            }
	         }
	      }
	      loves = results;
	   }

	
//	if(loves.get(i).getAge() == loveAge.get(i)) {
//		age.add(loves.get(i));
//	}
//	
	
	
	
	

}
