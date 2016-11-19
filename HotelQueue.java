

	public class HotelQueue  {
		   int maxSize;
		   String[] cus_queue;
		   int rear;
		   public HotelQueue() {
			super();
			
		}
		   
		public HotelQueue(int maxSize) {
			this.maxSize = maxSize;
			cus_queue=new String[maxSize];
		}

		public void enqueue(String customer) throws OverFlow {
			   if(rear==maxSize){
				throw  new OverFlow();
			   }
			   else{
				   this.cus_queue[rear++]=customer;
			   }
		   }
		   public void dequeue() throws  UnderFlow{
			   String[] arr=new String[3];
			   if(rear==0){
				   throw  new UnderFlow();
			   }
			   
				   for(int i=0;i<rear-1;i++){
					   this.cus_queue[i]=this.cus_queue[i+1];
					   arr[i]=this.cus_queue[i];
				   }
			   
			   System.out.println("first three customers:");
			   for(String customer:arr){
				   System.out.println(customer);
			   }
		   }
		   class OverFlow extends RuntimeException{
			 public OverFlow(){
			   super("OverFlowException is not empty");
		   }
		 }
		   class UnderFlow extends RuntimeException{
				 public UnderFlow(){
				   super("UnderFlow is empty");
			   }
			 }
		   
		}

