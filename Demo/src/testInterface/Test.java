package testInterface;

import testInterface.TestInterface.Testinter;

public class Test implements Testinter{
	protected String strr = null;
	@Override
	public void setString(String str) {
			strr = str;	
	}

	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return strr;
	}

}
