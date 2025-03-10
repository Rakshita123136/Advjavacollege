<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="obj" class = "javabean.User"/>
    <jsp:setProperty name = "obj" property="*"/>
Welcome , <jsp:getProperty name="obj" property="name"/>