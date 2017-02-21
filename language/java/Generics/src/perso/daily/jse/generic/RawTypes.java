package perso.daily.jse.generic;

class BoxRawType<T> {
	public void set(T t) {/* ... */ }
}

public class RawTypes {

	// The @SuppressWarnings("unchecked") annotation suppresses unchecked
	// warnings
	// @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// A raw type is the name of a generic class or interface without any
		// type arguments
		BoxRawType rawBox = new BoxRawType();

		// But if you assign a raw type to a parameterized type, you get a
		// warning: unchecked
		BoxRawType<Integer> box; // warning: unchecked conversion
		box = createBox();// warning: unchecked conversion

		rawBox = box;
		rawBox.set(8);
	}

	static BoxRawType createBox() {
		return new BoxRawType();
	}
}
