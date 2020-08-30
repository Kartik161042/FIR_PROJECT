<%@page import="com.FIR.DAO.UserDao"%>
<%@page import="com.FIR.Beans.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.FIR.Beans.UserType"%>
<%@page import="com.FIR.Beans.UserDetails"%>

<%!

private String email;
private String username;
private String password;
private UserDetails userDetails;
private User user;
private UserType userType;
private String name;
private int age;
private String mobile;
private String address;
private String gender;
private String adhar_no;
UserDao dao;

%>

<%
	email = request.getParameter("email");
username = request.getParameter("username");
password = request.getParameter("password");
name = request.getParameter("name");
age = Integer.valueOf(request.getParameter("age"));
mobile = request.getParameter("mobile");
address = request.getParameter("address");
gender = request.getParameter("gender");
adhar_no = request.getParameter("adhaar");

user = new User();
userDetails = new UserDetails();

user.setEmail(email);
user.setPassword(password);
user.setUsername(username);

userDetails.setAddress(address);
userDetails.setAdhar_no(adhar_no);
userDetails.setAge(age);
userDetails.setGender(gender);
userDetails.setMobile(mobile);
userDetails.setName(name);

dao = new UserDao();
user.setId(dao.getNewId());
userDetails.setId(dao.getNewId());

user.setUserDetails(userDetails);

dao.addUser(user);


%>