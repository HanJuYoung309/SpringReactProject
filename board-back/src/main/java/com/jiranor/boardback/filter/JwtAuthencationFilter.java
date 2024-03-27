package com.jiranor.boardback.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.jiranor.boardback.provider.JwtProvider;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JwtAuthencationFilter extends OncePerRequestFilter{
    

    private final JwtProvider jwtProvider;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
      

    }

    private String parseBearerToken (HttpServletRequest request){

        String authrization= request.getHeader("Authorization");

        boolean hasAuthorization= org.springframework.util.StringUtils.hasText(authrization);
        if(!hasAuthorization) return  null;

        boolean isBearer= authrization.startsWith("Bearer");
        if(  !isBearer) return null;

        String token= authrization.substring(7);

        return token;

    }

}
