package ucuncuGunOdev;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+ " named instructor has been added!");
		super.add(user);
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+ " named instructor has been deleted!");
		super.delete(user);
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+ " named instructor has been updated!");
		super.update(user);
	}
}
