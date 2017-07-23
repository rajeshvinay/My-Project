interface  BankInterest
{
	
	 void setRateOfInterst(int rateOfInterst);
	 void getRateOfInterst();
}
class SBI implements  BankInterest
{
	int rateOfInterst;
	public void setRateOfInterst(int rateOfInterst)
{
		this.rateOfInterst=rateOfInterst;
	}	
	public void getRateOfInterst(){
		System.out.println("The SBI rate of interst is "+rateOfInterst);
	}
}
class BOI implements  BankInterest
{
	int rateOfInterst;
	public void setRateOfInterst(int rateOfInterst)
{
		this.rateOfInterst=rateOfInterst;
	}
	public void getRateOfInterst()
{
		System.out.println("BOI rate of interst is "+rateOfInterst);
	}
}
class Kushi implements  BankInterest
{
	int rateOfInterst;
	public void setRateOfInterst(int rateOfInterst)
{
		this.rateOfInterst=rateOfInterst;
	}
	public void getRateOfInterst()
{
		System.out.println("Kushi rate of interst is "+rateOfInterst);
	}
}
class CtholicSyrianBank implements  BankInterest
{
	int rateOfInterst;
	public void setRateOfInterst(int Interstrate)
{
		rateOfInterst=Interstrate;
	}
	public void getRateOfInterst()
{
		System.out.println("The CtholicSyrianBank rate of interst is "+rateOfInterst);
	}
}
class UAEBank implements BankInterest
{
	int rateOfInterst;
	public void setRateOfInterst(int rate)
{
	rateOfInterst=rate;
	}
	public void getRateOfInterst()
{
	System.out.println("UAEBank Rate Of Interest is "+rateOfInterst);
	}
}
class Abb
{
	public static void main(String args[])
{
	BankInterest g;
	g=new SBI();
	g.setRateOfInterst(4);
	g.getRateOfInterst();

	g=new BOI();
	g.setRateOfInterst(2);
	g.getRateOfInterst();

	g=new Kushi();
	g.setRateOfInterst(6);
	g.getRateOfInterst();

	g=new CtholicSyrianBank();
	g.setRateOfInterst(1);
	g.getRateOfInterst();

        g=new UAEBank();
        g.setRateOfInterst(2);
        g.getRateOfInterst();
	}
}
