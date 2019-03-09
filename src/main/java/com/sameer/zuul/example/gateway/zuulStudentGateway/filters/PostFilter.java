package com.sameer.zuul.example.gateway.zuulStudentGateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

public class PostFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "post";
    }

    public int filterOrder() {
        return 1;
    }

    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("Post filter called");
        return null;
    }
}
