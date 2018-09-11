package com.chen.dayaction.designpattern.factory4.exportfile;

/**
 * Created by ChenTian on 2018/9/11.
 * 创建导出文件的抽象工厂类
 */
public abstract class ExportFactory {
    public abstract ExportFile factoryMethod(ExportFileType type);
}
