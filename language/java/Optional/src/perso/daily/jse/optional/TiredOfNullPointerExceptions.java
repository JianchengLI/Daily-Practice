package perso.daily.jse.optional;

import java.util.Optional;

public class TiredOfNullPointerExceptions {

	/**
	 * Make your code more readable and protect it against null pointer exceptions ?
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String version = "Unknown";
		
		Computer _computer = null;
		/**
		 * Very ugly due to the nested checks
		 * Maybe like : String version = computer?.getSoundcard()?.getUSB()?.getVersion() ? : "Unknown";
		 */
		if (_computer != null) {
			Soundcard soundcard = _computer._getSoundCard();
			if (soundcard != null) {
				USB usb = soundcard._getUsb();
				if (usb != null) {
					version = usb.getVersion();
				}
			}
		}
		
		/**
		 * Optional in a Nutshell
		 * A single-value container that either contains a value or doesn't
		 */
		Optional<Computer> computer = Optional.ofNullable(_computer);
		version = computer.flatMap(Computer::getSoundCard)
						  .flatMap(Soundcard::getUsb)
						  .map(USB::getVersion)
						  .orElse("Version not found.");
		
		System.out.println(version);
	}
}
