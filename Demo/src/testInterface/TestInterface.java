package testInterface;

public class TestInterface {
	
	public static interface Testinter{
		public void setString(String str);
		
		public String getString();
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		Testinter tt = (Testinter) (new Returnclass().getclass().newInstance());
		tt.setString("testInterface");
		System.out.println(tt.getString());
	}
}
