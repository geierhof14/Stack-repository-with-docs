package at.fhj.itm;

public class Test {

	public static void main(String[] args) {
		
		StringStack stack = new StringStack(4);
		
		System.out.println(stack.isEmpty());
		stack.push("1 Bier");
		stack.push("2 Bier");
		stack.push("3 Bier");
		stack.push("4 Bier");
		
		stack.pop();
		stack.pop();
		stack.push("Save water");
		stack.push("drink beer!!!");
	}
}
