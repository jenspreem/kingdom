public abstract class AbstractCharacter 
{
	protected String name;
	protected int stre,cha,dex,intel,wis,con; 
	
	public abstract boolean isNil();
	
	public abstract String getName();
	public abstract int getStre();
	public abstract void setStre(int stre);
	public abstract int getCha();	
	public abstract void setCha(int cha);
	public abstract int getDex();
	public abstract void setDex(int dex) ;
	public abstract int getIntel() ;
	public abstract void setIntel(int intel) ;
	public abstract int getWis() ;	
	public abstract void setWis(int wis) ;	
	public abstract int getCon() ;	
	public abstract void setCon(int con) ;
	public abstract void setName(String name) ;
	
}
	   


