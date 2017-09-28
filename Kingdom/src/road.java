import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class road extends Improvement {

	public road(String t, int stab, int loy, int e, int c, int d, int b,
			int co, int ma, List<TerrainType> list) {
		super(t, stab, loy, e, c, d, b, co, ma, list);
		// TODO Auto-generated constructor stub
	}
	
	
    public static road newRoad(String line){
    	
        String[] tokens = line.split("\t");
        String[] terrainstrings= tokens[tokens.length-1].split(",");
        List<Integer> bonus = new ArrayList<Integer>();
        for (String s:Arrays.copyOfRange(tokens, 1, tokens.length-1)){
        	bonus.add(Integer.parseInt(s));
        }
        
        List<TerrainType> terrains = new ArrayList<TerrainType>();
        for (String s: terrainstrings){
        	terrains.add(TerrainType.valueOf(s));
        }
    	return new road(tokens[0],bonus.get(0),bonus.get(1),bonus.get(2),bonus.get(3),bonus.get(4),
    			bonus.get(5),bonus.get(6),bonus.get(7),terrains);
    }
    
    
	
	public int getCost(TerrainType t) {
		if (t==TerrainType.PLAINS){
			return 1;
		}
		if (t==TerrainType.FOREST){
			return 2;
		}
		if (t==TerrainType.HILL){
			return 3;
		}
		return 4;
	}

}
