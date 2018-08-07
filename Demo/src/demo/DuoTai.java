package demo;

public class DuoTai {
	public static void main(String[] args) {
		A a1 = new A();  
        A a2 = new B();  
        B b = new B();  
        C c = new C();   
        D d = new D(); 
//        E e = new E();
        System.out.println(a1.show(b));     
        System.out.println(a1.show(c));     
        System.out.println(a1.show(d));     
        System.out.println(a2.show(b));     
        System.out.println(a2.show(c));    
        System.out.println(a2.show(d));
//        System.out.println(a2.show(e));
        System.out.println(b.show(b));     
        System.out.println(b.show(c));     
        System.out.println(b.show(d)); 
//        System.out.println(b.show(e));
	}
}
 
class A {  
     public String show(D obj){  
            return ("A and D");  
     }   
     public String show(A obj){  
            return ("A and A");  
     }   
}   
class B extends A{  
     public String show(B obj){  
            return ("B and B");  
     }  
     public String show(A obj){  
            return ("B and A");  
     }
     public String show(E obj){  
         return ("E and E");  
  }
}  
class C extends B{	}   
class D extends B{  }  
class E {}