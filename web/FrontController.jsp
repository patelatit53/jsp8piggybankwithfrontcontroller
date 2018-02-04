<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FrontController</title>
    </head>
    <body>
        <c:choose>
             <c:when test="${param['invoke'] == 'deposit'}">
                <jsp:forward page="deposit.jsp"/>
             </c:when>
             <c:when test="${param['invoke'] == 'withdraw'}">
                <jsp:forward page="withdraw.jsp"/>
            </c:when>
            <c:otherwise>
                <jsp:forward page="Welcome.jsp"/>
            </c:otherwise>  
        </c:choose>
    </body>
</html>
