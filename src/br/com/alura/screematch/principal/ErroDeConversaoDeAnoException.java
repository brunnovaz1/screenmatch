package br.com.alura.screematch.principal;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String message;

    public ErroDeConversaoDeAnoException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
