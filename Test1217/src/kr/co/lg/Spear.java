package kr.co.lg;

public class Spear extends Weapon{

	public Spear() {}

	public Spear(int attckPower) {
		super(attckPower);
	}

	@Override
	public void img() {
		System.out.println("������ ���� ������ ���ϴ�.");
	}

	@Override
	public String toString() {
		return "SPEAR";
	}
}
