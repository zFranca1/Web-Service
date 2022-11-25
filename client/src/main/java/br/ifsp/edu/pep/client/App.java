package br.ifsp.edu.pep.client;

import br.edu.ifsp.pep.client.servico.CertidaoNascimento;
import jakarta.xml.ws.Service;
import java.net.URL;
import javax.xml.namespace.QName;

public class App {
    public static void main( String[] args ) throws Exception    {
    	URL url = new URL("http://localhost:8085/servico/certidao?wsdl");
    	  
        QName qname = new QName("http://servico.server.pep.ifsp.edu.br/", "CertidaoNascimentoImpService");
  
        Service service = Service.create(url, qname);
  
        CertidaoNascimento certidao = service.getPort(CertidaoNascimento.class);
        int idade = certidao.calcularIdade("20/10/1981");
        String diaSemana = certidao.diaSemana("20/10/1981");        
        System.out.println("Idade: " + idade);
        System.out.println("Dia da semana: " + diaSemana);
    }


}
