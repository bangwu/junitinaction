package com.thoughtworks.lesson.three;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public class DefaultController implements Controller {

    private Map<String, RequestHandler> requestHandlers = new HashMap();

    @Override
    public Response processRequest(Request request){
        Response response = null;
        try{
            response = getRequestHandler(request).process(request);
        }catch (Exception e){
            response = new ErrorResponse(request, e);
        }
        return response;
    }

    protected RequestHandler getRequestHandler(Request request) throws Exception{
        if(!requestHandlers.containsKey(request.getName())){
            throw new Exception("this request is not register a request handler");
        }
        return requestHandlers.get(request.getName());
    }

    @Override
    public void addHandler(Request request, RequestHandler requestHandler) {
        if(requestHandlers.containsKey(request.getName())){
            throw new RuntimeException("A request handle "+request.getName()+" has been registered");
        }else {
            requestHandlers.put(request.getName(), requestHandler);
        }
    }
}
