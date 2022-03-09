class SwitchDemo{
	public static void main(String []args){
		
		checkWeather("rainy");
	//heckWeather("sunny");
	//kWeather("cloudy");
		//eckWeather("kkh");
	}
	
	static void checkWeather(String weather){
		switch(weather){
			case "rainy":
			System.out.println("It's raining. Take umbrella...");
			break;
			case "sunny":
			System.out.println("too hot..");
			break;
			case "cloudy":
			System.out.println("It's dark..");
			break;
			default:
			System.out.println("I have nothing to say..");
			break;
		}
		System.out.println("Program Terminate");
		System.out.println();
	}
}