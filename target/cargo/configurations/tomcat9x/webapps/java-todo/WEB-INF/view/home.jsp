<%@ taglib prefix="c"  uri = "http://java.sun.com/jsp/jstl/core" %>
       <html>
       <head>
           <title>Java</title>
       </head>
       <body>
       <div align="center">
       <c:url var="itemUrl" value="/items"/>
       <h2><a href="${itemUrl}"> Show My Task </a></h2>
         </div>
         </body>
       </html>