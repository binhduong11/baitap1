/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

import java.util.Date;

/**
 *
 * @author FPT
 */
public class Certificate {
    private int CertificateID;
    private String CertificateName;
    private int CertificateRank;
    private Date CertificateDate;

    public Certificate(int CertificateID, String CertificateName, int CertificateRank, Date CertificateDate) {
        this.CertificateID = CertificateID;
        this.CertificateName = CertificateName;
        this.CertificateRank = CertificateRank;
        this.CertificateDate = CertificateDate;
    }

    public int getCertificateID() {
        return CertificateID;
    }

    public void setCertificateID(int CertificateID) {
        this.CertificateID = CertificateID;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String CertificateName) {
        this.CertificateName = CertificateName;
    }

    public int getCertificateRank() {
        return CertificateRank;
    }

    public void setCertificateRank(int CertificateRank) {
        this.CertificateRank = CertificateRank;
    }

    public Date getCertificateDate() {
        return CertificateDate;
    }

    public void setCertificateDate(Date CertificateDate) {
        this.CertificateDate = CertificateDate;
    }
    
    
}
