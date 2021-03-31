package io.sandeep.restassign;
import org.springframework.stereotype.Service;


@Service
public class ValidService {

	public String getval(String st) {
		long i = Long.parseLong(st);
		String[] arr = st.split("");
		int a = arr.length;
		int j = Integer.parseInt(arr[0]);
		String string = "invalid";

		if (a >= 16) {

			if (j == 6) {
				if (a == 16) {
					while (i >= 1000000) {
						i /= 10;
					}
					if ((i >= 601100 && i <= 601109) || (i >= 601120 && i <= 601149) || (i >= 601177 || i <= 601179)
							|| (i >= 601186 && i <= 601199) || (i >= 644000 && i <= 659999)) {
						string = "American express";
					}
				}
			}

			if (j == 3) {
				while (i >= 10000) {
					i /= 10;
				}
				if (i >= 3528 && i <= 3589) {
					string = "JBC";
				}
			}

			if (j == 5 || j == 2) {
				if (a == 16) {
					while (i >= 1000000) {
						i /= 10;
					}
					if ((i >= 510000 && i <= 559999) || (i >= 222100 && i <= 272099)) {
						string = "Master card";
					}
				}
			}

		} else if (a == 15) {
			while (i >= 10000) {
				i /= 10;
			}
			if (i >= 2014 && i <= 2149) {
				string = "enRoute";
			}
		}

		if (string.equals("invalid") && j == 4) {
			string = "Visa";
		}

		return string;
	}


}




