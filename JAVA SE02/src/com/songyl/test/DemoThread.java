package com.songyl.test;
 
 
 
public class DemoThread {
     
     
    public static void main(String[] args) {
         
        Ticket t=new Ticket();
        Thread window01=new Thread(t);
        Thread window02=new Thread(t);
        Thread window03=new Thread(t);
        Thread window04=new Thread(t);
        Thread window05=new Thread(t);
         
        window01.start();
        window02.start();
        window03.start();
        window04.start();
        window05.start();

 
         
         
         
    }
     
 
}
 
 
 
/**
 * 实现Runable接口，为ticket类扩张功能run
 * 多线程运行的任务，要写在run方法中，才能体现多线程的价值，cpu才会把run方法中的任务视为线程，
 * 继承Thread类也是要重写run方法，把需要执行的代码写入run方法中
 *Thread t=new Thread();
 *t.start();
 *在Thread源码中
 *private Runable r;
 *
 *   Thread(){
 *
 *          }
 *
 *Thread(Runable r){
 *  this.r=r;
 *}
 *
 *public void start(){
 *   this.run();
 *}
 *
 *public void run(){
 *
 *   r.run();
 *
 *}
 *
 *如果不重写继承Thread得到的方法run();因为我们调用的构造函数是无参构造方法，
 *那么Thread类的r属性不存在，所以Thread类的run调用不到Runable
 *中的run()所以，不重写父类Thread中的run()则无法运行新线程的任务
 *
 *当子类实现Runable接口后覆写run()方法，在run方法中写入任务
 *然后得到子类的对象，
 *如ticket t=new ticket();
 *Thread t2=new Thread(t);
 *t2.start();
 *
 *根据Thread类的源码，我们能看出，调用Runable子类的run()方法的
 *
 *
 */

class Ticket implements Runnable{
   
    int num=10;
    Object obj=new Object();
 
    @Override
    public void run() {
         
         
             
         
        while(true){
            synchronized(obj){
            if(num>0){
                 
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println("***********"+Thread.currentThread().getName()+"******出票*****"+num--);
             
             
             
        }else{
            break;
        }
        }
        }
     
    }
     
     
     
     
}