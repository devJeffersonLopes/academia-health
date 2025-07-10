package service;

import javax.swing.JFrame;


public class NavegacaoService {
    
    public void trocarFrame(JFrame telaAtual, JFrame telaNova){
        telaNova.setVisible(true);
        telaAtual.dispose();
    }

    public void enviarObjetoParaFrame(JFrame telaAtual, JFrame telaNova, Object objeto){
        telaNova.setVisible(true);
        telaAtual.dispose();
    }
}
