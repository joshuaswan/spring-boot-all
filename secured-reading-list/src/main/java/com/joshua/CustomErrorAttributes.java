package com.joshua;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

/**
 * Created by joshua on 2017/10/26.
 */
@Component
public class CustomErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
        Map<String,Object> attributes = super.getErrorAttributes(requestAttributes,includeStackTrace);

        attributes.put("foo","bar");

        return attributes;
    }
}
