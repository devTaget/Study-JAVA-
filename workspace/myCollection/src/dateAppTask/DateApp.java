package dateAppTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DateApp {

	public ArrayList<Love> loves = DB.love;

	// 사용자가 원하는 나이의 이상형 목록 조회
	public ArrayList<Love> loveTypeSelect(int age) {
		ArrayList<Love> loveAge = new ArrayList<Love>();
		for (int i = 0; i < loves.size(); i++) {
			if (loves.get(i).getAge() == age) {
				loveAge.add(loves.get(i));
			}
		}
		return loveAge;
	}
	
	//이상형의 나이 수정
	public void loveAgeModify(Love love) {
		love.setAge(love.getAge());
	}
	
	//이상형 나이 순 정렬
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
//	      DB에 있는 이상형들을 나이 순으로 정렬한 결과
	      ArrayList<Love> results = new ArrayList<Love>();
	      
//	      이상형들의 나이만 담을 자료구조
	      ArrayList<Integer> ages = new ArrayList<Integer>();
	      
//	      loves에서 나이를 가져와서 ages에 추가
	      for (Love love : loves) {
	         ages.add(love.getAge());
	      }
	      
//	      오름차순으로 정렬
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
