package perso.daily.jse.optional;

import java.util.Optional;

public class TryOptional {

	public static void main(String[] args) {
		Optional<USB> maybeUSB = Optional.of(new USB("3.0"));
		maybeUSB.filter(usb -> "3.0".equals(usb.getVersion()))
			    .ifPresent((e)-> System.out.println("OK"));
	}

}
