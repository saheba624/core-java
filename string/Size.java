package com.string;

public class Size {
	public static void main(String[] args) {
		int size=args.length;
switch (size) {
case 0:System.out.println("usage java helloall n1 n2 n3....");
break;
case 1:System.out.println("Hello"+args[0]);
break;
default:
	for(int i=0; i<size; i++);
	System.out.println(size + " = Hello" + args[size]);
}
	}

}
