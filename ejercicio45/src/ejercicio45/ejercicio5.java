package ejercicio45;

public class ejercicio5 {
	public static void main(String[] args) {
		int A=3,B=4,C=5,D=6,TEMP=0;
		//necesitamos una variable mas aparte de A,B,C,D para no perder ningún dato.
		System.out.println(A+" "+B+" "+C+" "+D);
		TEMP = B;
		B = C;
		C = A;
		A = D;
		D = TEMP;
		System.out.println(D);		
	}

}
