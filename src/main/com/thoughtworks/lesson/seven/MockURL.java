package com.thoughtworks.lesson.seven;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLStreamHandler;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public class MockURL{
    private MockHttpURLConnection upOpenConnection;

    public void setupOpenConnection(MockHttpURLConnection upOpenConnection) {
        this.upOpenConnection = upOpenConnection;
    }

    public MockHttpURLConnection getUpOpenConnection() {
        return upOpenConnection;
    }

    public void setUpOpenConnection(MockHttpURLConnection upOpenConnection) {
        this.upOpenConnection = upOpenConnection;
    }
}
