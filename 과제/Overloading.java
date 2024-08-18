public class Main {
	
	public int add(int a, int b) {
		return a + b;
	}
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	public double add(double a, double b) {
		return a + b;
	}
	
    public static void main(String[] args) {
    	Main a = new Main();
    	
        System.out.println(a.add(1,2));
        System.out.println(a.add(1,2,3));
        System.out.println(a.add(1.1,2.2));
    }
}

