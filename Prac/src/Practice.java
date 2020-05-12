public class Practice {
	public String name;
	public double score;
	
	public void set_data(String n, double s) {
		name=n;
		score=s;
	}
	
	public void copy(Practice b) {
		b=this;
	}
	
	public static void main(String[] args) {
		Practice e1=new Practice();
		e1.set_data("e1",100);

		Practice e2=new Practice();
		e2.set_data("e2",50);
		
		
		e1.copy(e2);
		System.out.println(e1.name+e1.score+"/"+e2.name+e2.score);
		
	}

}
