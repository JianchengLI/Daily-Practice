package perso.daily.jse.optional;

import java.util.Optional;

public class Computer {
	private Optional<Soundcard> soundCard;

	public Optional<Soundcard> getSoundCard() {
		return soundCard;
	}

	public Soundcard _getSoundCard() {
		return soundCard.get();
	}
	
	public void setSoundCard(Soundcard soundCard) {
		this.soundCard = Optional.of(soundCard);
	}
}
