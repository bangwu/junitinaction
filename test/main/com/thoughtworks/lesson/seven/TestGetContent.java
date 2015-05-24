package com.thoughtworks.lesson.seven;

import org.junit.Test;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public class TestGetContent {
    @Test
    public void testGetContentOk() throws Exception {
        MockHttpURLConnection mockHttpURLConnection = new MockHttpURLConnection();
        mockHttpURLConnection.setUpGetInputStream("It works".getBytes());
        TestWebClient testWebClient = new TestWebClient();
        testWebClient.setHttpURLConnection(mockHttpURLConnection);
    }
}
