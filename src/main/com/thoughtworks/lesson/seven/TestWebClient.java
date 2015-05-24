package com.thoughtworks.lesson.seven;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public class TestWebClient extends WebClient{
    private MockHttpURLConnection httpURLConnection;

    public void setHttpURLConnection(MockHttpURLConnection httpURLConnection) {
        this.httpURLConnection = httpURLConnection;
    }

    public MockHttpURLConnection getHttpURLConnection() {
        return httpURLConnection;
    }
}
