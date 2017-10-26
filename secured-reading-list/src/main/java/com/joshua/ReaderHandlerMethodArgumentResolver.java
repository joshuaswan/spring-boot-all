package com.joshua;

import org.springframework.core.MethodParameter;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Created by joshua on 2017/10/26.
 */

@Component
public class ReaderHandlerMethodArgumentResolver implements org.springframework.web.method.support.HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return Reader.class.isAssignableFrom(parameter.getParameterType());
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        Authentication authentication = (Authentication) webRequest.getUserPrincipal();
        return authentication != null && authentication.getPrincipal() instanceof Reader ? authentication.getPrincipal() : null;
    }
}
