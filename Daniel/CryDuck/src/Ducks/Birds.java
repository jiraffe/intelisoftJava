package Ducks;

public abstract class Birds implements Birdcage {

	private String cre;
	private boolean canFly;
	private boolean canSwim;

	public Birds(String cre, boolean canFly, boolean canSwim) {
		this.cre = cre;
		this.canFly = canFly;
		this.canSwim = canFly;
	}

	@Override
	public void cry() {
		System.out.println(cre);
	}

	@Override
	public boolean isCanFly() {
		return canFly;
	}

	@Override
	public boolean isCanSwim() {
		return canSwim;
	}

}
