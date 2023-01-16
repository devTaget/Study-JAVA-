package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
public class StreamTask {
	public static void main(String[] args) {
		
//		10~1까지 ArrayList에 담고 출력
//		1~10까지 ArrayList에 담고 출력
		ArrayList<Integer> datas = new ArrayList<Integer>();
		ArrayList<String> arr = new ArrayList<String>();
//		
//		
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		System.out.println(datas);
//		IntStream.rangeClosed(1, 10).forEach(v-> data.add(11-v));
//		System.out.println(data);
		
//		chars()
		
//		ABCDEF를 각 문자별로 출력

//		String eng = "ABCDEF";
		
//		eng.chars().forEach(v-> System.out.println((char)v));
		
//		map() :기존 값을 원하는 값으로 변경
		
//		1~100까지 중 홀수만 ArrayList에 담고 출력
//		IntStream.rangeClosed(1, 50).map(v -> v * 2 -1).forEach(System.out::println);
		
//		A~F까지 중 D제외하고 ArrayList에 담고 출력
//		String eng = "ABCDEFG";
//		IntStream.range('A', 'G').map(c -> c > 67 ? c + 1 : c).forEach(c ->System.out.println((char)c));		
		
		
		
		
// 		5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINK), toLowerCase()		
//		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("Black","WHITE","reD","yeLLow","PINK"));
//		
//		arr.stream().map(v-> v.toLowerCase()).forEach(System.out::printf);
		
//		1~100까지 중 홀수만 ArrayList에 담고 출력'
//		IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).forEach(System.out::println);
		
//		Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력
//		ArrayList<String> arr = new ArrayList<String>();
//		arr.add("Apple");
//		arr.add("banana");
//		arr.add("Melon");
//		arr.stream().filter(c -> c.charAt(0) <= 91 && c.charAt(0) >= 65).forEach(System.out::println);
		
		
//		한글을 정수로 변경
//		ArrayList<String> arr = new ArrayList<String>();
		String ar = "공일이삼사오육칠팔구";
		String number = "일일일삼";
		
//		IntStream.range(0, number.length()).map(i -> ar.indexOf(number.charAt(i))).forEach(System.out::print);
      number.chars().map(ar::indexOf).forEach(System.out::print);
		
		
		
//		정수을 한글로 변경
//		IntStream.range(0, number.length()).map(i -> ar.charAt(number.charAt(i)-48)).forEach(c -> System.out.print((char)c));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
