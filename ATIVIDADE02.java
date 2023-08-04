import java.util.Scanner;

public class ATIVIDADE02 {

	public static void main(String[] args) {
		// TODO Stub de mÈtodo gerado automaticamente
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Infome a ab: ");
		double ab = s.nextDouble();
		
		System.out.print("Infome a h: ");
		double h = s.nextDouble();
		
		double Area = Math.pow(h, 2) + Math.pow(ab, 2);
		
		double a1 = Math.sqrt(Area);
		
		double AreaTriangulo = ((ab * 2) * a1) / 2;
		
		double AreaBase = (ab * 2) * (ab * 2);
		
		double AreaTotal = (AreaTriangulo * 4) + AreaBase;
		
		System.out.print("Escolha o Tipo de Tinta: ");
		
			int tipo = s.nextInt();
		
			double valor = 0;
		
			if (tipo == 1) {
			
				valor = 127.90;
			
			}else if (tipo == 2) {
			
				valor = 258.98;
			
			}else if (tipo == 3) {
			
				valor = 344.34;
			}
		
		double Litro = AreaTotal /4.76; 
		
		double Peso = Litro / 18;
		
		int Lata = (int) Math.ceil(Peso);
		
		double Valor = Lata * valor;
		
		double Volume = (AreaBase/3) * h;
		
		System.out.print("\nBase È:              " + ab);
		System.out.print("\nAltura È:            " + h);
		System.out.print("\na1 È:                " + a1);
		System.out.print("\n¡rea do Tri‚ngulo È: " + AreaTriangulo);
		System.out.print("\n¡rea da Base: È:     " + AreaBase);
		System.out.print("\n¡rea Total: È:       " + AreaTotal);
		System.out.print("\nTipo de Tinta È:     " + tipo);
		System.out.print("\nLitro È:             " + Litro);
		System.out.print("\nLatas È:              " + Lata);
		System.out.print("\nPreÁo È:             " + Valor);
		System.out.print("\nVolume È:            " + Volume);
		
		s.close();
	}

}
