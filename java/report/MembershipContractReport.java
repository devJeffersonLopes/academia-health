package report;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import model.Member;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class MembershipContractReport {
    
    public static final String REPORT_PATH = "C:\\Users\\Jefferson\\Documents\\NetBeansProjects\\academiahealth\\src\\main\\resources\\reports\\membershipContract.jasper";
    
    public static void view(String memberFullName) {
        try{
            JasperPrint jasperPrint = generate(memberFullName);
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setTitle("Contrato de vínculo");
            viewer.setVisible(true);
            
        }catch(JRException e){
            throw new RuntimeException("Não foi possível exportar o arquivo para pdf", e);
        }
    }

    public static void exportToPdf(String memberFullName, String exportPath) {
        try{
            JasperPrint jasperPrint = generate(memberFullName);
            JasperExportManager.exportReportToPdfFile(jasperPrint, exportPath);
            
        }catch(JRException e){
            throw new RuntimeException("Não foi possível exportar o arquivo para pdf", e);
        }
    }

    public static JasperPrint generate(String memberFullName) throws JRException{
        
        InputStream jasperStream = MembershipContractReport.class.getResourceAsStream(REPORT_PATH);
                
        if(jasperStream == null){
            throw new JRException("Arquivo do contrato não encontrado: " +REPORT_PATH);
        }
        
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("memberFullName", memberFullName);
        
        return JasperFillManager.fillReport(jasperStream, parameters, new JREmptyDataSource());
        
    }

}
