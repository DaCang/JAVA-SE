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
 * ʵ��Runable�ӿڣ�Ϊticket�����Ź���run
 * ���߳����е�����Ҫд��run�����У��������ֶ��̵߳ļ�ֵ��cpu�Ż��run�����е�������Ϊ�̣߳�
 * �̳�Thread��Ҳ��Ҫ��дrun����������Ҫִ�еĴ���д��run������
 *Thread t=new Thread();
 *t.start();
 *��ThreadԴ����
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
 *�������д�̳�Thread�õ��ķ���run();��Ϊ���ǵ��õĹ��캯�����޲ι��췽����
 *��ôThread���r���Բ����ڣ�����Thread���run���ò���Runable
 *�е�run()���ԣ�����д����Thread�е�run()���޷��������̵߳�����
 *
 *������ʵ��Runable�ӿں�дrun()��������run������д������
 *Ȼ��õ�����Ķ���
 *��ticket t=new ticket();
 *Thread t2=new Thread(t);
 *t2.start();
 *
 *����Thread���Դ�룬�����ܿ���������Runable�����run()������
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
            System.out.println("***********"+Thread.currentThread().getName()+"******��Ʊ*****"+num--);
             
             
             
        }else{
            break;
        }
        }
        }
     
    }
     
     
     
     
}