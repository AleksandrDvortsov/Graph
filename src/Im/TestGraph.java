package Im;

public class TestGraph {

	public static void main(String[] args) 
	{
		Graph gr = new Graph();
		String[] city = {"Kyiv", "Dnipro", "Kharkiv", "Lviv"};
		for ( int i = 0; i < city.length; i++ )
		{
			gr.addVertex(city[i]);
		}
		gr.addEdge("Dnipro", "Kharkiv", 100);
		gr.addEdge("Dnipro", "Lviv", 150);
		gr.addEdge("Lviv", "Kyiv", 250);
		gr.addEdge("Kharkiv", "Kyiv", 350);
		gr.addEdge("Dnipro", "Kyiv", 1000);
		System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("Dnipro - Kyiv");
		gr.findWay("Dnipro", "Kyiv");
		System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("Kharkiv - Lviv");
		gr.findWay("Kharkiv", "Lviv");
		System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");

	}

}
