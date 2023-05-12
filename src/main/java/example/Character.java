package example;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
@Data
public abstract class Character {
	private String firstname;
	private String lastname;
	private int healthPointMax;
	private int healthPointNow;

	public void defense(int hp) {
		healthPointNow += hp;
	}

	public void addhp(int hp) {
		healthPointNow += hp;
	}

}
