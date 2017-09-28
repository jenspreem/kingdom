import java.util.ArrayList;
import java.util.List;


public class MapSqr {
	

private Pair<Integer,Integer> coordinates = Pair.of(0,0);  
private TerrainType terrain;

private boolean isFreshCoast;
private boolean isSaltCoast;
private boolean hasRiver;
private boolean hasRoad;
private boolean hasMajorImpAlready;


private int Defence;

private int BP;
private int Consumption;
private int Econ;
private int Loyalty;
private int Stability;

private List<Improvement> Improvements = new ArrayList<Improvement>();

public MapSqr(TerrainType t){
	this.terrain=t;
	
}

public Pair<Integer, Integer> getCoordinates() {
	return coordinates;
}

public void setCoordinates(Pair<Integer, Integer> coordinates) {
	this.coordinates = coordinates;
}

public TerrainType getTerrain() {
	return terrain;
}

public void setTerrain(TerrainType terrain) {
	this.terrain = terrain;
}

public boolean isFreshCoast() {
	return isFreshCoast;
}

public void setFreshCoast(boolean isFreshCoast) {
	this.isFreshCoast = isFreshCoast;
}

public boolean isSaltCoast() {
	return isSaltCoast;
}

public void setSaltCoast(boolean isSaltCoast) {
	this.isSaltCoast = isSaltCoast;
}

public boolean isHasRiver() {
	return hasRiver;
}

public void setHasRiver(boolean hasRiver) {
	this.hasRiver = hasRiver;
}

public boolean isHasRoad() {
	return hasRoad;
}

public void setHasRoad(boolean hasRoad) {
	this.hasRoad = hasRoad;
}

public boolean isHasMajorImpAlready() {
	return hasMajorImpAlready;
}

public void setHasMajorImpAlready(boolean hasMajorImpAlready) {
	this.hasMajorImpAlready = hasMajorImpAlready;
}

public int getDefence() {
	return Defence;
}

public void setDefence(int defence) {
	Defence = defence;
}

public int getBP() {
	return BP;
}

public void setBP(int bP) {
	BP = bP;
}

public int getConsumption() {
	return Consumption;
}

public void setConsumption(int consumption) {
	Consumption = consumption;
}

public int getEcon() {
	return Econ;
}

public void setEcon(int econ) {
	Econ = econ;
}

public int getLoyalty() {
	return Loyalty;
}

public void setLoyalty(int loyalty) {
	Loyalty = loyalty;
}

public int getStability() {
	return Stability;
}

public void setStability(int stability) {
	Stability = stability;
}

public List<Improvement> getImprovements() {
	return Improvements;
}

public void setImprovements(List<Improvement> improvements) {
	Improvements = improvements;
}

public void addImprovement(Improvement i){
	this.Improvements.add(i);
}




}
