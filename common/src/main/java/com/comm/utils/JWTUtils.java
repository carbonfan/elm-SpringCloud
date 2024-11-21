package com.comm.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Component;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Component
public class JWTUtils {
    //token持续时间
    private static long time = 1000*60*60*24*7;
    private static final String TOKEN_SECRET = "elm-fjy";
    //生成Token
    public static String createToken(String userId,String userpw) {
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
        Map<String, Object> header = new HashMap<>(2);
        header.put("Type", "Jwt");
        header.put("alg", "HS256");
        try {
            String token = JWT.create()
                    .withHeader(header)
                    .withClaim("id", userId)
                    .withClaim("pw", userpw)
                    .withExpiresAt(new Date(System.currentTimeMillis() + time))
                    .withIssuedAt(new Date())
                    .sign(algorithm);
            return token;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    //验证Token
    public static byte[] tokenVerify(String token) {
        try {
            String[] split = token.split("\\.");
            for (int i = 0; i < split.length - 1; i++) {
                String s = split[i];
                byte[] decode = Base64.getDecoder().decode(s);
                return decode;
            }
        } catch (Exception e) {

        }
        return null;
    }
}
