package studio7;

public class Fraction {
	private int n;
	private int d;
	
	public Fraction( int n, int d) {
		this.n = n;
		this.d = d;
		
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}
	public Fraction sum(Fraction f) {
		int sameD = this.getD() * f.getD();
		int n1 = this.getD() * f.getN();
		int n2 = f.getD() * this.getN();
		int n3 = n1 + n2;
		return new Fraction(n3, sameD); 
	}
	public Fraction multiply(Fraction f) {
		int mD = this.getD() * f.getD();
		int mN = this.getN() * f.getN();
		return new Fraction(mN, mD);
	}
	
	public Fraction reciprocal () {
		return new Fraction (this.d, this.n);
	}
public static void main (String [] args) {
	
}
}
