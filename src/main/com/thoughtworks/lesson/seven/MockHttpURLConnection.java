package com.thoughtworks.lesson.seven;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public class MockHttpURLConnection extends HttpURLConnection{

    private  URL url;
    private byte[] upGetInputStream;

    /**
     * Constructor for the HttpURLConnection.
     *
     * @param url the URL
     */
    protected MockHttpURLConnection(URL url) {
        super(url);
        this.url = url;
    }

    @Override
    public void disconnect() {

    }

    @Override
    public boolean usingProxy() {
        return false;
    }

    @Override
    public void connect() throws IOException {

    }

    public void setUpGetInputStream(byte[] upGetInputStream) {
        this.upGetInputStream = upGetInputStream;
    }

    public byte[] getUpGetInputStream() {
        return upGetInputStream;
    }
}
