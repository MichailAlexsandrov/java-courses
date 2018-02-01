public class Calculator {
		

		private int result;



		public void add_summ(int first,int second) {
			this.result = first + second;
			//for (Integer param : params) {
			//	this.result += param;				
			//}
		}

		public void add_sub(int first,int second) {
			this.result = first - second;			
			//for (Integer param : params) {
			//	this.result -= param;				
			//}
		}

		public void add_dif(int first,int second) {
			this.result = first / second;
			//for (Integer param : params) {
			//	this.result /= param;				
			//}
		}

		public void add_mul(int first,int second) {
			this.result = first * second;
			//for (Integer param : params) {
			//	this.result *= param;				
			//}
		}





		public int getResult() {
			return this.result;
		}


		public void cleanResult() {
			this.result = 0;
		}
}