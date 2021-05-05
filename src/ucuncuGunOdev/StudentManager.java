package ucuncuGunOdev;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+ " named student has been added!");
		super.add(user);
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+ " named student has been deleted!");
		super.delete(user);
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+ " named student has been updated!");
		super.update(user);
	}
}
