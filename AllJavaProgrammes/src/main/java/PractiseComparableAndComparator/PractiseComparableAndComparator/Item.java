package PractiseComparableAndComparator.PractiseComparableAndComparator;

public class Item {

	private int id;
	private String name;

	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int hashCode() {

		return id + name.hashCode();

	}

	public boolean equals(Object obj) {

		if (obj instanceof Item) {
			Item item = (Item) obj;
			return (item.getName().equals(this.getName()) && item.getId() == this.id);
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}

}
