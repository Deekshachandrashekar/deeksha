package functionoverload;

	class FunctionOverload{
		void display(){
			  System.out.println("No argument");
			}

			void display(int i){
			   System.out.println("One  int argument");
			}
			void display(int i, int j){
			   System.out.println("two argument");
			}
			void display(float f){
			   System.out.println("one arg float argument");
			}
			void display(float i, float j){
			  System.out.println("two arg float argument");

			}

			void display(int i, float j){ 
				System.out.println("two arg int float");
			}
			void display(float i, int j){
				System.out.println("two arg float int");
			}

	}

	public class arguments {

		public static void main(String[] args) {
			FunctionOverload ob = new FunctionOverload();
			ob.display();
			ob.display(5);
			ob.display(6.7f); 
			ob.display(8.9f, 3.4f);
			ob.display(4, 8);
			ob.display(6.7f,8);
			ob.display(7,7.4f);
			
		}

	}


