package javaTutorial;

public class calspeed {

	public static void main(String[] args) {
	 int Distanceinkm=5;

	 int Timeinhours=2;
	 int Timeinminutes=30;
	 int Timeinseconds=30;
	 double Distanceinmeters =Distanceinkm *1000.0;
	 double Distanceinmiles = Distanceinkm * 0.62137;
	 
	 double TotalTimeinhours= Timeinhours+(Timeinminutes/60.0)+(Timeinseconds/3600);
	 double TotalTimeinseconds= Timeinseconds+(Timeinhours*3600)+(Timeinminutes * 60);
	 double Speedinmeters = Distanceinmeters/TotalTimeinseconds;
	 double Speedinkm=Distanceinkm/TotalTimeinhours;
	 double Speedinmiles=Distanceinmiles/TotalTimeinhours;
	 System.out.println("Speedinmeters ="+Speedinmeters +"\n"+"Speedinkm = " +Speedinkm+ "\n"+"Speed in MPh ="+Speedinmiles);
	 		
	 		
	 
	 

	}

}
