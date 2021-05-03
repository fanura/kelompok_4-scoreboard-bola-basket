public class Project1 {
	private int nilai1, nilai2;
	
	Project1(){
		nilai1 = 0;
		nilai2 = 0;
	}
	
	Project1(int a, int b){
		nilai1 = a;
		nilai2 = b;
	}
	
	void setNilai1(){
		nilai1 += 1;
	}
	
	void setNilai1(int n){
		nilai1 += n;
	}
	
	void setNilai2(){
		nilai2 += 1;
	}
	
	void setNilai2(int n){
		nilai2 += n;
	}
	
	int getNilai1(){
		return nilai1;
	}
	
	int getNilai2(){
		return nilai2;
	}
	
	void reset(){
		nilai1 = 0;
		nilai2 = 0;
	}
	
	String pesan(){
		String xyz = "\t           !!! GOAL !!!\n";
		return xyz;
	}
}