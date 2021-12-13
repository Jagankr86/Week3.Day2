package AssingmentWeek3Day2;

public class Automation extends MultipleLangauge implements Language,TestTool{

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.java();
		auto.ruby();
		auto.Selenium();
		auto.python();
	}

	public void Selenium() {
		System.out.println("calling selenium from concrete class");
		
	}

	public void java() {
		System.out.println("calling JAVA from concrete class");
		
	}

	@Override
	public void ruby() {
		System.out.println("calling RUBY from concreete class");
		
	}

}
