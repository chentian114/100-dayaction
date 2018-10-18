package com.chen.dayaction.designpattern.facade8.theater;

/**
 * Created by ChenTian on 2018/10/18.
 */
public class Theater {
    private Amp amp = new Amp();  //音响
    private Dvd dvd = new Dvd();  //DVD
    private Lights lights = new Lights();  //灯光
    private Popper popper = new Popper();  //爆米花机
    private Projector projector = new Projector();  //放映机
    private Screen screen = new Screen();  //屏幕

    public void watchMovie(String movie){
        popper.on();
        popper.pop();
        lights.dim();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setSurroundSound();
        amp.setVolume(12);
        dvd.on();
        dvd.play(movie);
    }
}
