package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int fare1 = 850, fare2 = 300, fare3 = 600;
		int fare = 0;
		int distance = 10;
		int plusfare = 0;
		String car = "고속버스";
		// 10km 이상마다 고속버스 +300, 나머지 +200
		switch(car) {
		case "고속버스":
			if(distance > 10) {
				plusfare += (distance / 10) * 300;
			}
			fare = fare1 + plusfare;
			break;
		case "경차":
			if(distance > 10) {
				plusfare += (distance / 10) * 200;
			}
			fare = fare2 + plusfare;
			break;
		case "그 외":
			if(distance > 10) {
				plusfare += (distance / 10) * 200;
			}
			fare = fare3 + plusfare;
			break;
		default:
			System.out.println("땡");
			System.exit(1);
		}
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + fare + "원");
	}

}
