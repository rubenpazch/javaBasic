package lesson5c;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpwardHat fg1 = new UpwardHat();
		DownwardHat fg2 = new DownwardHat();
		FaceMaker fg3 = new FaceMaker();
		Vertical fg4 = new Vertical();
		
		
		Figure[] fg  = new Figure[4];
		fg[0]=fg1;
		fg[1]=fg2;
		fg[2]=fg3;
		fg[3]=fg4;
		
		for (Figure figure : fg) {
			System.out.print(figure.getFigure());
		}
		
		System.out.println("");
		
		for (Figure figure : fg) {
			System.out.println(figure.getClass().getSimpleName() +" : "+figure.getFigure() );
		}
		
	}

}
