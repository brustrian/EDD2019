import java.util.LinkedList;
	
public class Programa2{

	public static void main(String[] args){
		
		while(true){

			System.out.println("Escribe un numero:");
			int num = Integer.parseInt(System.console().readLine());

			boolean primo[] = new boolean[num+1];
			for (int i=0; i<num; i++) {
				primo[i] = true;
			}

			for (int i=2; i*i<=num; i++) {
				if(primo[i]){
					for (int j=i*2; j<=num; j+=i) {
						primo[j] = false;
					}
				}
			}

			for (int i=2; i<=num ; i++) {
				if(primo[i]){
					System.out.print(i + " ");
				}
			}

			System.out.println("");

		}

	}

}