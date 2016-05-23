import java.util.ArrayList;
import java.util.List;

public class Block {
	private List<VarData> vars = new ArrayList<VarData>();

	public boolean addVar(VarData var) {
		if (!contains(var.getId())) {
			vars.add(var);
			return true;
		}
		return false;
	}

	public String getLastId() {
		if (!vars.isEmpty()) {
			return vars.get(vars.size() - 1).getId();
		}
		return null;
	}

	public String getLastType() {
		if (!vars.isEmpty()) {
			return vars.get(vars.size() - 1).getType();
		}
		return null;
	}

	public int getLastLine() {
		if (!vars.isEmpty()) {
			return vars.get(vars.size() - 1).getLine();
		}
		return 0;
	}

	public boolean addVar(String id, String type, int line) {
		if (!contains(id)) {
			VarData x = new VarData(id, type, line);
			vars.add(x);
			return true;
		}
		return false;
	}

	public boolean contains(String id) {

		if (vars.isEmpty()) {
			return false;
		} else {
			for (int i = 0; i < vars.size(); i++) {
				if (vars.get(i).getId().equals(id))
					return true;
			}
		}
		return false;

	}

	public int getLineOfVar(String id) {
		for (int i = 0; i < vars.size(); i++) {
			if (vars.get(i).getId().equals(id))
				return vars.get(i).getLine();
		}
		return 0;
	}

	public String getTypeOfVar(String id) {
		for (int i = 0; i < vars.size(); i++) {
			if (vars.get(i).getId().equals(id))
				return vars.get(i).getType();
		}
		return "";
	}

	public void content() {
		for (int i = 0; i < vars.size(); i++) {
			System.out.println(vars.get(i).getId());
		}
	}
}
