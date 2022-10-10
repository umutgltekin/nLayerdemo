package nlayer.core.logg;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("veritabanına loglandı "+data);
		
	}

}
