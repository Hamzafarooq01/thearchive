import java.util.*;

public class ProbabilityChecker 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("What is your name?");
		
		String name = "";
		name = scanner.nextLine();
		
		System.out.println("What is your age?");
		
		int age = scanner.nextInt();
		
		System.out.println("What is your horoscope?");
		System.out.println("Aquarius, Pisces, Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, Capricorn");
		String horoscope = scanner.next();
		if(horoscope.equals("Aquarius"))
		{
			System.out.println("Aquarius");
		}
		if(horoscope.equals("Pisces"))
		{
			System.out.println("Pisces");
		}
		if(horoscope.equals("Aries"))
		{
			System.out.println("Aries");
		}
		if(horoscope.equals("Taurus"))
		{
			System.out.println("Taurus");
		}
		if(horoscope.equals("Gemini"))
		{
			System.out.println("Gemini");
		}
		if(horoscope.equals("Cancer"))
		{
			System.out.println("Cancer");
		}
		if(horoscope.equals("Leo"))
		{
			System.out.println("Leo");
		}
		if(horoscope.equals("Virgo"))
		{
			System.out.println("Virgo");
		}
		if(horoscope.equals("Libra"))
		{
			System.out.println("Libra");
		}
		if(horoscope.equals("Scorpio"))
		{
			System.out.println("Scorpio");
		}
		if(horoscope.equals("Sagittarius"))
		{
			System.out.println("Sagittarius");
		}
		if(horoscope.equals("Capricorn"))
		{
			System.out.println("Capricorn");
		}
		System.out.println("You entered: "+ name + ", " + age + ", " + horoscope);

		//Person 2 Starts Here
		System.out.println("What is other person's name?");
		
		String name2 = " ";
		name2 = scanner.nextLine();
		name2 += scanner.nextLine();
		
		System.out.println("What is their age?");
		int age2 = scanner.nextInt();

		System.out.println("What is their horoscope?");
		System.out.println("Aquarius, Pisces, Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, Capricorn");
		String horoscope2 = scanner.next();
		System.out.println("Calculating Results... ");
		if(name.contentEquals("Hamza Farooq") && name2.contains("Devon Wilks"))
		{
			System.out.println("100% Match");
			System.exit(1);
		}
		if(name.contains("Hamza Farooq") && !name2.contains("Devon Wilks")||name.contains("Devon Wilks") && !name2.contains("Hamza Farooq"))
		{
			System.out.println("0% Match");
			System.exit(1);
		}
		if(name.contentEquals("Ashley Nguyen") && name2.contains("Danny Truong"))
		{
			System.out.println("100% Match");
			System.exit(1);
		}
		if(name.contains("Ashley Nguyen") && !name2.contains("Danny Truong")||name.contains("Danny Truong") && !name2.contains("Ashley Nguyen"))
		{
			System.out.println("0% Match");
			System.exit(1);
		}
		
		//Aquarius Calculations
		
		if(horoscope2.contentEquals("Aquarius")&& horoscope.contentEquals("Aquarius"))
		{
			System.out.println("45% Match");
		}
		if(horoscope2.contentEquals("Aquarius")&& horoscope.contentEquals("Pisces") || (horoscope2.contentEquals("Pisces")&& horoscope.contentEquals("Aquarius")))
		{
			System.out.println("45% Match");
		}
		if(horoscope2.contentEquals("Aquarius")&& horoscope.contentEquals("Aries") || (horoscope2.contentEquals("Aries")&& horoscope.contentEquals("Aquarius")))
		{
			System.out.println("78% Match");
		}
		if(horoscope2.contentEquals("Aquarius")&& horoscope.contentEquals("Taurus") || (horoscope2.contentEquals("Taurus")&& horoscope.contentEquals("Aquarius")))
		{
			System.out.println("58% Match");
		}
		if(horoscope2.contentEquals("Aquarius")&& horoscope.contentEquals("Gemini") || (horoscope2.contentEquals("Gemini")&& horoscope.contentEquals("Aquarius")))
		{
			System.out.println("85% Match");
		}
		if(horoscope2.contentEquals("Aquarius")&& horoscope.contentEquals("Cancer") || (horoscope2.contentEquals("Cancer")&& horoscope.contentEquals("Aquarius")))
		{
			System.out.println("27% Match");
		}
		if(horoscope2.contentEquals("Aquarius")&& horoscope.contentEquals("Leo") || (horoscope2.contentEquals("Leo")&& horoscope.contentEquals("Aquarius")))
		{
			System.out.println("68% Match");
		}
		if(horoscope2.contentEquals("Aquarius")&& horoscope.contentEquals("Virgo") || (horoscope2.contentEquals("Virgo")&& horoscope.contentEquals("Aquarius")))
		{
			System.out.println("30% Match");
		}
		if(horoscope2.contentEquals("Aquarius")&& horoscope.contentEquals("Libra") || (horoscope2.contentEquals("Libra")&& horoscope.contentEquals("Aquarius")))
		{
			System.out.println("90% Match");
		}
		if(horoscope2.contentEquals("Aquarius")&& horoscope.contentEquals("Scorpio") || (horoscope2.contentEquals("Scorpio")&& horoscope.contentEquals("Aquarius")))
		{
			System.out.println("73% Match");
		}
		if(horoscope2.contentEquals("Aquarius")&& horoscope.contentEquals("Sagittarius")|| (horoscope2.contentEquals("Sagittarius")&& horoscope.contentEquals("Aquarius")))
		{
			System.out.println("90% Match");
		}
		if(horoscope2.contentEquals("Aquarius")&& horoscope.contentEquals("Capricorn") || (horoscope2.contentEquals("Capricorn")&& horoscope.contentEquals("Aquarius")))
		{
			System.out.println("68% Match");
		}
		
		//Pisces Calculations
		
		if(horoscope2.contentEquals("Pisces")&& horoscope.contentEquals("Pisces"))
		{
			System.out.println("60% Match");
		}
		if(horoscope2.contentEquals("Pisces")&& horoscope.contentEquals("Aries")|| (horoscope2.contentEquals("Aries")&& horoscope.contentEquals("Pisces")))
		{
			System.out.println("67% Match");
		}
		if(horoscope2.contentEquals("Pisces")&& horoscope.contentEquals("Taurus") || (horoscope2.contentEquals("Taurus")&& horoscope.contentEquals("Pisces")))
		{
			System.out.println("85% Match");
		}
		if(horoscope2.contentEquals("Pisces")&& horoscope.contentEquals("Gemini") || (horoscope2.contentEquals("Gemini")&& horoscope.contentEquals("Pisces")))
		{
			System.out.println("53% Match");
		}
		if(horoscope2.contentEquals("Pisces")&& horoscope.contentEquals("Cancer") || (horoscope2.contentEquals("Cancer")&& horoscope.contentEquals("Pisces")))
		{
			System.out.println("98% Match");
		}
		if(horoscope2.contentEquals("Pisces")&& horoscope.contentEquals("Leo") || (horoscope2.contentEquals("Leo")&& horoscope.contentEquals("Pisces")))
		{
			System.out.println("38% Match");
		}
		if(horoscope2.contentEquals("Pisces")&& horoscope.contentEquals("Virgo") || (horoscope2.contentEquals("Virgo")&& horoscope.contentEquals("Pisces")))
		{
			System.out.println("88% Match");
		}
		if(horoscope2.contentEquals("Pisces")&& horoscope.contentEquals("Libra") || (horoscope2.contentEquals("Libra")&& horoscope.contentEquals("Pisces")))
		{
			System.out.println("88% Match");
		}
		if(horoscope2.contentEquals("Pisces")&& horoscope.contentEquals("Scorpio") || (horoscope2.contentEquals("Scorpio")&& horoscope.contentEquals("Pisces")))
		{
			System.out.println("97% Match");
		}
		if(horoscope2.contentEquals("Pisces")&& horoscope.contentEquals("Sagittarius") || (horoscope2.contentEquals("Sagittarius")&& horoscope.contentEquals("Pisces")))
		{
			System.out.println("63% Match");
		}
		if(horoscope2.contentEquals("Pisces")&& horoscope.contentEquals("Capricorn") || (horoscope2.contentEquals("Capricorn")&& horoscope.contentEquals("Pisces")))
		{
			System.out.println("88% Match");
		}
		
		//Aries Calculations
		
		if(horoscope2.contentEquals("Aries")&& horoscope.contentEquals("Aries"))
		{
			System.out.println("50% Match");
		}
		if(horoscope2.contentEquals("Aries")&& horoscope.contentEquals("Taurus") || (horoscope2.contentEquals("Taurus")&& horoscope.contentEquals("Aries")))
		{
			System.out.println("38% Match");
		}
		if(horoscope2.contentEquals("Aries")&& horoscope.contentEquals("Gemini") || (horoscope2.contentEquals("Gemini")&& horoscope.contentEquals("Aries")))
		{
			System.out.println("83% Match");
		}
		if(horoscope2.contentEquals("Aries")&& horoscope.contentEquals("Cancer") || (horoscope2.contentEquals("Cancer")&& horoscope.contentEquals("Aries")))
		{
			System.out.println("42% Match");
		}
		if(horoscope2.contentEquals("Aries")&& horoscope.contentEquals("Leo") || (horoscope2.contentEquals("Leo")&& horoscope.contentEquals("Aries")))
		{
			System.out.println("97% Match");
		}
		if(horoscope2.contentEquals("Aries")&& horoscope.contentEquals("Virgo") || (horoscope2.contentEquals("Virgo")&& horoscope.contentEquals("Aries")))
		{
			System.out.println("63% Match");
		}
		if(horoscope2.contentEquals("Aries")&& horoscope.contentEquals("Libra") || (horoscope2.contentEquals("Libra")&& horoscope.contentEquals("Aries")))
		{
			System.out.println("85% Match");
		}
		if(horoscope2.contentEquals("Aries")&& horoscope.contentEquals("Scorpio") || (horoscope2.contentEquals("Scorpio")&& horoscope.contentEquals("Aries")))
		{
			System.out.println("50% Match");
		}
		if(horoscope2.contentEquals("Aries")&& horoscope.contentEquals("Sagittarius") || (horoscope2.contentEquals("Sagittarius")&& horoscope.contentEquals("Aries")))
		{
			System.out.println("93% Match");
		}
		if(horoscope2.contentEquals("Aries")&& horoscope.contentEquals("Capricorn") || (horoscope2.contentEquals("Capricorn")&& horoscope.contentEquals("Aries")))
		{
			System.out.println("47% Match");
		}
		
		//Taurus Calculations
		
		if(horoscope2.contentEquals("Taurus")&& horoscope.contentEquals("Taurus"))
		{
			System.out.println("65% Match");
		}
		if(horoscope2.contentEquals("Taurus")&& horoscope.contentEquals("Gemini") || (horoscope2.contentEquals("Gemini")&& horoscope.contentEquals("Taurus")))
		{
			System.out.println("33% Match");
		}
		if(horoscope2.contentEquals("Taurus")&& horoscope.contentEquals("Cancer") || (horoscope2.contentEquals("Cancer")&& horoscope.contentEquals("Taurus")))
		{
			System.out.println("97% Match");
		}
		if(horoscope2.contentEquals("Taurus")&& horoscope.contentEquals("Leo") || (horoscope2.contentEquals("Leo")&& horoscope.contentEquals("Taurus")))
		{
			System.out.println("73% Match");
		}
		if(horoscope2.contentEquals("Taurus")&& horoscope.contentEquals("Virgo") || (horoscope2.contentEquals("Virgo")&& horoscope.contentEquals("Taurus")))
		{
			System.out.println("90% Match");
		}
		if(horoscope2.contentEquals("Taurus")&& horoscope.contentEquals("Libra") || (horoscope2.contentEquals("Libra")&& horoscope.contentEquals("Taurus")))
		{
			System.out.println("65% Match");
		}
		if(horoscope2.contentEquals("Taurus")&& horoscope.contentEquals("Scorpio") || (horoscope2.contentEquals("Scorpio")&& horoscope.contentEquals("Taurus")))
		{
			System.out.println("88% Match");
		}
		if(horoscope2.contentEquals("Taurus")&& horoscope.contentEquals("Sagittarius") || (horoscope2.contentEquals("Sagittarius")&& horoscope.contentEquals("Taurus")))
		{
			System.out.println("30% Match");
		}
		if(horoscope2.contentEquals("Taurus")&& horoscope.contentEquals("Capricorn") || (horoscope2.contentEquals("Capricorn")&& horoscope.contentEquals("Taurus")))
		{
			System.out.println("98% Match");
		}
		
		//Gemini Calculations
		
		if(horoscope2.contentEquals("Gemini")&& horoscope.contentEquals("Gemini"))
		{
			System.out.println("60% Match");
		}
		if(horoscope2.contentEquals("Gemini")&& horoscope.contentEquals("Cancer") || (horoscope2.contentEquals("Cancer")&& horoscope.contentEquals("Gemini")))
		{
			System.out.println("65% Match");
		}
		if(horoscope2.contentEquals("Gemini")&& horoscope.contentEquals("Leo") || (horoscope2.contentEquals("Leo")&& horoscope.contentEquals("Gemini")))
		{
			System.out.println("88% Match");
		}
		if(horoscope2.contentEquals("Gemini")&& horoscope.contentEquals("Virgo") || (horoscope2.contentEquals("Virgo")&& horoscope.contentEquals("Gemini")))
		{
			System.out.println("68% Match");
		}
		if(horoscope2.contentEquals("Gemini")&& horoscope.contentEquals("Libra") || (horoscope2.contentEquals("Libra")&& horoscope.contentEquals("Gemini")))
		{
			System.out.println("93% Match");
		}
		if(horoscope2.contentEquals("Gemini")&& horoscope.contentEquals("Scorpio") || (horoscope2.contentEquals("Scorpio")&& horoscope.contentEquals("Gemini")))
		{
			System.out.println("28% Match");
		}
		if(horoscope2.contentEquals("Gemini")&& horoscope.contentEquals("Sagittarius") || (horoscope2.contentEquals("Sagittarius")&& horoscope.contentEquals("Gemini")))
		{
			System.out.println("60% Match");
		}
		if(horoscope2.contentEquals("Gemini")&& horoscope.contentEquals("Capricorn") || (horoscope2.contentEquals("Sagittarius")&& horoscope.contentEquals("Gemini")))
		{
			System.out.println("68% Match");
		}
		
		//Cancer Calculations
		
		if(horoscope2.contentEquals("Cancer")&& horoscope.contentEquals("Cancer"))
		{
			System.out.println("75% Match");
		}
		if(horoscope2.contentEquals("Cancer")&& horoscope.contentEquals("Leo") || (horoscope2.contentEquals("Leo")&& horoscope.contentEquals("Cancer")))
		{
			System.out.println("35% Match");
		}
		if(horoscope2.contentEquals("Cancer")&& horoscope.contentEquals("Virgo") || (horoscope2.contentEquals("Virgo")&& horoscope.contentEquals("Cancer")))
		{
			System.out.println("90% Match");
		}
		if(horoscope2.contentEquals("Cancer")&& horoscope.contentEquals("Libra") || (horoscope2.contentEquals("Libra")&& horoscope.contentEquals("Cancer")))
		{
			System.out.println("43% Match");
		}
		if(horoscope2.contentEquals("Cancer")&& horoscope.contentEquals("Scorpio") || (horoscope2.contentEquals("Scorpio")&& horoscope.contentEquals("Cancer")))
		{
			System.out.println("94% Match");
		}
		if(horoscope2.contentEquals("Cancer")&& horoscope.contentEquals("Sagittarius") || (horoscope2.contentEquals("Sagittarius")&& horoscope.contentEquals("Cancer")))
		{
			System.out.println("53% Match");
		}
		if(horoscope2.contentEquals("Cancer")&& horoscope.contentEquals("Capricorn") || (horoscope2.contentEquals("Capricorn")&& horoscope.contentEquals("Cancer")))
		{
			System.out.println("83% Match");
		}
		
		//Leo Calcultaions
		
		if(horoscope2.contentEquals("Leo")&& horoscope.contentEquals("Leo"))
		{
			System.out.println("45% Match");
		}
		if(horoscope2.contentEquals("Leo")&& horoscope.contentEquals("Virgo") || (horoscope2.contentEquals("Virgo")&& horoscope.contentEquals("Leo")))
		{
			System.out.println("35% Match");
		}
		if(horoscope2.contentEquals("Leo")&& horoscope.contentEquals("Libra") || (horoscope2.contentEquals("Libra")&& horoscope.contentEquals("Leo")))
		{
			System.out.println("97% Match");
		}
		if(horoscope2.contentEquals("Leo")&& horoscope.contentEquals("Scorpio") || (horoscope2.contentEquals("Scorpio")&& horoscope.contentEquals("Leo")))
		{
			System.out.println("58% Match");
		}
		if(horoscope2.contentEquals("Leo")&& horoscope.contentEquals("Sagittarius") || (horoscope2.contentEquals("Sagittarius")&& horoscope.contentEquals("Leo")))
		{
			System.out.println("93% Match");
		}
		if(horoscope2.contentEquals("Leo")&& horoscope.contentEquals("Capricorn") || (horoscope2.contentEquals("Capricorn")&& horoscope.contentEquals("Leo")))
		{
			System.out.println("35% Match");
		}
		
		//Virgo Calculations
		
		if(horoscope2.contentEquals("Virgo")&& horoscope.contentEquals("Virgo"))
		{
			System.out.println("65% Match");
		}
		if(horoscope2.contentEquals("Virgo")&& horoscope.contentEquals("Libra") || (horoscope2.contentEquals("Libra")&& horoscope.contentEquals("Virgo")))
		{
			System.out.println("68% Match");
		}
		if(horoscope2.contentEquals("Virgo")&& horoscope.contentEquals("Scorpio") || (horoscope2.contentEquals("Scorpio")&& horoscope.contentEquals("Virgo")))
		{
			System.out.println("88% Match");
		}
		if(horoscope2.contentEquals("Virgo")&& horoscope.contentEquals("Sagittarius") || (horoscope2.contentEquals("Sagittarius")&& horoscope.contentEquals("Virgo")))
		{
			System.out.println("48% Match");
		}
		if(horoscope2.contentEquals("Virgo")&& horoscope.contentEquals("Capricorn") || (horoscope2.contentEquals("Capricorn")&& horoscope.contentEquals("Virgo")))
		{
			System.out.println("95% Match");
		}
		
		//Libra Calculations
		
		if(horoscope2.contentEquals("Libra")&& horoscope.contentEquals("Libra"))
		{
			System.out.println("75% Match");
		}
		if(horoscope2.contentEquals("Libra")&& horoscope.contentEquals("Scorpio") || (horoscope2.contentEquals("Scorpio")&& horoscope.contentEquals("Libra")))
		{
			System.out.println("35% Match");
		}
		if(horoscope2.contentEquals("Libra")&& horoscope.contentEquals("Sagittarius") || (horoscope2.contentEquals("Sagittarius")&& horoscope.contentEquals("Libra")))
		{
			System.out.println("73% Match");
		}
		if(horoscope2.contentEquals("Libra")&& horoscope.contentEquals("Capricorn") || (horoscope2.contentEquals("Capricorn")&& horoscope.contentEquals("Libra")))
		{
			System.out.println("55% Match");
		}
		
		//Scorpio Calculations
		
		if(horoscope2.contentEquals("Scorpio")&& horoscope.contentEquals("Scorpio"))
		{
			System.out.println("80% Match");
		}
		if(horoscope2.contentEquals("Scorpio")&& horoscope.contentEquals("Sagittarius") || (horoscope2.contentEquals("Sagittarius")&& horoscope.contentEquals("Scorpio")))
		{
			System.out.println("28% Match");
		}
		if(horoscope2.contentEquals("Scorpio")&& horoscope.contentEquals("Capricorn") || (horoscope2.contentEquals("Capricorn")&& horoscope.contentEquals("Scorpio")))
		{
			System.out.println("95% Match");
		}
		
		//Sagittarius Calculations
		
		if(horoscope2.contentEquals("Sagittarius")&& horoscope.contentEquals("Sagittarius"))
		{
			System.out.println("45% Match");
		}
		if(horoscope2.contentEquals("Sagittarius")&& horoscope.contentEquals("Capricorn") || (horoscope2.contentEquals("Capricorn")&& horoscope.contentEquals("Sagittarius")))
		{
			System.out.println("60% Match");
		}
		 //Capricorn Calculations
		
		if(horoscope2.contentEquals("Capricorn")&& horoscope.contentEquals("Capricorn"))
		{
			System.out.println("75% Match");
		}
	}
}

