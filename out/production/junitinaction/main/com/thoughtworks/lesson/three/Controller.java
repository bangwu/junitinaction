package com.thoughtworks.lesson.three;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public interface Controller {
    Response processRequest(Request request) throws Exception;
    void addHandler(Request request, RequestHandler requestHandler);
}
