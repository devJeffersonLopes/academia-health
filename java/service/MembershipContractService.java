package service;

import report.MembershipContractReport;


public class MembershipContractService {
    
    public void view(String memberFullName){
        MembershipContractReport.view(memberFullName);
    }
    
    public void exportToPdf(String memberFullName, String exportPath){
        MembershipContractReport.exportToPdf(memberFullName, exportPath);
    }
    
}