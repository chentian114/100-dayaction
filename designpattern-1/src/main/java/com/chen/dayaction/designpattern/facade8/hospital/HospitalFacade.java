package com.chen.dayaction.designpattern.facade8.hospital;

/**
 * 医院前台接待处
 */
public class HospitalFacade {
    private Registration registration = new Registration();
    private Outpatient outpatient = new Outpatient();
    private Payment payment = new Payment();
    private Assay assay = new Assay();
    private Medicine medicine = new Medicine();
    private SeeADocketContext seeADocketContext = new SeeADocketContext();

    public void seeDocket(){
        seeADocketContext.seeDoctor();
    }
    // 挂号
    public void reg(){
        registration.reg();
    }
    //门诊
    public void seeADocktor(){
        outpatient.seeADocktor();
    }
    //化验
    public void assay(){
        assay.assay();
    }
    //拿药
    public void takeMedicine(){
        medicine.takeMedicine();
    }
}
