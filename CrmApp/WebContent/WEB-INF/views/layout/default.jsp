<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="dec" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" sizes="16x16" href='<c:url value="/plugins/images/favicon.png" />'>
    <title>
    	<dec:title />
    </title>
    <jsp:include page="/WEB-INF/views/decorators/header.jsp" />
    <dec:head />
</head>

<body>
    <!-- Preloader -->
    <div class="preloader">
        <div class="cssload-speeding-wheel"></div>
    </div>
    <div id="wrapper">
        <!-- Navigation -->
        <jsp:include page="/WEB-INF//views/decorators/navbar.jsp" />
        <!-- Left navbar-header -->
        <jsp:include page="/WEB-INF//views/decorators/sidebar.jsp" />
        <!-- Left navbar-header end -->
        <!-- Page Content -->
        <div id="page-wrapper">
            <dec:body />
        </div>
        <!-- /.container-fluid -->
        <jsp:include page="/WEB-INF//views/decorators/footer.jsp" />
        
        <dec:getProperty property="page.scripts" />
    </div>
</body>

</html>