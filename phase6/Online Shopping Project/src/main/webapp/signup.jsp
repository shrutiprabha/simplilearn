<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/signup-style.css">
<title>Signup</title>
</head>
<body>
<div id='container'>
  <div class='signup'>
    <form action="signupAction.jsp" method="post">
    <input type="text" name="name" placeholder="Enter Name" required>
    <input type="email" name="email" placeholder="Enter Email" required>
    <input type="number" name="mobileNumber" placeholder="Enter Mobile Number" required>
    <select name="securityQuestion" required>
    <option value="What was ur first car?">What was ur first car?</option>
     <option value="What is ur first pet name?">What is ur first pet name?</option>
      <option value="What elementary school did you attend?">What elementary school did you attend?</option>
       <option value="What is the name of the town u were born?">What is the name of the town u were born?</option>
    </select>
    <input type="text" name="answer" placeholder="Enter Answer" required>
    <input type="password" name="password" placeholder="Enter Password" required>
    <i class="far fa-eye" id="togglePassword" ></i>
    <input type="submit" value="signup">
    </form>
      <h2><a href="login.jsp">Login</a></h2>
  </div>
  <div class='whysign'>
<%
String msg=request.getParameter("msg");
if("valid".equals(msg))
{
%>
<h1>Successfully Updated</h1>
<%} %>
<%
if("invalid".equals(msg))
{
%>
<h1>Some thing Went Wrong! Try Again !</h1>
<%} %>
    <h2>FoodieSoodie</h2>
    <p>The FoodieSoodie System is the application that allows the users to order online without going to the Restaurant.</p>
  </div>
</div>

</body>
</html>