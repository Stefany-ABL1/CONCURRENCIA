public class Runner {
    public static void main(String [] args){
        RunExample hilo = new RunExample();

        Thread thOne = new Thread(hilo);
        Thread thTwo = new Thread(hilo);
        Thread thThree = new Thread(hilo);

        thOne.start();
        thTwo.start();
        thThree.start();
    }
}
