
public class Notebook {
	private static int count = 0;
	private int order;
	private String model;
	private int ram;
	private int hard;
	private String os;
	private String color;

	private void setValues(String model, int ram, String os, String color, int hard) {
		this.order = ++count;
		this.model = model;
		this.ram = ram;
		this.os = os;
		this.hard = hard;
		this.color = color;
	}

	public Notebook(String model, int ram, String os, String color, int hard) {
		setValues(model, ram, os, color, hard);
	}

	public int getOrder() {
		return this.order;
	}

	public int getRam() {
		return this.ram;
	}

	public int getHard() {
		return this.hard;
	}

	public String getModel() {
		return this.model;
	}

	public String getOs() {
		return this.os;
	}

	public String getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.order);
		stringBuilder.append(" Notebook: ");
		stringBuilder.append(this.model);
		stringBuilder.append(", ");
		stringBuilder.append("OS ");
		stringBuilder.append(this.os);
		stringBuilder.append(", ");
		stringBuilder.append("ram ");
		stringBuilder.append(this.ram);
		stringBuilder.append(", ");
		stringBuilder.append("hard ");
		stringBuilder.append(this.hard);
		stringBuilder.append(", ");
		stringBuilder.append("color ");
		stringBuilder.append(this.color);
		stringBuilder.append(";");
		stringBuilder.append("\n");
		return stringBuilder.toString();
	}
}
