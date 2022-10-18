package datingApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAccountDAOImps implements UserAccountDAO {

	Map<Integer, UserAccount> userAccounts = new HashMap<>();

	@Override
	public void save(UserAccount userAccount) {
		userAccounts.put(userAccount.getId(), userAccount);

	}

	@Override
	public UserAccount findById(int id) {
		
		return userAccounts.get(id);
	}

	@Override
	public List<UserAccount> findAll() {
		
		return new ArrayList<UserAccount>(userAccounts.values());

	}

	@Override
	public List<UserAccount> findMatches(int age, String city) {
		Collection<UserAccount> accounts = userAccounts.values(); 
		ArrayList<UserAccount> matches= new ArrayList<UserAccount>();
		for()
		return null;
	}

}
