import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImprovementPool {
	private List<Improvement> Pool = new ArrayList<Improvement>();
	
	public ImprovementPool(){
		this.fillPool();
	}
	
	private void fillPool() {
		try {BufferedReader in = new BufferedReader(new FileReader("Improvements.csv"));
		String s;
		in.readLine();//ditch the header line
	    
			while ((s = in.readLine()) != null) {
				//tee road jms alamklassidelisamise ka siia
				if (s.split("\t")[0].equalsIgnoreCase("road")){Pool.add(road.newRoad(s));}
				else{   Pool.add(Improvement.newImprovement(s));}
			        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  List<Improvement> getbuildableimprovements(TerrainType t){
		//loobi pool ja vaata mis on buildable osas olemas
		ArrayList<Improvement> list = new ArrayList();
		for (Improvement i:Pool){
			List<TerrainType> l=i.getBuildableterrains();
			for (TerrainType ty: l){
				if (ty==t){
					list.add(i);
				}
			}
			
		}
		return list;
	}
	
	
}