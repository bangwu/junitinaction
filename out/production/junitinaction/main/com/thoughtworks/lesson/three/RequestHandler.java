package com.thoughtworks.lesson.three;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public interface RequestHandler {
    Response process(Request request) throws Exception;
}
