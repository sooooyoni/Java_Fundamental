package java_20210503;

public class SwitchDemp {

	public static void main(String[] args) {
		// run configurations>argument>program argument
		int month = Integer.parseInt(args[0]);
		String season = "";
		switch (month) {
		case 12:season = "겨울";		break;
		default : season="없는계절";   break;
		case 1:season = "겨울";		break;
		case 2:season = "겨울";		break;
		case 3:season = "봄";		break;
		case 4:season = "봄";		break;
		case 5:season = "봄";		break;
	    //case를 여러개 사용가능하다
		case 6,7,8:season = "여름";		break;
		//같은 문장은 생략가능
		case 9:
		case 10:
		//마지막문장엔 brak를 안써도 된다
		case 11:season = "가을";		
	

		}
		//switch문 밖에 있어야한다
	
		System.out.println(month + "월은 " + season + "입니다.");

	}

}
