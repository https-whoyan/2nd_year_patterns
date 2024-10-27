package Lab1;

interface Handler {
    void setNext(Handler handler);
    void handleRequest(String request);
}