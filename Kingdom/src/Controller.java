public class Controller {
	
	ImprovementPool improvementpool = new ImprovementPool();
	kingdom kingdom = new kingdom();
	WorldMap worldmap = new WorldMap();
	
	public void checkbuildableimps(MapSqr m){
		System.out.println(improvementpool.getbuildableimprovements(m.getTerrain()));
	}
	
	public void buildImprovement(MapSqr m, Improvement i){
		m.addImprovement(i);
		//rem cost from kingdom
		kingdom.setBP(kingdom.getBP()-i.getCost(m.getTerrain()));
	}

	
}
