
public class fibonacii {
public static void main(String[] args) {
	int a=0;
	int b = 1;
	
	for (int i = 0; i < 13; i++) {
	

int temp=a+b;
a=b;
b=temp;
		
		System.out.println(a + b);
	}
}
}
