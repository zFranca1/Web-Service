package br.edu.ifsp.pep.server.main;

import br.edu.ifsp.pep.server.servico.CertidaoNascimentoImp;
import jakarta.xml.ws.Endpoint;

public class App {
     public static void main( String[] args ) {
    	CertidaoNascimentoImp certidaoNascimento = new CertidaoNascimentoImp();
        Endpoint.publish("http://localhost:8085/servico/certidao", certidaoNascimento);
        System.out.println("Servico publicado com sucesso");
    }

}
