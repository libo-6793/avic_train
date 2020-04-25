package com.avic.qf.pattern.prototype.demo;

/**
 * Created by LiBo.
 */
public class Client {
    public static void main(String[] args) {

//        ExamPaper examPaper = new ExamPaper();
//        System.out.println(examPaper);

        ExamPaper examPaper = (ExamPaper)BeanUtils.copy(new ExamPaper());
        System.out.println(examPaper);
    }
}
