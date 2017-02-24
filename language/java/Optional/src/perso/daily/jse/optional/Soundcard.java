package perso.daily.jse.optional;

import java.util.Optional;

public class Soundcard {
	private Optional<USB> usb;

	public Optional<USB> getUsb() {
		return usb;
	}
	
	public USB _getUsb() {
		return usb.get();
	}

	public void setUsb(USB usb) {
		this.usb = Optional.of(usb);
	}
}
