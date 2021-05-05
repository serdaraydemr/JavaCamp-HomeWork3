package abstractt;

import java.util.Date;

import entity.Gamer;

public abstract class BaseGamerManager implements IGamerService{

	@Override
	public void add(Gamer gamer) {
		System.out.println("Gamer " + gamer.getFirstName() +  " Eklendi ! HERKESE ÇAY :)"  );
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer " + gamer.getFirstName() +  " Aramızdan Ayrıldı ! BAYRAKLAR YARIYA... :("  );
		
	}

	@Override
	public void update(Gamer gamer,  String firsName, String lastName, Date birthday, String natioanlId,String email) {
		
		gamer.setFirstName(firsName);
		gamer.setLastName(lastName);
		gamer.setBirthday(birthday);
		gamer.setNatioanlId(natioanlId);
		gamer.setEmail(email);
		
		System.out.println("Güncelleme Başarılı : " + gamer.getFirstName() +"  "+ gamer.getLastName());
		
		
		
		
		
	}

}
