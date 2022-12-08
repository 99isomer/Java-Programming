class Television {

	private int ch, vol;
	private boolean onOff;

	Television(int c, int v, boolean o) {

		ch = c;
		vol = v;
		onOff = o;
	}

	void print() {
		System.out.println("채널은 " + ch + "이고 볼륨은 " + vol + "입니다.");
	}
}

public class TelevisionTest {

	public static void main(String[] args) {

		Television myTv = new Television(7, 10, true);
		myTv.print();
		Television urTv = new Television(11, 20, true);
		urTv.print();

	}

}
