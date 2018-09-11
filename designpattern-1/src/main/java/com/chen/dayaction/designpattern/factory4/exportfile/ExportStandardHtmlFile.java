package com.chen.dayaction.designpattern.factory4.exportfile;

/**
 * Created by ChenTian on 2018/9/11.
   导出格式为HTML，结构为标准报表的导出文件
 */
public class ExportStandardHtmlFile extends ExportFile {
    @Override
    public void export() {
        System.out.println("导出格式为HTML，结构为标准报表的导出文件");
    }
}
