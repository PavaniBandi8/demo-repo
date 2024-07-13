class Simple{ 
	//primitive data types 
	byte b = 1; //-127 t0 128
	short s = 2; //
        int i = 5;   //-32655 to 32656
	long l = 10; //
        float f = 10.5f;  //
	double d = 20.6;   //
	char ch = 's';
	boolean bo = false;  //true or false

	static int i1 = 5;   //-32655 to 32656
	static long l1 = 10;
        static int bs = 500;

	
	public static void m1(){  
          System.out.println("static variable" + " " + l1); 
	 
        } 
	public static void m2(){ 
	   byte bs = 105; 	   
	   short s2 = 20;
          System.out.println("local variable addition:" + bs);
	  m1(); 
        } 
	public void m3(){
	  System.out.println("instace variable" + " " + b);
        }	  



    public static void main(String args[]){  
     System.out.println("Hello Java"); 
	Simple simple = new Simple();
	System.out.println("instance variable" + " " + simple.i);
        System.out.println("static variable " + " " + bs); 

	m1();
	m2();
	simple.m3();

	
    }  
}  