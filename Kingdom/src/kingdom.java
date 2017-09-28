import java.util.ArrayList;
import java.util.List;


public class kingdom {
private int DC=0;

private int BP=0;
private int Consumption=0;

private int Econ=0;
private int Loyalty=0;
private int Stability=0;

private int Size=0;
private int Pop=0;
private int Unrest=0;
private List<MapSqr> CtrldMapSqrs = new ArrayList<MapSqr>();

private AbstractCharacter ruler=new NullCharacter();
private AbstractCharacter councilor=new NullCharacter();
private AbstractCharacter general=new NullCharacter();
private AbstractCharacter spymaster=new NullCharacter();
private AbstractCharacter treasurer=new NullCharacter();
private AbstractCharacter marshal=new NullCharacter();
private AbstractCharacter enforcer=new NullCharacter();
private AbstractCharacter diplomat=new NullCharacter();
private AbstractCharacter magistrate=new NullCharacter();
private AbstractCharacter highpriest=new NullCharacter();



public void getUpkeepstats()
{};

public void payUpkeep(){};

public void getTaxes()
{}




//setters and getters thereon
public int getDC() {
	return DC;
}
public void setDC(int dC) {
	DC = dC;
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
public int getSize() {
	return Size;
}
public void setSize(int size) {
	Size = size;
}
public int getPop() {
	return Pop;
}
public void setPop(int pop) {
	Pop = pop;
}
public int getUnrest() {
	return Unrest;
}
public void setUnrest(int unrest) {
	Unrest = unrest;
}
public List<MapSqr> getCtrldMapSqrs() {
	return CtrldMapSqrs;
}
public void setCtrldMapSqrs(List<MapSqr> ctrldMapSqrs) {
	CtrldMapSqrs = ctrldMapSqrs;
}
public AbstractCharacter getRuler() {
	return ruler;
}
public void setRuler(Character ruler) {
	this.ruler = ruler;
}
public AbstractCharacter getCouncilor() {
	return councilor;
}
public void setCouncilor(Character councilor) {
	this.councilor = councilor;
}
public AbstractCharacter getGeneral() {
	return general;
}
public void setGeneral(Character general) {
	this.general = general;
}
public AbstractCharacter getSpymaster() {
	return spymaster;
}
public void setSpymaster(Character spymaster) {
	this.spymaster = spymaster;
}
public AbstractCharacter getTreasurer() {
	return treasurer;
}
public void setTreasurer(Character treasurer) {
	this.treasurer = treasurer;
}
public AbstractCharacter getMarshal() {
	return marshal;
}
public void setMarshal(Character marshal) {
	this.marshal = marshal;
}
public AbstractCharacter getEnforcer() {
	return enforcer;
}
public void setEnforcer(Character enforcer) {
	this.enforcer = enforcer;
}
public AbstractCharacter getDiplomat() {
	return diplomat;
}
public void setDiplomat(Character diplomat) {
	this.diplomat = diplomat;
}
public AbstractCharacter getMagistrate() {
	return magistrate;
}
public void setMagistrate(Character magistrate) {
	this.magistrate = magistrate;
}
public AbstractCharacter getHighpriest() {
	return highpriest;
}
public void setHighpriest(AbstractCharacter highpriest) {
	this.highpriest = highpriest;
};




}
