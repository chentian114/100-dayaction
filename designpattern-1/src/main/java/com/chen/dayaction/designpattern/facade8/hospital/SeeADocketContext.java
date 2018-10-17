package com.chen.dayaction.designpattern.facade8.hospital;

public class SeeADocketContext {
    private Registration registration = new Registration();
    private Outpatient outpatient = new Outpatient();
    private Payment payment = new Payment();
    private Assay assay = new Assay();
    private Medicine medicine = new Medicine();

    public void seeDoctor(){
        System.out.println("开始看病流程。。。");
        registration.reg();
        outpatient.seeADocktor();
        payment.pay();
        assay.assay();
        outpatient.seeADocktor();
        medicine.takeMedicine();
        System.out.println("完成看病。");
    }
}
