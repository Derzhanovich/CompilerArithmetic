import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Scope {
	private String id;
	private String type;
	private int line;
	private List<Block> blocks = new ArrayList<Block>();

	public void addBlock(Block x) {
		blocks.add(x);
	}

	public boolean inScope(String id) {
		for (int i = 0; i <= blocks.size(); i++) {
			if (blocks.get(i).contains(id))
				return true;
		}
		return false;
	}

	public void removeTopBlock() {
		if (!blocks.isEmpty()) {
			blocks.remove(blocks.size());
		}
	}

}