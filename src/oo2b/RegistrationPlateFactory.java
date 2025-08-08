package oo2b;

public class RegistrationPlateFactory {
	private static String[] registrationPlates = {
			"LA05 XYZ",
			"NG58 JKL",
			"MA13 HYP",
			"BX06 TUV",
			"CF67 QRS",
			"YS09 PQR",
			"WD21 NML",
			"KR16 FGH",
			"SJ04 UVW",
			"LV22 ABC",
			"WX19 XYZ"
	};
	static int count = 0;
	
	public static RegistrationPlate getNextRegistrationPlate() {
		if (count < registrationPlates.length){
			return new RegistrationPlate(registrationPlates[count++]);
		}
		else {
			System.out.println("No more registration plates");
			return null;
		}
	}
}
