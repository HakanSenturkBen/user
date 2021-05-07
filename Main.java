import java.util.ArrayList;
import java.util.List;

import business.concretes.authManager;
import core.utilities.Araclar;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		List<User> userList= new ArrayList<User>();
		
		List<String> kullaniciBilgileri=new ArrayList<String>();
		authManager authman=new authManager();
		
		Araclar ar=new Araclar();
		kullaniciBilgileri=ar.sorgu("Ad�","Soyad�","Email","Parola");
		
		User user=new User(userList.size()+1,kullaniciBilgileri.get(0),kullaniciBilgileri.get(1),kullaniciBilgileri.get(2),kullaniciBilgileri.get(3));
		
		System.out.print(user);
		
		userList.add(authman.registerMember(user));
		for (User x : userList) {
			System.out.print(x);
		}
		kullaniciBilgileri=ar.sorgu("Email","Parola");
		
		for (User x : userList) {
			boolean hakan=x.geteMail()==kullaniciBilgileri.get(0);
			System.out.println(hakan+x.geteMail()+"=="+kullaniciBilgileri.get(0));
			
			if (x.geteMail().matches(kullaniciBilgileri.get(0))) {
				if (x.getPassword().matches(kullaniciBilgileri.get(1))) {
					System.out.println("ho�geldiniz say�n :" +user);
				} else {
					System.out.println("parolan�z hatal� say�n :" +user);
				}
			} else {
				System.out.println("mail adresiniz hatal� say�n :" +user);
			}
		}
		
	}

}


