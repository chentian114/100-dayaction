package com.chen.dayaction.designpattern.facade8;

import com.chen.dayaction.designpattern.facade8.theater.HomeTheaterFacade;

/**
 * Created by ChenTian on 2018/10/18.
 * 家庭电影院案例：一个家庭影院(Amplifier)，经过研究，需要包含DVD播放器(DvdPlayer)、
 *  投影机、自动屏幕(Screen)、环绕立方体声，甚至还有爆米花机。
 *  想看电影，必须要先执行一些任务：1、打开爆米花机2、开始爆米花3、将灯光调暗4、放下屏幕5、打开投影机
 *  6、将投影机设置在宽屏模式7、打开功放8、将功放设置为环绕立体声9、将功放音量调到中10、打开DVD播放器11、开始播放DVD。
 *
 * 通过实现一个提供更合理的接口外观类，你可以将一个复杂的子系统变得容易使用。
 * 门面对象是外界访问子系统内部的唯一通道.
 * 一般情况下，门面角色会将所有从客户端发来的请求委派到相应的子系统去，也就说该角色没有实际的业务逻辑，只是一个委托类。
 * 优点：
 *  减少系统的相互依赖；外界对象不需要依赖子系统内部类。
 *  提高了灵活性；子系统变化不影响门面对象，外界不会发生变化。
 *  提高安全性；外界只能访问门面上开通的方法。
 * 缺点：
 *  不符合开闭原则，可能需要修改门面角色代码。
 * 使用场景：
 *  为一个复杂的模块或子系统提供一个外界访问的接口。
 *  子系统相对独立，外界对子系统只要黑箱操作即可。
 * 注意事项：
 *  一般情况一个子系统只需要一个门面即可；当门面庞大到不能忍受可以进行拆分或者提供不同的访问接口可以创建多个门面。
 *  门面不参与子系统内的业务逻辑，当某个业务涉及到子系统中多个类时，可以建立一个封装类，封装后提供给门面类调用。
 */
public class HomeTheaterDemo {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.onPopper();
        homeTheaterFacade.pop();
        homeTheaterFacade.dim();
        homeTheaterFacade.down();
        homeTheaterFacade.onProjector();
        homeTheaterFacade.wideScreenMode();
        homeTheaterFacade.onAmp();
        homeTheaterFacade.setSurroundSound();
        homeTheaterFacade.setVolume(12);
        homeTheaterFacade.onDVD();
        homeTheaterFacade.play("中华小子");

        System.out.println("================");
        homeTheaterFacade.watchMovie("中华当家");
    }
}
