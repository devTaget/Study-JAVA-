package hashMapTest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONWork {
   public static void main(String[] args) {
      JSONObject productJSON = new JSONObject();
      JSONArray products = new JSONArray();
      
//      ��ǰ Ŭ���� ����(��ǰ ��ȣ, ��ǰ �̸�, ��ǰ ����, ��ǰ ���)
//      1. ��ǰ 1���� �����Ͽ� JSON�������� ����
      Product shoes = new Product(1, "����Ű", 129_000, 32);
      JSONObject shoesJSON = new JSONObject(shoes);
//      System.out.println(shoesJSON);
//      2. JSON������ ��ǰ ���� �� ��ǰ ��� ���
//      try {
//         System.out.println(shoesJSON.get("stock"));
//      } catch (JSONException e) {
//         e.printStackTrace();
//      }
      
//      3. ���� ���� ��ǰ ���� ����
      Product bag = new Product(2, "����", 12_000_000, 2);
      
//      4. ���� ���� ��ǰ�� KEY���� "discount"�� ����
//      5. JSON�������� ����
      JSONObject bagJSON = new JSONObject(bag);
//      6. JSON�� ������ �ʵ� �߰�
      try {
         bagJSON.put("discount", 30);
      } catch (JSONException e) {
         e.printStackTrace();
      }
//      7. JSON������ ��ǰ ���� �� ������ ���
      try {
         System.out.println(bagJSON.get("discount"));
      } catch (JSONException e) {
         e.printStackTrace();
      }
      
//      �Ź߰� ������ �ϳ��� �����!
      try {
         products.put(bagJSON);
         products.put(shoesJSON);
//         System.out.println(products);
         System.out.println(products.getJSONObject(0).get("price"));
//         productJSON.put("shoes", shoesJSON);
//         productJSON.put("bag", bagJSON);
//         System.out.println(productJSON);
      } catch (JSONException e) {
         e.printStackTrace();
      }
   }
}











