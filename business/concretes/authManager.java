package business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import business.abstracts.authService;
import core.utilities.businessRules;
import core.utilities.finalResult;
import entities.concretes.User;

public class authManager implements authService {

	businessRules _results=new businessRules();

	

	@Override
	public void loginMember(User user) {
		
	}

	@Override
	public User registerMember(User user) {
				finalResult result=_results.run(checkPasswordLength(user),
										checkEmailValidate(user),
										checkNameValidate(user)
										);
		if (result!=null) {
			System.out.println(result.message);
			return null;
		} else {
			System.out.println("Kullanýcý sisteme kaydedildi");
			return user;
		}
		
	}
	
	
	private finalResult checkPasswordLength(User user) {
		finalResult fr=new finalResult();
		fr.success=user.getPassword().length()>5;
		if (fr.success) {
			fr.message="Doðrulandý";
		} else {
			fr.message="Parola en az 6 haneli olmalýdýr";
		}
		return fr;
	}
	
	private finalResult checkEmailValidate(User user) {
		finalResult fr=new finalResult();
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());
		fr.success=matcher.matches();
		
		if (fr.success) {
			fr.message="Doðrulandý";
		} else {
			fr.message="Lütfen geçerli bir email adresi beyan ediniz.";
		}
		return fr;
	}
	
	private finalResult checkNameValidate(User user) {
		finalResult fr=new finalResult();
		fr.success=user.getFirstName().length()>=2 && user.getSurName().length()>=2;
		if (fr.success) {
			fr.message="Doðrulandý";
		} else {
			fr.message="ad ya da soy ad en az iki karakter olmalýdýr.";
		}
		return fr;
	}
	
	@Override
	public User get(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
		
}
