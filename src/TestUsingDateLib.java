import java.util.Date;

public class TestUsingDateLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		for(int i=0;i<8;i++) {
			long time=10000*(long)(Math.pow(10, i));
			date.setTime(time);
			System.out.println(date.toString());
		}
	}

}
