public class VarData {
	private String id;
	private String type;
	private int line;

	public VarData(String id, String type, int line) {
		setType(type);
		setLine(line);
		setId(id);
	}

	public String getType() {
		return type;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
