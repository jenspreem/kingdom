import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {

		Controller c = new Controller();
		MapSqr m = new MapSqr(TerrainType.FOREST);

		ImprovementPool i = new ImprovementPool();
		c.checkbuildableimps(m);
		c.buildImprovement(m, i.getbuildableimprovements(TerrainType.FOREST).get(0));
		System.out.println(m.getImprovements().get(0).getCost(TerrainType.HILL));
		

	}

}

