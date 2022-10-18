
public class ElectrcityBill {
	int meterno;
	String name;
	String address;
	public int getMeterno() {
		return meterno;
	}
	public void setMeterno(int meterno) {
		this.meterno = meterno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "ElectrcityBill information"+"meterno:"+this.meterno+"name:"+this.name+"address"+this.address;
	} 
	
	@Override
	public boolean equals(Object obj) {
		ElectrcityBill electrcityBill = (ElectrcityBill) obj;
		if(electrcityBill.getMeterno()==this.meterno && electrcityBill.getName().equals(this.name) && electrcityBill.getAddress().equals(this.address))  {
			return true;
		}
			else
				
			return false;
		}
	
	@Override
	public int hashCode() {
		return meterno;
		
	}
		
	}



