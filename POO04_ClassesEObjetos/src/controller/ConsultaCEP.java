package controller;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import util.Teclado;

public class ConsultaCEP {

	public static void main(String[] args) throws Exception {
		
		String cep;
		
		cep = Teclado.lerTexto("Digite o CEP?");
		
		final String URL_GET = "https://brasilapi.com.br/api/cep/v2/"+cep;

		// cliente HTTP
		HttpClient client = HttpClient.newHttpClient();
		
		// criar a requisição
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.timeout(Duration.ofSeconds(10))
				.uri(URI.create(URL_GET))
				.build();
		
		// enviando uma solicitação
	HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
	
	//imprime o conteúdo recebido
	System.out.println("Status: " + response.statusCode());
	System.out.println("Resultado: " + response.body());
	}
}
