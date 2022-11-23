package zadaca5;

public class Brod extends Transport {
		double potrosuvackanafta;
		double cenanafta;
		
		public Brod(double tezina, int dolzina,double potrosuvackanafta,double cenanafta) {
			super(tezina,dolzina);
			this.potrosuvackanafta = potrosuvackanafta;
			this.cenanafta = cenanafta;
		}
		
		public double Cena() {
			return dolzina*potrosuvackanafta*cenanafta;
		}
}
