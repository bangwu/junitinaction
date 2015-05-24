package com.thoughtworks.lesson.three;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public class TestDefaultController {

    private DefaultController defaultController;
    private Request request;
    RequestHandler requestHandler;

    @Before
    public void initController(){
        defaultController = new DefaultController();
        request = new SampleRequest();
        requestHandler = new SampleRequestHandler();
        defaultController.addHandler(request, requestHandler);
    }

    @Test
    public void testAddHandler() throws Exception {
        RequestHandler requestHandler1 = defaultController.getRequestHandler(request);
        Assert.assertSame(requestHandler1, requestHandler);

    }

    @Test
    public void testController(){
        Response response = defaultController.processRequest(request);
        Assert.assertSame(response.getClass(), SampleResponse.class);
    }

    private class SampleRequest implements Request {
        @Override
        public String getName() {
            return "test";
        }
    }

    private class SampleRequestHandler implements RequestHandler {
        @Override
        public Response process(Request request) throws Exception {
            return new SampleResponse();
        }
    }

    private class SampleResponse implements Response {
    }
}
