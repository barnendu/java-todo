<%@ taglib prefix="c"  uri = "http://java.sun.com/jsp/jstl/core" %>
       <html>
       <head>
           <title>Java</title>
       </head>
       <body>
       <div align="center">
       <table>
       <tr>
       <td><label>ID</label></td>
       <td><c:out value="${todoItem.id}"/></td>
       </tr>
       <tr>
              <td><label>Title</label></td>
              <td><c:out value="${todoItem.title}"/></td>
       </tr>
             <tr>
                    <td><label>Dead Line</label></td>
                    <td><c:out value="${todoItem.deadLine}"/></td>
                    </tr>

                 <tr>
                        <td><label>Details</label></td>
                        <td><c:out value="${todoItem.details}"/></td>
                  </tr>
          <c:url var="items" value="/items"/>
        <tr><td></td><td><a href="${items}">Back</a></td></tr>
       </table>

         </div>
         </body>
       </html>