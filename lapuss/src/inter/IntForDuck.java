package inter;

public interface IntForDuck extends IntForDuckVer1, IntForDuckVer2 {
	public void fly();

	IntForDuckVer1 fly1 = new IntForDuckVer1() {

		@Override
		public void fly() {
		}

		@Override
		public void swim1() {

		}
	};
	IntForDuckVer2 fly2 = new IntForDuckVer2() {

		@Override
		public void fly() {
		}

		@Override
		public void swim2() {

		}
	};
}
