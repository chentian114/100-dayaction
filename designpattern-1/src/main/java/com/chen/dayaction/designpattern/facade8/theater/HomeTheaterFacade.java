package com.chen.dayaction.designpattern.facade8.theater;

/**
 * Created by ChenTian on 2018/10/18.
 * 家庭影院控制器
 */
public class HomeTheaterFacade {
    private Amp amp = new Amp();  //音响
    private Dvd dvd = new Dvd();  //DVD
    private Lights lights = new Lights();  //灯光
    private Popper popper = new Popper();  //爆米花机
    private Projector projector = new Projector();  //放映机
    private Screen screen = new Screen();  //屏幕
    private Theater theater = new Theater(); //影院

    public void watchMovie(String movie){
        theater.watchMovie(movie);
    }

    public void onPopper(){
        popper.on();
    }

    public void pop(){
        popper.pop();
    }

    public void dim(){
        lights.dim();
    }

    public void down(){
        screen.down();
    }

    public void onProjector(){
        projector.on();
    }

    public void wideScreenMode(){
        projector.wideScreenMode();
    }

    public void onAmp(){
        amp.on();
    }

    public void setSurroundSound(){
        amp.setSurroundSound();
    }

    public void setVolume(int vol){
        amp.setVolume(10);
    }

    public void onDVD(){
        dvd.on();
    }

    public void play(String movie){
        dvd.play(movie);
    }


}
