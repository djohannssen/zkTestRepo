package business;

import org.zkoss.xel.XelException;

public class UserResolver implements org.zkoss.xel.VariableResolver {

	@Override
	public Object resolveVariable(String name) throws XelException {
		return "users".equals(name) ? Users.getAll() : null;
	}

}
