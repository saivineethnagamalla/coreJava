package coreJavaMyra;

public final class TestFinal {

	public TestFinal(int d) {
		super();
		this.d = d;
	}

	private int d = 30;

	public final int add(int a, int b) {
		return a + b;
	}

//	int c = add(10, 20);

	public static void main(String[] args) {

		final int a = 29;

		System.out.println(a);
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

}
