package polimorfismo;

public class MainPol {
	public static void main(String args[])
	{
		Poli clase = new Poli();
		clase.sumar(1, 1);
		clase.sumar(10.20, 11.20);
		
		ShopC claseShop = new ShopC();
		claseShop.jeans();
		
	}
}
