package entities;

public class NetSalary {
	
	public double GrossSalary;
	public double ii;
	
	public double netsalary(double tx) {
		return GrossSalary - tx;
	}
	
	
	public void incressedSalary() {
		this.GrossSalary += GrossSalary * ii / 100;
	}

}
