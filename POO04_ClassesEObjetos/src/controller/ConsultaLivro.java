package controller;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import util.Teclado;

public class ConsultaLivro {

	public static void main(String[] args) throws Exception {
		
		String isbn;
		
		// EXEMPLO ISBN 9788545702870
		isbn = Teclado.lerTexto("Digite o Código ISBN do Livro?");
		
		final String URL_GET = "https://brasilapi.com.br/api/isbn/v1/"+isbn;

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
	//imprimir o conteúdo recebido

	System.out.println(response.statusCode());
	System.out.println(response.body());
	}
}
