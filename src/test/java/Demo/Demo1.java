package Demo;

import java.io.FileReader;
import java.util.Properties;

import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void test() throws Exception {

		FileReader f1 = new FileReader(
				"C:\\Users\\HP\\eclipse-workspace\\OpenCartDemo\\src\\test\\resource\\config.properties");
		Properties pr = new Properties();
		pr.load(f1);

		System.out.println(pr.get("url"));

	}

}
