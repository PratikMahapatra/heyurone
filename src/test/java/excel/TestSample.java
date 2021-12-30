package excel;

import java.io.IOException;
import java.util.ArrayList;

public class TestSample {
	public void main(String[] args) throws IOException {

		getData d = new getData();
		ArrayList<String> data = d.getData("profile");
		System.out.println(data.get(0));

	}

}
