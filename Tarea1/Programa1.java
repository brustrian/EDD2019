	
public class Programa1{

	public static int diacero;

	public static void main(String[] args){
		
		while(true){

			String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
			int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

			System.out.println("Escribe el dia:");
			int dia = Integer.parseInt(System.console().readLine());
			System.out.println("Escribe el mes:");
			int mes = Integer.parseInt(System.console().readLine());
			System.out.println("Escribe el año:");
			int anio = Integer.parseInt(System.console().readLine());

			diacero = 5;

			for (int i=1700; i < anio; i++) {
				if(i%4==0 && !Integer.toString(i).substring(2,4).equals("00")){
					sumar(2);
				}else{
					sumar(1);
				}
			}

			if(anio%4==0 && !Integer.toString(anio).substring(2,4).equals("00")){
				meses[1] = 29;
			}else{
				meses[1] = 28;
			}

			for (int i=1; i < mes; i++) {
				sumar(meses[i] - 28);
			}

			for (int i=1; i <= dia; i++) {
				sumar(1);
			}

			System.out.println("Dia: " + dias[diacero - 1]);

		}

	}

	public static void sumar(int sum){
		int aux = diacero + sum;
		if(aux > 7){
			diacero = aux - 7;
		}else{
			diacero = aux;
		}
	}

}