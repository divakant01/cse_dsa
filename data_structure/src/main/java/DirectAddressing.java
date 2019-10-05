/**
 * @author Divakant Pandey
 * 
 *         If the Universal set is limited for keys we can use Direct
 *         Addressing, To perform Search, Insert, Delete in O(1) time Example -
 *         Key is in the range 1 to 10
 * 
 * */
public class DirectAddressing<T> {

	private int limit;
	private T[] a;

	public DirectAddressing(int limit) {
		this.limit = limit;
		a = (T[]) new Object[limit + 1];
	}

	private boolean isValidKey(int key) {
		if (key >= 0 && key <= limit)
			return true;
		return false;
	}

	void insert(int key, T value) {
		if (isValidKey(key))
			a[key] = value;
		else
			throw new IllegalArgumentException("Key is not in the valid Range "+key);
	}

	T get(int key) {
		if (isValidKey(key))
			return a[key];
		else
			throw new IllegalArgumentException("Key is not in the valid Range "+key);

	}

	void delete(int key) {
		if (isValidKey(key))
			a[key] = null;
		else
			throw new IllegalArgumentException("Key is not in the valid Range "+key);

	}

	public static void main(String[] args) {
		DirectAddressing<String> d = new DirectAddressing<String>(10);
		d.insert(2, "Abc");
		d.insert(9, "Xyz");
		System.out.println(d.get(1));
		System.out.println(d.get(2));
		System.out.println(d.get(9));
		d.delete(2);
		d.delete(9);
		System.out.println(d.get(1));
		System.out.println(d.get(2));
		System.out.println(d.get(9));
		d.insert(11, "Val");
	}

}
