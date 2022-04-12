import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LerArquivo {

	public static void main(String[] args) {
		String pathSource = "C:\\Users\\hruss\\Desktop\\InfinitumFinal\\2.txt";
		String pathWrite = "C:\\Users\\hruss\\Desktop\\InfinitumFinal\\testWrite.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathWrite))) {
			bw.write("INSERT INTO users ");
			bw.newLine();
			bw.write("VALUES");
			bw.newLine();

			try (BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(pathSource), "UTF8"))) {
				String line = br.readLine();
				line = br.readLine();
				
				while (line != null) {

					String[] fields = line.split(":");

					if (fields.length >= 9) {

						String phone = fields[0];
						String number = fields[1];
						String name = fields[2];
						String secondName = fields[3];
						String gender = fields[4];
						String city = fields[5];
						String hometown = fields[6];
						String civilStatus = fields[7];
						String workplace = fields[8];

						Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(line);

						if (m.find()) {
							String email = m.group();
							User user = new User(name, secondName, phone, number, gender, city, hometown, civilStatus,
									workplace, email);

							bw.write("('" + user.getName() + "', '" + user.getSecondName() + "', '" + user.getPhone()
									+ "', '" + user.getNumber() + "', '" + user.getGender() + "', '" + user.getCity()
									+ "', '" + user.getHometown() + "', '" + user.getCivilStatus() + "', '"
									+ user.getWorkplace() + "', '" + user.getEmail() + "')");
							bw.newLine();

							line = br.readLine();

						} else {

							User user = new User(name, secondName, phone, number, gender, city, hometown, civilStatus,
									workplace, "");

							bw.write("('" + user.getName() + "', '" + user.getSecondName() + "', '" + user.getPhone()
									+ "', '" + user.getNumber() + "', '" + user.getGender() + "', '" + user.getCity()
									+ "', '" + user.getHometown() + "', '" + user.getCivilStatus() + "', '"
									+ user.getWorkplace() + "', '" + user.getEmail() + "')");
							bw.newLine();

							line = br.readLine();
						}
					} else {
						System.out.println("WARNING: " + line);
						
						line = br.readLine();
					}
					
				}

				} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Created file");
	}
}