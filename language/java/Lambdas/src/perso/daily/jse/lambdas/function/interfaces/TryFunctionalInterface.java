package perso.daily.jse.lambdas.function.interfaces;

public class TryFunctionalInterface {

	public static void execute(WorkerInterface worker) {
	    worker.doSomeWork();
	}
	
	public static void main(String[] args) {
		//Invoke doSomeWork using Anonymous class
	    execute(new WorkerInterface() {
	        @Override
	        public void doSomeWork() {
	            System.out.println("Worker invoked using Anonymous class");
	        }
	    });

	    //Invoke doSomeWork using Lambda expression 
	    execute( () -> System.out.println("Worker invoked using Lambda expression") );
	}

}
