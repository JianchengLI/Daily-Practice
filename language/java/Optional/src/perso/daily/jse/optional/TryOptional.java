package perso.daily.jse.optional;

import java.util.Optional;

public class TryOptional {

	public static void main(String[] args) {
		Optional<USB> maybeUSB = Optional.of(new USB("3.0"));
		maybeUSB.filter(usb -> "3.0".equals(usb.getVersion()))
			    .ifPresent((e)-> System.out.println("OK"));
		
		// empty and null value
		Optional<String> str = Optional.empty();
		System.out.println(str.orElse(null));
		str = Optional.ofNullable(null);
		System.out.println(str.orElse("Not Found"));
	}

}
