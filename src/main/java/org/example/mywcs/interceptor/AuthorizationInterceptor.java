package org.example.mywcs.interceptor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author：hb
 * @Package：org.example.mywcs.interceptor
 * @Project：my-wcs
 * @Date：2/12/2024 9:54 am
 */
public class AuthorizationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String header = request.getHeader("authorization");
        if (header != null){
            JWTVerifier build = JWT.require(Algorithm.HMAC256("hub-in")).build();
            DecodedJWT verify = build.verify(header);
            String password = verify.getClaim("password").asString();
            String string = verify.getClaim("userName").asString();

            return true;
        }
        return false;

    }
}
