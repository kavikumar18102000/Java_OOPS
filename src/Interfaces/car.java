package Interfaces;

public class car implements Engine,Brake,Media_player{

    int a=10;

    @Override
    public void brake() {
        System.out.println("I am applying the break");
    }

    @Override
    public void accc() {
        System.out.println("I am getting accelerated...");

    }

    @Override
    public void start() {
        System.out.println("I am gonna play a song..");

    }

//    public int start(){ --> can't be used..
//        return 1;
//    }



    @Override
    public void stop() {
        System.out.println("Shall I stop playing the class..");

    }
}
