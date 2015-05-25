package battle;

public class Attackblock {
	// player
	boolean attackhead;
	boolean attacktorso;
	boolean attackstomach;
	boolean attackgroin;
	boolean attackfeet;

	boolean blockheadtorso;
	boolean blocktorsostomach;
	boolean blockstomachgroin;
	boolean blockgroinfeet;
	boolean blockfeethead;
	// enemy
	boolean eattackhead;
	boolean eattacktorso;
	boolean eattackstomach;
	boolean eattackgroin;
	boolean eattackfeet;

	boolean eblockheadtorso;
	boolean eblocktorsostomach;
	boolean eblockstomachgroin;
	boolean eblockgroinfeet;
	boolean eblockfeethead;

	private void Userblock() {
		if (blockheadtorso == true) {
			eattackhead = false;
			eattacktorso = false;
		} else if (blocktorsostomach == true) {
			eattacktorso = false;
			eattackstomach = false;
		} else if (blockstomachgroin == true) {
			eattackstomach = false;
			eattackgroin = false;
		} else if (blockgroinfeet == true) {
			eattackgroin = false;
			eattackfeet = false;
		}
		if (eattackhead && eattacktorso && eattackstomach && eattackgroin
				&& eattackfeet == true) {

		}
	}

	private void Userattack() {
		if (eblockheadtorso == true) {
			attackhead = false;
			attacktorso = false;
		} else if (eblocktorsostomach == true) {
			attacktorso = false;
			attackstomach = false;
		} else if (eblockstomachgroin == true) {
			attackstomach = false;
			attackgroin = false;
		} else if (eblockgroinfeet == true) {
			attackgroin = false;
			attackfeet = false;
		}

	}

}
