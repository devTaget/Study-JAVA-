package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
public class StreamTask {
	public static void main(String[] args) {
		
//		10~1���� ArrayList�� ��� ���
//		1~10���� ArrayList�� ��� ���
		ArrayList<Integer> datas = new ArrayList<Integer>();
		ArrayList<String> arr = new ArrayList<String>();
//		
//		
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		System.out.println(datas);
//		IntStream.rangeClosed(1, 10).forEach(v-> data.add(11-v));
//		System.out.println(data);
		
//		chars()
		
//		ABCDEF�� �� ���ں��� ���

//		String eng = "ABCDEF";
		
//		eng.chars().forEach(v-> System.out.println((char)v));
		
//		map() :���� ���� ���ϴ� ������ ����
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���
//		IntStream.rangeClosed(1, 50).map(v -> v * 2 -1).forEach(System.out::println);
		
//		A~F���� �� D�����ϰ� ArrayList�� ��� ���
//		String eng = "ABCDEFG";
//		IntStream.range('A', 'G').map(c -> c > 67 ? c + 1 : c).forEach(c ->System.out.println((char)c));		
		
		
		
		
// 		5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINK), toLowerCase()		
//		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("Black","WHITE","reD","yeLLow","PINK"));
//		
//		arr.stream().map(v-> v.toLowerCase()).forEach(System.out::printf);
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���'
//		IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).forEach(System.out::println);
		
//		Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���
//		ArrayList<String> arr = new ArrayList<String>();
//		arr.add("Apple");
//		arr.add("banana");
//		arr.add("Melon");
//		arr.stream().filter(c -> c.charAt(0) <= 91 && c.charAt(0) >= 65).forEach(System.out::println);
		
		
//		�ѱ��� ������ ����
//		ArrayList<String> arr = new ArrayList<String>();
		String ar = "�����̻�����ĥ�ȱ�";
		String number = "�����ϻ�";
		
//		IntStream.range(0, number.length()).map(i -> ar.indexOf(number.charAt(i))).forEach(System.out::print);
      number.chars().map(ar::indexOf).forEach(System.out::print);
		
		
		
//		������ �ѱ۷� ����
//		IntStream.range(0, number.length()).map(i -> ar.charAt(number.charAt(i)-48)).forEach(c -> System.out.print((char)c));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
