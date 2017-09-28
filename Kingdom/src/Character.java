
public class Character extends AbstractCharacter {

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getStre() {
		return stre;
	}

	@Override
	public void setStre(int stre) {
		this.stre=stre;
	}

	@Override
	public int getCha() {
		return cha;
	}

	@Override
	public void setCha(int cha) {
		this.cha=cha;
	}

	@Override
	public int getDex() {
		return dex;
	}

	@Override
	public void setDex(int dex) {
		this.dex=dex;
	}

	@Override
	public int getIntel() {
		return intel;
	}

	@Override
	public void setIntel(int intel) {
		this.intel=intel;
	}

	@Override
	public int getWis() {
		return wis;
	}

	@Override
	public void setWis(int wis) {
		this.wis=wis;
	}

	@Override
	public int getCon() {
		return con;
	}

	@Override
	public void setCon(int con) {
		this.con=con;
		
	}

	@Override
	public void setName(String name) {
		this.name=name;
	}
	
	

}
