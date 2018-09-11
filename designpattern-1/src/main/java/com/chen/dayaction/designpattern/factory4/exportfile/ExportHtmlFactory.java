package com.chen.dayaction.designpattern.factory4.exportfile;

/**
 * Created by ChenTian on 2018/9/11.
 * 创建导出格式为HTML的导出文件工厂方法类
 */
public class ExportHtmlFactory extends ExportFactory {
    @Override
    public ExportFile factoryMethod(ExportFileType type) {
        if(ExportFileType.FINANCIAL == type){
            return new ExportFinancialHtmlFile();
        }else if(ExportFileType.STANDARD == type){
            return  new ExportStandardHtmlFile();
        }
        return null;
    }
}
