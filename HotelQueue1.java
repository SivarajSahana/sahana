/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class HotelQueue1 {
    
    private String data[];
            int front, rear;
    public HotelQueue1(){
        data = new String[ 7 ];
        front = rear = -1;
    }
    public HotelQueue1( int size ){
        if( size <= 0 )
            throw new IllegalArgumentException();
        data = new String[ size ];
        front = rear = -1;
    }
    public boolean isEmpty(){
        return front == -1;
    }
    public void enqueue( String data ){
        if( rear == this.data.length-1 ){
            throw new OverflowException();
        }
        this.data[ ++rear ] = data;
        if( front == -1 ) front = 0;
    }
    public String dequeue( ){
       this.data= Hotel.recordDetailstoArray();
        if( isEmpty() ){
            throw new UnderflowException();
        }
        String data1 = this.data[ front++ ];
        if( front > rear ){
            front = rear = -1;
        }
        System.out.println(data);
        return data1;
        
    }
    public void printNames(){
        String[] data1=new String[3];
        for(int i=0;i<3;i++){
            data1[i]=dequeue();
        }
        System.out.println("first three customers:");
        for(String str:data1){
            System.out.println(str);
        }
    }
}

class OverflowException extends RuntimeException{
    public OverflowException(){
        super("Overflow exception. No memory left");
    }
}
class UnderflowException extends RuntimeException{
    public UnderflowException(){
        super( "Underflow exception. No nodes left" );
    }
}

