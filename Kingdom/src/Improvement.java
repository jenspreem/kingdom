import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Improvement {
	
	private String name;
	private boolean isMajor;
	private int Stability;
	private int Loyalty;
	private int Econ;
	private int Consumption;
	private int Defence;
	private int BP;
	private int cost;
	private List<TerrainType> buildableterrains;
	
	
    public Improvement(String t,int stab,int loy,int e,int c, int d,int b,int co, int ma, List<TerrainType> list) {
    	this.name=t;
        this.Stability = stab;
        this.Loyalty = loy;
        this.Econ = e;
        this.Consumption=c;
        this.Defence=d;
        this.BP=b;
        this.cost=co;
        this.buildableterrains=list;
        if (ma==0){
        	this.isMajor=false;
        }
        else {
        	this.isMajor=true;
        }
    }
    
    public static Improvement newImprovement(String line){
    	
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
    	return new Improvement(tokens[0],bonus.get(0),bonus.get(1),bonus.get(2),bonus.get(3),bonus.get(4),
    			bonus.get(5),bonus.get(6),bonus.get(7),terrains);
    }

	public String getName() {
		return name;
	}

	public int getStability() {
		return Stability;
	}

	public int getLoyalty() {
		return Loyalty;
	}

	public int getEcon() {
		return Econ;
	}

	public int getConsumption() {
		return Consumption;
	}

	public int getDefence() {
		return Defence;
	}

	public int getBP() {
		return BP;
	}
//we should not get cost without knowing the terrain it is built on
	private int getCost() {
		return cost;
	}
	
	public int getCost(TerrainType t) {
		return cost;
	}

	public List<TerrainType> getBuildableterrains() {
		return buildableterrains;
	}

	public boolean isMajor() {
		return isMajor;
	}
    

}
